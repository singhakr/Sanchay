/*
 * SanchayDataFlavors.java
 *
 * Created on 15 November, 2008, 5:44 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package in.co.sanchay.gui.common;

import java.awt.datatransfer.DataFlavor;
import javax.swing.tree.TreePath;
import in.co.sanchay.corpus.parallel.AlignmentUnit;
import in.co.sanchay.corpus.ssf.tree.SSFLexItem;
import in.co.sanchay.corpus.ssf.tree.SSFPhrase;

/**
 *
 * @author Anil Kumar Singh
 */
public class SanchayDataFlavors {

  public static DataFlavor TREE_PATH_FLAVOR = new DataFlavor(TreePath.class, "Tree Path");

  public static DataFlavor SSF_PHRASE_FLAVOR = new DataFlavor(SSFPhrase.class, "SSFPhrase");
  
  public static DataFlavor SSF_LEXITEM_FLAVOR = new DataFlavor(SSFLexItem.class, "SSFLexItem");

  public static DataFlavor ALIGNMENT_UNIT_FLAVOR = new DataFlavor(AlignmentUnit.class, "AlignmentUnit");
    
    /** Creates a new instance of SanchayDataFlavors */
    public SanchayDataFlavors() {
    }
    
}
