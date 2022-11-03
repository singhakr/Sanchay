/*
 * WindowFeatures.java
 *
 * Created on June 19, 2008, 10:22 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package in.co.sanchay.mlearning.feature.extraction;

import in.co.sanchay.corpus.ssf.SSFSentence;
import in.co.sanchay.corpus.ssf.tree.SSFNode;
import in.co.sanchay.corpus.ssf.*;

import in.co.sanchay.corpus.ssf.tree.*;
import java.util.List;
//import sanchay.corpus.ssf.tree.impl.*;

/**
 *
 * @author Anil Kumar Singh
 */
public interface  WindowFeatures {
    public static final int TAG_FLAG = 1;
    public static final int WORD_FLAG = 1;
    public static final int WINDOW_DIRECTION_LEFT = 0;
    public static final int WINDOW_DIRECTION_RIGHT = 1;
    public static final int WINDOW_DIRECTION_BOTH = 2;
    public static final String CHUNK_BOUNDARY_B = "B";
    public static final String CHUNK_BOUNDARY_I = "I";
    public static final String CHUNK_BOUNDARY_O = "O";
    public static final int OUTPUT_FORMAT_YAMCHA = 1;
    public static final int OUTPUT_FORMAT_LIBSVM = 2;
    public static final int OUTPUT_FORMAT_MAXENT = 3;
    public static final int OUTPUT_FORMAT_ARFF = 4;
    
    
    /**
     * Creates a new instance of WindowFeatures
     */
    public List getWordWindow(SSFSentence ssfSentence, int wordIndex, int windowSize, int direction , int bool);
    public List getCharWindow(SSFNode ssfNode, int charIndex, int windowSize, int direction);
    public List getChunkWindow(SSFSentence ssfSentence, int wordIndex, int windowSize, int direction);
    public List getChunkInformation(SSFSentence ssfSentence);
    public List getWordFeatureWindow(SSFSentence ssfSentence, int wordIndex, int windowSize, int direction, String featureName);
    public List getChunkFeatureWindow(SSFSentence ssfSentence, int wordIndex, int windowSize, int direction, String featureName);
   // public String[] getDefaultWindow();    
}
