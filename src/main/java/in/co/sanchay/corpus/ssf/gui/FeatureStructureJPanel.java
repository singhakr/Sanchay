/*
 * FeatureStructureJPanel.java
 *
 * Created on October 9, 2005, 9:53 PM
 */

package in.co.sanchay.corpus.ssf.gui;

import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;

import in.co.sanchay.GlobalProperties;
import in.co.sanchay.corpus.ssf.features.FeatureAttribute;
import in.co.sanchay.corpus.ssf.features.FeatureValue;
import in.co.sanchay.corpus.ssf.features.impl.FeatureAttributeImpl;
import in.co.sanchay.corpus.ssf.features.impl.FeatureStructureImpl;
import in.co.sanchay.corpus.ssf.features.impl.FeatureStructuresImpl;
import in.co.sanchay.corpus.ssf.features.impl.FeatureValueImpl;
import in.co.sanchay.gui.DataStructureJPanelInterface;
import in.co.sanchay.gui.clients.SanchayClient;
import in.co.sanchay.tree.SanchayMutableTreeNode;
import in.co.sanchay.tree.SanchayTreeModel;
import in.co.sanchay.tree.gui.SanchayTreeJPanel;
import in.co.sanchay.gui.*;
import in.co.sanchay.tree.*;
import in.co.sanchay.tree.gui.*;
import in.co.sanchay.corpus.ssf.features.*;
import in.co.sanchay.corpus.ssf.features.impl.*;
import in.co.sanchay.tree.gui.action.TreeAction;
import in.co.sanchay.common.types.ClientType;

/**
 *
 * @author  anil
 */
