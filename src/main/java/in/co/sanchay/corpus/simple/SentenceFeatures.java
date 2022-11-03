/*
 * Created on Sep 24, 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package in.co.sanchay.corpus.simple;

import in.co.sanchay.corpus.Sentence;
import in.co.sanchay.corpus.parallel.APCData;
import in.co.sanchay.corpus.parallel.APCProperties;
import in.co.sanchay.corpus.*;
import in.co.sanchay.corpus.parallel.*;

/**
 *  @author Anil Kumar Singh Kumar Singh
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public interface SentenceFeatures {

    public int countSbtWords();

    public int getWordSbt(int num);

    public int setWordSbt(int ind, int wd); // sentence index ,  table index

//	public int getWordSbtAllCount();
	
//	public int getWordSbtAll(int num);
	
//	public void setWordSbtAll(int wd );// table index

    public int getSentenceLength();

    public void setSentenceLength(int senlen);

    public int getSignature();

    public void setSignature(int sg);

    public void setWeightedLength(APCProperties apcpro, char type);

    public int getWeightedLength();

    public double getCommonWords(Sentence sen, APCData apcdata);

    public double getCommonHypernyms(Sentence sen, APCData apcdata);

    public double get_Phntc_Num_Match(Sentence sen, APCData apcdata);

    public double getCommonSynonyms(Sentence sen, APCData apcdata);

}
