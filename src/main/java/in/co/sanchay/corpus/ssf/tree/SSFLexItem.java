package in.co.sanchay.corpus.ssf.tree;

import java.io.Serializable;

import javax.swing.tree.MutableTreeNode;

import in.co.sanchay.GlobalProperties;
import in.co.sanchay.tree.SanchayMutableTreeNode;
import in.co.sanchay.xml.dom.SanchayDOMElement;
import in.co.sanchay.corpus.parallel.Alignable;
import in.co.sanchay.corpus.ssf.features.FeatureStructures;
import in.co.sanchay.corpus.ssf.query.QueryValue;

public class SSFLexItem extends SSFNode
        implements MutableTreeNode, Alignable, Serializable, QueryValue, SanchayDOMElement
        
{
    public SSFLexItem() {
        super();
    }

    public SSFLexItem(Object userObject) {
        super(userObject);
    }
    
    public SSFLexItem(Object userObject, boolean allowsChildren) {
        super(userObject, allowsChildren);
    }

    public SSFLexItem(String id, String lexdata, String name, String stringFS) throws Exception
    {
        super(id, lexdata, name, stringFS);
//        setUserObject(lexdata);
    }

    public SSFLexItem(String id, String lexdata, String name, FeatureStructures fs)
    {
        super(id, lexdata, name, fs);
//        setUserObject(lexdata);
    }

    public SSFLexItem(String id, String lexdata, String name, String stringFS, Object userObject) throws Exception
    {
        super(id, lexdata, name, stringFS, userObject);
    }

    public SSFLexItem(String id, String lexdata, String name, FeatureStructures fs, Object userObject)
    {
        super(id, lexdata, name, fs, userObject);
    }
    
    public boolean isLeaf()
    {
        return true;
    }

    public SanchayMutableTreeNode getCopy() throws Exception
    {
        String str = makeString();
        
        SSFNode ssfNode = new SSFLexItem();
        ssfNode.readString(str);

        ssfNode.flags = flags;

        return ssfNode;
    }

    public static void main(String[] args)
    {
        SSFLexItem node = new SSFLexItem();
        System.out.println(GlobalProperties.getIntlString("Testing_SSFLexicalItem..."));
    }
}
