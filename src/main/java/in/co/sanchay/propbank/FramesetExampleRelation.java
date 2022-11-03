/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package in.co.sanchay.propbank;

import in.co.sanchay.GlobalProperties;
import in.co.sanchay.xml.dom.SanchayDOMElement;
import org.dom4j.dom.DOMElement;

/**
 *
 * @author anil
 */
public class FramesetExampleRelation extends FramesetAtom implements SanchayDOMElement {

    public FramesetExampleRelation()
    {
        super();

        leafNode = true;

        attributes.addAttribute(GlobalProperties.getIntlString("f"), "");
    }

    @Override
    public org.dom4j.dom.DOMElement getDOMElement()
    {
        DOMElement domElement = super.getDOMElement();

        domElement.setName(GlobalProperties.getIntlString("rel"));

        return domElement;
    }
}
