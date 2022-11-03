/*
 * OtherFeatures.java
 *
 * Created on September 5, 2008, 4:27 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package in.co.sanchay.mlearning.feature.extraction;

import in.co.sanchay.corpus.ssf.tree.SSFNode;
import in.co.sanchay.corpus.ssf.*;
import in.co.sanchay.corpus.ssf.features.*;
import in.co.sanchay.corpus.ssf.tree.*;
import in.co.sanchay.corpus.ssf.features.impl.*;

/**
 *
 * @author Anil Kumar Singh
 */
public interface OtherFeatures {
    
    public boolean isSentenceStart(SSFNode node);
    public boolean isNumber(SSFNode node);
    public boolean isFourNumbers(SSFNode node);
    public int characterCount(SSFNode node);
}