public class FeatureStructureJPanel extends javax.swing.JPanel implements SanchayClient,
        DataStructureJPanelInterface {

    protected ClientType clientType = ClientType.LANGUAGE_ENCODING_IDENTIFIER;

    protected FeatureStructuresImpl featureStructures;
    protected FeatureStructuresImpl featureStructuresCopy;
    
    protected JFrame owner;
    protected JDialog dialog;
    protected Component parentComponent;
    
    protected String title = "";
    protected String langEnc;
    
    protected SanchayTreeJPanel sanchayTreeJPanel;

    /** Creates new form FeatureStructureJPanel */
    public FeatureStructureJPanel(FeatureStructuresImpl fss) {
        initComponents();

        parentComponent = this;

        featureStructures = fss;
        
        try
        {
            featureStructuresCopy = (FeatureStructuresImpl) featureStructures.getCopy();
            
//            featureStructuresOpenIcon =  new ImageIcon(GlobalProperties.getHomeDirectory() + "/" + "images/color2-right.png");
//            featureStructuresClosedIcon =  new ImageIcon(GlobalProperties.getHomeDirectory() + "/" + "images/color2-up.png");
//
//            featureStructureOpenIcon =  new ImageIcon(GlobalProperties.getHomeDirectory() + "/" + "images/color5-right.png");
//            featureStructureClosedIcon =  new ImageIcon(GlobalProperties.getHomeDirectory() + "/" + "images/color5-up.png");
//
//            featureAttributeOpenIcon =  new ImageIcon(GlobalProperties.getHomeDirectory() + "/" + "images/color1-right.png");
//            featureAttributeClosedIcon =  new ImageIcon(GlobalProperties.getHomeDirectory() + "/" + "images/color1-up.png");
//
//            featureValueIcon =  new ImageIcon(GlobalProperties.getHomeDirectory() + "/" + "images/color7-right.png");
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(parentComponent, GlobalProperties.getIntlString("Error!"), GlobalProperties.getIntlString("Error"), JOptionPane.ERROR_MESSAGE);
        }

        int cmds[] = new int[2];
//        cmds[0] = SanchayTreeJPanel.EDIT_LABEL;
//        cmds[1] = SanchayTreeJPanel.RESET_ALL_CMD;
//        cmds[2] = SanchayTreeJPanel.CLEAR_ALL_CMD;
//        cmds[3] = SanchayTreeJPanel.ADD_CHILD_CMD;
//        cmds[4] = SanchayTreeJPanel.INSERT_CHILD_CMD;
//        cmds[5] = SanchayTreeJPanel.DEL_SUBTREE_CMD;
//        cmds[6] = SanchayTreeJPanel.MOVE_UP_CMD;
//        cmds[7] = SanchayTreeJPanel.MOVE_DOWN_CMD;
        cmds[0] = TreeAction.EXPAND_ALL;
        cmds[1] = TreeAction.COLLAPSE_ALL;

        SanchayTreeModel sanchayTreeModel = new SanchayTreeModel(featureStructuresCopy);
//        sanchayTreeJPanel = new SanchayTreeJPanel(sanchayTreeModel,
//                new FSTreeCellRenderer(), cmds, SanchayTreeJPanel.FS_MODE);
//        leftJPanel.add(sanchayTreeJPanel, java.awt.BorderLayout.CENTER);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leftJPanel = new javax.swing.JPanel();
        fsCommandsJPanel = new javax.swing.JPanel();
        addFSJButton = new javax.swing.JButton();
        delFSJButton = new javax.swing.JButton();
        addAttributeJButton = new javax.swing.JButton();
        delAttributeJButton = new javax.swing.JButton();
        editNameJButton = new javax.swing.JButton();
        addValueJButton = new javax.swing.JButton();
        editValueJButton = new javax.swing.JButton();
        delValueJButton = new javax.swing.JButton();
        bottomJPanel = new javax.swing.JPanel();
        commandsSeparator = new javax.swing.JSeparator();
        commandsJPanel = new javax.swing.JPanel();
        resetJButton = new javax.swing.JButton();
        clearJButton = new javax.swing.JButton();
        discardJButton = new javax.swing.JButton();
        saveJButton = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout(0, 4));

        leftJPanel.setLayout(new java.awt.BorderLayout());
        add(leftJPanel, java.awt.BorderLayout.CENTER);

        fsCommandsJPanel.setLayout(new java.awt.GridLayout(8, 1, 0, 4));

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("sanchay"); // NOI18N
        addFSJButton.setText(bundle.getString("Add_FS")); // NOI18N
        addFSJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFSJButtonActionPerformed(evt);
            }
        });
        fsCommandsJPanel.add(addFSJButton);

        delFSJButton.setText(bundle.getString("Remove_FS")); // NOI18N
        delFSJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delFSJButtonActionPerformed(evt);
            }
        });
        fsCommandsJPanel.add(delFSJButton);

        addAttributeJButton.setText(bundle.getString("Add_Attribute")); // NOI18N
        addAttributeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAttributeJButtonActionPerformed(evt);
            }
        });
        fsCommandsJPanel.add(addAttributeJButton);

        delAttributeJButton.setText(bundle.getString("Remove_Attribute")); // NOI18N
        delAttributeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delAttributeJButtonActionPerformed(evt);
            }
        });
        fsCommandsJPanel.add(delAttributeJButton);

        editNameJButton.setText(bundle.getString("Edit_Name")); // NOI18N
        editNameJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editNameJButtonActionPerformed(evt);
            }
        });
        fsCommandsJPanel.add(editNameJButton);

        addValueJButton.setText(bundle.getString("Add_Value")); // NOI18N
        addValueJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addValueJButtonActionPerformed(evt);
            }
        });
        fsCommandsJPanel.add(addValueJButton);

        editValueJButton.setText(bundle.getString("Edit_Value")); // NOI18N
        editValueJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editValueJButtonActionPerformed(evt);
            }
        });
        fsCommandsJPanel.add(editValueJButton);

        delValueJButton.setText(bundle.getString("Delete_Value")); // NOI18N
        delValueJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delValueJButtonActionPerformed(evt);
            }
        });
        fsCommandsJPanel.add(delValueJButton);

        add(fsCommandsJPanel, java.awt.BorderLayout.EAST);

        bottomJPanel.setLayout(new java.awt.BorderLayout(0, 4));
        bottomJPanel.add(commandsSeparator, java.awt.BorderLayout.NORTH);

        commandsJPanel.setLayout(new java.awt.GridLayout(1, 4, 4, 0));

        resetJButton.setText(bundle.getString("Reset")); // NOI18N
        resetJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetJButtonActionPerformed(evt);
            }
        });
        commandsJPanel.add(resetJButton);

        clearJButton.setText(bundle.getString("Clear")); // NOI18N
        clearJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearJButtonActionPerformed(evt);
            }
        });
        commandsJPanel.add(clearJButton);

        discardJButton.setText(bundle.getString("Discard")); // NOI18N
        discardJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discardJButtonActionPerformed(evt);
            }
        });
        commandsJPanel.add(discardJButton);

        saveJButton.setText(bundle.getString("Save")); // NOI18N
        saveJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveJButtonActionPerformed(evt);
            }
        });
        commandsJPanel.add(saveJButton);

        bottomJPanel.add(commandsJPanel, java.awt.BorderLayout.CENTER);

        add(bottomJPanel, java.awt.BorderLayout.SOUTH);
    }// </editor-fold>//GEN-END:initComponents

    private void delValueJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delValueJButtonActionPerformed
