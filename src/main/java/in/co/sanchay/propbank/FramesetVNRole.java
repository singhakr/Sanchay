/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package in.co.sanchay.propbank;

import in.co.sanchay.GlobalProperties;
import in.co.sanchay.corpus.ssf.features.impl.FeatureStructureImpl;
import in.co.sanchay.xml.dom.SanchayDOMElement;
import org.dom4j.dom.DOMElement;

/**
 *
 * @author anil
 */
public class FramesetVNRole extends FramesetAtom implements SanchayDOMElement {

    public FramesetVNRole()
    {
        leafNode = true;
        
        attributes = new FeatureStructureImpl();

        attributes.addAttribute(GlobalProperties.getIntlString("vncls"), "");
        attributes.addAttribute(GlobalProperties.getIntlString("vntheta"), "");
    }

    @Override
    public org.dom4j.dom.DOMElement getDOMElement()
    {
        DOMElement domElement = super.getDOMElement();

        domElement.setName(GlobalProperties.getIntlString("vnrole"));

        return domElement;
    }
}
