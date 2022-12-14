/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package in.co.sanchay.tree.gui.action;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import in.co.sanchay.GlobalProperties;
import in.co.sanchay.corpus.ssf.features.FeatureStructure;
import in.co.sanchay.tree.gui.SanchayTreeJPanel;
import in.co.sanchay.gui.common.SanchayLanguages;
import in.co.sanchay.util.UtilityFunctions;

/**
 *
 * @author anil
 */
public class AttributeValueActionListener implements ActionListener {

    protected SanchayTreeJPanel sanchayTreeJPanel;
    protected String name;
    protected FeatureStructure featureStructure;
    protected DefaultComboBoxModel dcbm;
    
    private String langEnc = "hin::utf8";

    public AttributeValueActionListener(SanchayTreeJPanel sanchayTreeJPanel, String name, FeatureStructure featureStructure,
            DefaultComboBoxModel dcbm, String langEnc)
    {
        this.sanchayTreeJPanel = sanchayTreeJPanel;
        this.name = name;
        this.featureStructure = featureStructure;
        this.dcbm = dcbm;
        
        this.langEnc = langEnc;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the featureStructure
     */
    public FeatureStructure getFeatureStructure() {
        return featureStructure;
    }

    /**
     * @param featureStructure the featureStructure to set
     */
    public void setFeatureStructure(FeatureStructure featureStructure) {
        this.featureStructure = featureStructure;
    }

    /**
     * @return the dcbm
     */
    public DefaultComboBoxModel getDcbm() {
        return dcbm;
    }

    /**
     * @param dcbm the dcbm to set
     */
    public void setDcbm(DefaultComboBoxModel dcbm) {
        this.dcbm = dcbm;
    }
    
    public void actionPerformed(ActionEvent e) {
        String val = (String) getDcbm().getSelectedItem();

        if(val.equals("Other"))
        {
            JPanel inputPanel = new JPanel();
            inputPanel.setLayout(new BorderLayout());
            JTextField inputField = new JTextField("");
            JButton inputMethodButton = new JButton();
            inputMethodButton.setText("Change Input Method");

            inputPanel.add(inputField, BorderLayout.CENTER);
            inputPanel.add(inputMethodButton, BorderLayout.SOUTH);

//            inputPanel.setMinimumSize(new Dimension(inputMethodButton.getWidth(), inputPanel.getHeight()));

            inputMethodButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String im = SanchayLanguages.selectInputMethod(inputField);
                    SanchayLanguages.changeInputMethod(inputMethodButton, im);
                }
            });

            UtilityFunctions.setComponentFont(inputField, langEnc);

            int result = JOptionPane.showConfirmDialog(sanchayTreeJPanel, inputPanel, GlobalProperties.getIntlString("Please_enter_the_attribute_value"), JOptionPane.PLAIN_MESSAGE);
//            val = JOptionPane.showInputDialog(GlobalProperties.getIntlString("Please_enter_the_attribute_value"), inputField);
//            val = SanchayJOptionPane.showInternalInputDialog(sanchayTreeJPanel, GlobalProperties.getIntlString("Please_enter_the_attribute_value"), langEnc);
            
            if (result == JOptionPane.OK_OPTION) {
                String inputValue = inputField.getText();

                if(dcbm.getIndexOf(inputValue) == -1)
                {
                    dcbm.addElement(inputValue);
                }

                dcbm.setSelectedItem(inputValue);
            }

//            if(dcbm.getIndexOf(val) == -1)
//            {
//                dcbm.addElement(val);
//            }
//
//            dcbm.setSelectedItem(val);
        }

//        TreePath currentSelection = jtree.getSelectionPath();
//
//        if (currentSelection != null)
//        {
//            SSFNode currentNode = (SSFNode) (currentSelection.getLastPathComponent());

//            if(currentNode.getFeatureStructures().countAltFSValues() == 1)
//            {
//                currentNode.setAttributeValue(name, val);
//            }
//            else
//            {
//                getFeatureStructure().setAttributeValue(getName(),val);
//                sanchayTreeJPanel.editTreeNode(null);
//            }

//            jtree.updateUI();
//            jtree.requestFocusInWindow();
//        }
    }
}
