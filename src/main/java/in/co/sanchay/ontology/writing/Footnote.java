/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package in.co.sanchay.ontology.writing;

import java.io.PrintStream;

import in.co.sanchay.GlobalProperties;
import in.co.sanchay.xml.dom.SanchayDOMElement;
import org.dom4j.dom.DOMElement;
import org.w3c.dom.NodeList;

/**
 *
 * @author anil
 */
public class Footnote implements SanchayDOMElement {
    
    public Footnote()
    {
    }

    public Footnote(String n)
    {
    }

    public org.dom4j.dom.DOMElement getDOMElement()
    {
        DOMElement domElement = new DOMElement(GlobalProperties.getIntlString("Author"));

//        DOMAttribute attribUserId = new DOMAttribute(new org.dom4j.QName("userid"), userid);
//        DOMAttribute attribEmail = new DOMAttribute(new org.dom4j.QName("email"), email);
//
//        domElement.add(attribUserId);
//        domElement.add(attribEmail);

//        DOMElement domElementName = name.getDOMElement();
//        domElement.add(domElementName);

//        if(url != null)
//        {
//            DOMElement domElementURL = url.getDOMElement();
//            domElement.add(domElementURL);
//        }

        return domElement;
    }

    public String getXML()
    {
        org.dom4j.dom.DOMElement element = getDOMElement();
        return element.asXML();
    }

    public void printXML(PrintStream ps)
    {
        ps.println(getXML());
    }

    public void readXML(org.w3c.dom.Element domElement) {
        NodeList elements = domElement.getElementsByTagName(GlobalProperties.getIntlString("Name"));

        if(elements.item(0) != null)
        {
//            name = new Name();
//            name.readXML((org.w3c.dom.Element) elements.item(0));
        }

//        userid = domElement.getAttribute("userid");
//        email = domElement.getAttribute("email");

        elements = domElement.getElementsByTagName(GlobalProperties.getIntlString("URL"));

        if(elements.item(0) != null)
        {
//            url = new SanchayURL();
//            url.readXML((org.w3c.dom.Element) elements.item(0));
        }
    }
}
