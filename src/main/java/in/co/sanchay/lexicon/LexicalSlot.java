/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package in.co.sanchay.lexicon;

import java.io.PrintStream;
import java.util.List;

import in.co.sanchay.corpus.ssf.features.FeatureStructure;
import in.co.sanchay.corpus.ssf.features.impl.FeatureStructureImpl;
import in.co.sanchay.xml.dom.SanchayDOMElement;
import org.dom4j.dom.DOMElement;
import org.w3c.dom.Element;

/**
 *
 * @author anil
 */
public class LexicalSlot implements SanchayDOMElement {
    
    protected FeatureStructure features;

    public LexicalSlot()
    {
        features = new FeatureStructureImpl();
    }

    /**
     * @return the features
     */
    public FeatureStructure getFeatures()
    {
        return features;
    }

    @Override
    public DOMElement getDOMElement()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getXML()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void readXML(Element domElement)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void printXML(PrintStream ps)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String makeString()
    {
        String str = "[";

        List names = features.getAttributeNames();

        int count = names.size();

        for (int i = 0; i < count; i++)
        {
            String name = (String) names.get(i);
            String value = (String) features.getAttributeValue(name).makeString();

            str += name + "=" + value + " ";
        }

        str = str.trim();

        str += "] ";

        return str;
    }
}
