/*
 * BlogTags.java
 *
 * Created on December 9, 2007, 11:00 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package in.co.sanchay.ontology.writing;

import in.co.sanchay.GlobalProperties;
import in.co.sanchay.xml.dom.SanchayDOMElement;
import org.dom4j.dom.DOMAttribute;
import org.dom4j.dom.DOMElement;

/**
 *
 * @author anil
 */
public class Tags extends Categories implements SanchayDOMElement {
    
    /** Creates a new instance of BlogTags */
    public Tags()
    {
        super();
    }

    public DOMElement getDOMElement()
    {
        DOMElement domElement = super.getDOMElement();
        DOMAttribute attribType = new DOMAttribute(new org.dom4j.QName(GlobalProperties.getIntlString("type")), GlobalProperties.getIntlString("tag"));
        domElement.add(attribType);
        
        return domElement;
    }
}
