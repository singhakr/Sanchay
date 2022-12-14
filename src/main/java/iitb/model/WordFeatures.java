package iitb.model;
import iitb.crf.DataSequence;
import iitb.model.*;
/**
 *
 * @author Sunita Sarawagi
 *
 */ 

public class WordFeatures extends FeatureTypes {
    int stateId;
    int statePos;
    Object token;
    int tokenId;
    WordsInTrainExt dict;
    int _numWordStatePairs;
    public static int RARE_THRESHOLD=0;
    public WordFeatures(FeatureGenImpl m, WordsInTrainExt d) {
	super(m);
	dict = d;
    }
    private void nextStateId() {       
	stateId = dict.nextStateWithWord(token, stateId);
	statePos++;
    }
    public boolean startScanFeaturesAt(DataSequence data, int prevPos, int pos) {
	stateId = -1;
	if (dict.count(data.x(pos).toString()) > RARE_THRESHOLD) {
	    token = (data.x(pos).toString());
	    tokenId = dict.getIndex(token);
	    statePos = -1;
	    nextStateId();
	    return true;
	} 
	return false;
    }
    public boolean hasNext() {
	return (stateId != -1);
    }
    public void next(FeatureImpl f) {
        if (featureCollectMode())
            setFeatureIdentifier(tokenId*model.numStates()+stateId,stateId,"W_"+token,f);
        else
            setFeatureIdentifier(tokenId*model.numStates()+stateId,stateId,token,f); 
	f.yend = stateId;
	f.ystart = -1;
	f.val = 1;
	nextStateId();
    }
	/* (non-Javadoc)
	 * @see iitb.Model.FeatureTypes#maxFeatureId()
	 */
	public int maxFeatureId() {
		return dict.dictionaryLength()*model.numStates();
	}
};