// TODO add your handling code here:
        JTree jtree = sanchayTreeJPanel.getJTree();
        TreePath currentSelection = jtree.getSelectionPath();
        if (currentSelection != null)
        {
            SanchayMutableTreeNode currentNode = (SanchayMutableTreeNode) (currentSelection.getLastPathComponent());
    
            if(currentNode.getClass().getName().endsWith(GlobalProperties.getIntlString("FeatureValueImpl")))
            {
                SanchayMutableTreeNode parent = (SanchayMutableTreeNode) currentNode.getParent();
                FeatureAttribute fa = (FeatureAttributeImpl) parent;
                
                if(FeatureStructuresImpl.getFSProperties().isMandatory(fa.getName()) == false)
                {
                    parent.remove(currentNode);

                    getModel().reload(parent);
                    sanchayTreeJPanel.expandAll(null);
                }
                else
                    JOptionPane.showMessageDialog(parentComponent, GlobalProperties.getIntlString("The_value_of_a_mandatory_attribute_cannot_be_deleted."), GlobalProperties.getIntlString("Error"), JOptionPane.ERROR_MESSAGE);
            }
            else
                JOptionPane.showMessageDialog(parentComponent, GlobalProperties.getIntlString("Select_a_Feature_Value."), GlobalProperties.getIntlString("Error"), JOptionPane.ERROR_MESSAGE);
        } 
        else
            JOptionPane.showMessageDialog(parentComponent, GlobalProperties.getIntlString("Select_a_node."), GlobalProperties.getIntlString("Error"), JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_delValueJButtonActionPerformed

    private void editValueJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editValueJButtonActionPerformed
// TODO add your handling code here:
        JTree jtree = sanchayTreeJPanel.getJTree();
        TreePath currentSelection = jtree.getSelectionPath();
        if (currentSelection != null)
        {
            SanchayMutableTreeNode currentNode = (SanchayMutableTreeNode) (currentSelection.getLastPathComponent());
    
            if(currentNode.getClass().getName().endsWith(GlobalProperties.getIntlString("FeatureValueImpl")))
            {
                FeatureValueImpl fv = (FeatureValueImpl) currentNode;

                SanchayMutableTreeNode parent = (SanchayMutableTreeNode) currentNode.getParent();
                String inputValue = JOptionPane.showInputDialog(parentComponent, GlobalProperties.getIntlString("Type_the_attribute_value:"), fv.getValue());

                if(inputValue == null || inputValue.equals("") == true)
                    return;

                fv.setValue(inputValue);

                getModel().reload(parent);
                sanchayTreeJPanel.expandAll(null);
            }
            else if(currentNode.getClass().getName().endsWith(GlobalProperties.getIntlString("FeatureAttributeImpl")))
            {
                FeatureAttributeImpl fa = (FeatureAttributeImpl) currentNode;

                if(fa.countAltValues() <= 0)
                {
                    JOptionPane.showMessageDialog(parentComponent, GlobalProperties.getIntlString("Add_a_Feature_Value_first."), GlobalProperties.getIntlString("Error"), JOptionPane.ERROR_MESSAGE);
                    return;
                }
                else if(fa.countAltValues() > 1)
                {
                    JOptionPane.showMessageDialog(parentComponent, GlobalProperties.getIntlString("Select_an_Attribute_Value."), GlobalProperties.getIntlString("Error"), JOptionPane.ERROR_MESSAGE);
                    return;
                }

                FeatureValue fv = fa.getAltValue(0);

                if(fv.getClass().getName().endsWith(GlobalProperties.getIntlString("FeatureValueImpl")))
                {
                    SanchayMutableTreeNode parent = (SanchayMutableTreeNode) currentNode.getParent();
                    String inputValue = JOptionPane.showInputDialog(parentComponent, GlobalProperties.getIntlString("Type_the_attribute_value:"), fv.getValue());

                    if(inputValue == null || inputValue.equals("") == true)
                        return;

                    fv.setValue(inputValue);

                    getModel().reload(parent);
                    sanchayTreeJPanel.expandAll(null);
                }
                else
                    JOptionPane.showMessageDialog(parentComponent, GlobalProperties.getIntlString("Select_an_Attribute_Value."), GlobalProperties.getIntlString("Error"), JOptionPane.ERROR_MESSAGE);
            }
            else
                JOptionPane.showMessageDialog(parentComponent, GlobalProperties.getIntlString("Select_an_Attribute_Value."), GlobalProperties.getIntlString("Error"), JOptionPane.ERROR_MESSAGE);
        } 
        else
            JOptionPane.showMessageDialog(parentComponent, GlobalProperties.getIntlString("Select_a_node."), GlobalProperties.getIntlString("Error"), JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_editValueJButtonActionPerformed

    private void delFSJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delFSJButtonActionPerformed
// TODO add your handling code here:
        JTree jtree = sanchayTreeJPanel.getJTree();
        TreePath currentSelection = jtree.getSelectionPath();
        if (currentSelection != null)
        {
            SanchayMutableTreeNode currentNode = (SanchayMutableTreeNode) (currentSelection.getLastPathComponent());
    
            if(currentNode.getClass().getName().endsWith(GlobalProperties.getIntlString("FeatureStructureImpl")))
            {
                SanchayMutableTreeNode parent = (SanchayMutableTreeNode) currentNode.getParent();
                parent.remove(currentNode);
        
                getModel().reload(parent);
                sanchayTreeJPanel.expandAll(null);
            }
            else
                JOptionPane.showMessageDialog(parentComponent, GlobalProperties.getIntlString("Select_a_Feature_Structure."), GlobalProperties.getIntlString("Error"), JOptionPane.ERROR_MESSAGE);
        } 
        else
            JOptionPane.showMessageDialog(parentComponent, GlobalProperties.getIntlString("Select_a_node."), GlobalProperties.getIntlString("Error"), JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_delFSJButtonActionPerformed

    private void addFSJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFSJButtonActionPerformed
// TODO add your handling code here:
        FeatureStructureImpl fs = new FeatureStructureImpl();
        fs.setName("fs");
        featureStructuresCopy.addAltFSValue(fs);
        
        getModel().reload();
        sanchayTreeJPanel.expandAll(null);
    }//GEN-LAST:event_addFSJButtonActionPerformed

    private void resetJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetJButtonActionPerformed
// TODO add your handling code here:
        try
        {
            featureStructuresCopy = (FeatureStructuresImpl) featureStructures.getCopy();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        getModel().setRoot(featureStructuresCopy);
        sanchayTreeJPanel.expandAll(null);
    }//GEN-LAST:event_resetJButtonActionPerformed

    private void addValueJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addValueJButtonActionPerformed
// TODO add your handling code here:
        JTree jtree = sanchayTreeJPanel.getJTree();
        TreePath currentSelection = jtree.getSelectionPath();
        if (currentSelection != null)
        {
            SanchayMutableTreeNode currentNode = (SanchayMutableTreeNode) (currentSelection.getLastPathComponent());
    
            if(currentNode.getClass().getName().endsWith(GlobalProperties.getIntlString("FeatureAttributeImpl")))
            {
                FeatureAttributeImpl fa = (FeatureAttributeImpl) currentNode;
                
                if(FeatureStructuresImpl.getFSProperties().isMandatory(fa.getName()) == false)
                {
                    Object[] possibleValues = { GlobalProperties.getIntlString("Feature_Value"), GlobalProperties.getIntlString("Feature_Structure")};
                    Object selectedValue = JOptionPane.showInputDialog(parentComponent,
                            GlobalProperties.getIntlString("Select_the_type_of_value"), GlobalProperties.getIntlString("Add_Value"), JOptionPane.INFORMATION_MESSAGE, null,
                            possibleValues, possibleValues[0]);
                    
                    if(selectedValue == null || selectedValue .equals("") == true)
                        return;

                    SanchayMutableTreeNode parent = (SanchayMutableTreeNode) currentNode.getParent();

                    if(selectedValue.equals(GlobalProperties.getIntlString("Feature_Value")))
                    {
                        String inputValue = JOptionPane.showInputDialog(parentComponent, GlobalProperties.getIntlString("Type_the_attribute_value:"), "");

                        if(inputValue == null || inputValue.equals("") == true)
                            return;

                        FeatureValue fv = new FeatureValueImpl(inputValue);
                        fa.addAltValue(fv);
                    }
                    else if(selectedValue.equals(GlobalProperties.getIntlString("Feature_Structure")))
                    {
                        FeatureStructureImpl fv = new FeatureStructureImpl("");
                        fa.addAltValue(fv);
                    }

                    getModel().reload(parent);
                    sanchayTreeJPanel.expandAll(null);
                }
                else
                    JOptionPane.showMessageDialog(parentComponent,GlobalProperties.getIntlString("Mandatory_attributes_cannot_have_more_than_one_values."), GlobalProperties.getIntlString("Error"), JOptionPane.ERROR_MESSAGE);
            }
            else
                JOptionPane.showMessageDialog(parentComponent, GlobalProperties.getIntlString("Select_a_Feature_Attribute."), GlobalProperties.getIntlString("Error"), JOptionPane.ERROR_MESSAGE);
        } 
        else
            JOptionPane.showMessageDialog(parentComponent, GlobalProperties.getIntlString("Select_a_node."),GlobalProperties.getIntlString("Error"), JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_addValueJButtonActionPerformed

    private void clearJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearJButtonActionPerformed
// TODO add your handling code here:
        featureStructuresCopy.setToEmpty();

        getModel().reload();
        sanchayTreeJPanel.expandAll(null);
    }//GEN-LAST:event_clearJButtonActionPerformed

    private void discardJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discardJButtonActionPerformed
// TODO add your handling code here:
        dialog.setVisible(false);
    }//GEN-LAST:event_discardJButtonActionPerformed

    private void saveJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveJButtonActionPerformed
// TODO add your handling code here:
        try
        {
            featureStructures.readString(featureStructuresCopy.makeString());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        dialog.setVisible(false);
    }//GEN-LAST:event_saveJButtonActionPerformed

    private void editNameJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editNameJButtonActionPerformed
// TODO add your handling code here:
        JTree jtree = sanchayTreeJPanel.getJTree();
        TreePath currentSelection = jtree.getSelectionPath();
        if (currentSelection != null)
        {
            SanchayMutableTreeNode currentNode = (SanchayMutableTreeNode) (currentSelection.getLastPathComponent());
    
            if(currentNode.getClass().getName().endsWith(GlobalProperties.getIntlString("FeatureAttributeImpl")))
            {
                FeatureAttributeImpl fa = (FeatureAttributeImpl) currentNode;

                if(FeatureStructuresImpl.getFSProperties().isMandatory(fa.getName()) == false)
                {
                    SanchayMutableTreeNode parent = (SanchayMutableTreeNode) currentNode.getParent();
                    String inputValue = JOptionPane.showInputDialog(parentComponent, GlobalProperties.getIntlString("Type_the_name:"), fa.getName());

                    if(inputValue == null || inputValue.equals("") == true)
                        return;

                    fa.setName(inputValue);

                    getModel().reload(parent);
                    sanchayTreeJPanel.expandAll(null);
                }
                else
                    JOptionPane.showMessageDialog(parentComponent, GlobalProperties.getIntlString("Mandatory_attribute_name_cannot_be_changed."), GlobalProperties.getIntlString("Error"), JOptionPane.ERROR_MESSAGE);
            }
            else if(currentNode.getClass().getName().endsWith(GlobalProperties.getIntlString("FeatureStructureImpl")))
            {
                FeatureStructureImpl fs = (FeatureStructureImpl) currentNode;
                
                SanchayMutableTreeNode parent = (SanchayMutableTreeNode) currentNode.getParent();
                String inputValue = JOptionPane.showInputDialog(parentComponent, GlobalProperties.getIntlString("Type_the_name:"), fs.getName());

                if(inputValue == null || inputValue.equals("") == true)
                    return;

                fs.setName(inputValue);

                getModel().reload(parent);
                sanchayTreeJPanel.expandAll(null);
            }
            else
                JOptionPane.showMessageDialog(parentComponent, GlobalProperties.getIntlString("Select_a_Feature_Attribute_or_Feature_Structure."), GlobalProperties.getIntlString("Error"), JOptionPane.ERROR_MESSAGE);
        } 
        else
            JOptionPane.showMessageDialog(parentComponent, GlobalProperties.getIntlString("Select_a_node."),GlobalProperties.getIntlString("Error"), JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_editNameJButtonActionPerformed

    private void delAttributeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delAttributeJButtonActionPerformed
// TODO add your handling code here:
        JTree jtree = sanchayTreeJPanel.getJTree();
        TreePath currentSelection = jtree.getSelectionPath();
        if (currentSelection != null)
        {
            SanchayMutableTreeNode currentNode = (SanchayMutableTreeNode) (currentSelection.getLastPathComponent());
    
            if(currentNode.getClass().getName().endsWith(GlobalProperties.getIntlString("FeatureAttributeImpl")))
            {
                FeatureAttributeImpl fa = (FeatureAttributeImpl) currentNode;
                
                if(FeatureStructuresImpl.getFSProperties().isMandatory(fa.getName()) == false)
                {
                    SanchayMutableTreeNode parent = (SanchayMutableTreeNode) currentNode.getParent();
                    parent.remove(currentNode);

                    getModel().reload(parent);
                    sanchayTreeJPanel.expandAll(null);
                }
                else
                    JOptionPane.showMessageDialog(parentComponent, GlobalProperties.getIntlString("Mandatory_attribute_cannot_be_deleted."), GlobalProperties.getIntlString("Error"), JOptionPane.ERROR_MESSAGE);
            }
            else
                JOptionPane.showMessageDialog(parentComponent, GlobalProperties.getIntlString("Select_a_Feature_Attribute."), GlobalProperties.getIntlString("Error"), JOptionPane.ERROR_MESSAGE);
        } 
        else
            JOptionPane.showMessageDialog(parentComponent, GlobalProperties.getIntlString("Select_a_node."),GlobalProperties.getIntlString("Error"), JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_delAttributeJButtonActionPerformed

    private void addAttributeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAttributeJButtonActionPerformed
// TODO add your handling code here:
        JTree jtree = sanchayTreeJPanel.getJTree();
        TreePath currentSelection = jtree.getSelectionPath();
        if (currentSelection != null)
        {
            SanchayMutableTreeNode currentNode = (SanchayMutableTreeNode) (currentSelection.getLastPathComponent());
    
            if(currentNode.getClass().getName().endsWith(GlobalProperties.getIntlString("FeatureStructureImpl")))
            {
                FeatureStructureImpl fs = (FeatureStructureImpl) currentNode;
                SanchayMutableTreeNode parent = (SanchayMutableTreeNode) currentNode.getParent();
                
                FeatureAttributeImpl fa = new FeatureAttributeImpl();
                fa.setName(GlobalProperties.getIntlString("New_Attribute"));
                fs.addAttribute(fa);
        
                getModel().reload(parent);
                sanchayTreeJPanel.expandAll(null);
            }
            else
                JOptionPane.showMessageDialog(parentComponent, GlobalProperties.getIntlString("Select_a_Feature_Structure."),GlobalProperties.getIntlString("Error"), JOptionPane.ERROR_MESSAGE);
        } 
        else
            JOptionPane.showMessageDialog(parentComponent, GlobalProperties.getIntlString("Select_a_node."),GlobalProperties.getIntlString("Error"), JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_addAttributeJButtonActionPerformed
//    
//    public static ImageIcon getFeatureStructuresOpenIcon()
//    {
//        return featureStructuresOpenIcon;
//    }
//    
//    public static ImageIcon getFeatureStructuresClosedIcon()
//    {
//        return featureStructuresClosedIcon;
//    }
//    
//    public static ImageIcon getFeatureStructureOpenIcon()
//    {
//        return featureStructureOpenIcon;
//    }
//    
//    public static ImageIcon getFeatureStructureClosedIcon()
//    {
//        return featureStructureClosedIcon;
//    }
//    
//    public static ImageIcon getFeatureAttributeOpenIcon()
//    {
//        return featureAttributeOpenIcon;
//    }
//    
//    public static ImageIcon getFeatureAttributeClosedIcon()
//    {
//        return featureAttributeClosedIcon;
//    }
//    
//    public static ImageIcon getFeatureValueIcon()
//    {
//        return featureValueIcon;
//    }

    public ClientType getClientType()
    {
        return clientType;
    }

    public String getLangEnc()
    {
        return langEnc;
    }
    
    public Frame getOwner()
    {
        return owner;
    }
    
    public void setOwner(Frame f)
    {
        owner = (JFrame) f;
    }

    public void setParentComponent(Component parentComponent)
    {
        this.parentComponent = parentComponent;
    }

    public String getTitle() {
        return title;
    }

    public JMenuBar getJMenuBar() {
        return null;
    }

    public JPopupMenu getJPopupMenu() {
        return null;
    }

    public JToolBar getJToolBar() {
        return null;
    }
    
    public void setDialog(JDialog d)
    {
        dialog = d;
    }
    
    public void setModel(SanchayTreeModel tm)
    {
        sanchayTreeJPanel.setModel(tm);
    }

    public SanchayTreeModel getModel()
    {
        return (SanchayTreeModel) sanchayTreeJPanel.getModel();
    }
    
    public SanchayTreeJPanel getSanchayTreeJPanel()
    {
        return sanchayTreeJPanel;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton addAttributeJButton;
    public javax.swing.JButton addFSJButton;
    public javax.swing.JButton addValueJButton;
    public javax.swing.JPanel bottomJPanel;
    public javax.swing.JButton clearJButton;
    public javax.swing.JPanel commandsJPanel;
    public javax.swing.JSeparator commandsSeparator;
    public javax.swing.JButton delAttributeJButton;
    public javax.swing.JButton delFSJButton;
    public javax.swing.JButton delValueJButton;
    public javax.swing.JButton discardJButton;
    public javax.swing.JButton editNameJButton;
    public javax.swing.JButton editValueJButton;
    public javax.swing.JPanel fsCommandsJPanel;
    public javax.swing.JPanel leftJPanel;
    public javax.swing.JButton resetJButton;
    public javax.swing.JButton saveJButton;
    // End of variables declaration//GEN-END:variables
    
}
