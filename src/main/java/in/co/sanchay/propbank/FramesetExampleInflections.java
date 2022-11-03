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
public class FramesetExampleInflections extends FramesetAtom implements SanchayDOMElement {

    public FramesetExampleInflections()
    {
        super();

        leafNode = true;

        attributes.addAttribute(GlobalProperties.getIntlString("person"), GlobalProperties.getIntlString("ns"));
        attributes.addAttribute(GlobalProperties.getIntlString("tense"), GlobalProperties.getIntlString("ns"));
        attributes.addAttribute(GlobalProperties.getIntlString("aspect"), GlobalProperties.getIntlString("ns"));
        attributes.addAttribute(GlobalProperties.getIntlString("voice"), GlobalProperties.getIntlString("ns"));
        attributes.addAttribute(GlobalProperties.getIntlString("form"), GlobalProperties.getIntlString("ns"));
    }

    @Override
    public org.dom4j.dom.DOMElement getDOMElement()
    {
        DOMElement domElement = super.getDOMElement();

        domElement.setName(GlobalProperties.getIntlString("inflection"));

        return domElement;
    }
}
