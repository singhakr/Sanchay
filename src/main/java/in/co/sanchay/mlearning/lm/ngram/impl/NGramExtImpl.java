/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package in.co.sanchay.mlearning.lm.ngram.impl;

import in.co.sanchay.factory.Factory;
import in.co.sanchay.mlearning.lm.ngram.NGramExt;
import in.co.sanchay.mlearning.lm.ngram.NGramLite;

/**
 *
 * @author Anil Kumar Singh
 */
public class NGramExtImpl extends NGramImpl implements NGramExt {

    protected int normalizerIncrement;

    public static class NGramLiteFactory implements Factory<NGramLite> {
        @Override
        public NGramLite createInstance() {
            return new NGramLiteImpl();
        }

    }
    
    public static Factory getFactory()
    {
        return new NGramLiteImpl.NGramLiteFactory();
    }

    /**
     * @return the normalizerIncrement
     */
    public int getNormalizerIncrement() {
        return normalizerIncrement;
    }

    /**
     * @param normalizerIncrement the normalizerIncrement to set
     */
    public void setNormalizerIncrement(int normalizerIncrement) {
        this.normalizerIncrement = normalizerIncrement;
    }

}
