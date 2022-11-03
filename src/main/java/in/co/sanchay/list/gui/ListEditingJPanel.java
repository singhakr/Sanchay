/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ListEditingJPanel.java
 *
 * Created on 22 Jul, 2009, 6:59:00 AM
 */

package in.co.sanchay.list.gui;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;

import in.co.sanchay.GlobalProperties;
import in.co.sanchay.gui.clients.SanchayClient;
import in.co.sanchay.gui.common.JPanelDialog;
import in.co.sanchay.gui.common.SanchayLanguages;
import in.co.sanchay.properties.PropertyTokens;
import in.co.sanchay.util.UtilityFunctions;
import in.co.sanchay.common.types.ClientType;

/**
 *
 * @author Anil Kumar Singh
 */
public class ListEditingJPanel extends javax.swing.JPanel implements JPanelDialog, SanchayClient {

    protected ClientType clientType = ClientType.LANGUAGE_ENCODING_IDENTIFIER;

    protected JFrame owner;
    protected JDialog dialog;
    protected Component parentComponent;

    private String langEnc = GlobalProperties.getIntlString("hin::utf8");
    protected String charset = GlobalProperties.getIntlString("UTF-8");

    protected String title = GlobalProperties.getIntlString("List_Editor");

    private DefaultComboBoxModel langauges;
    private DefaultComboBoxModel encodings;

    protected PropertyTokens leftListPT;
    protected PropertyTokens rightListPT;

    protected DefaultComboBoxModel leftListModel;
    protected DefaultComboBoxModel rightListModel;

    protected int mode = STAND_ALONE_MODE;

    public static final int STAND_ALONE_MODE = 0;
    public static final int EMBEDDED_MODE = 1;

    /** Creates new form ListEditingJPanel */
    public ListEditingJPanel(int mode, String charset) {
        initComponents();

        parentComponent = this;

        langauges = new DefaultComboBoxModel();
        encodings = new DefaultComboBoxModel();

        SanchayLanguages.fillLanguages(langauges);
        SanchayLanguages.fillEncodings(encodings, "hin");

        languageJComboBox.setModel(langauges);
        encodingJComboBox.setModel(encodings);

        this.charset = charset;

        this.mode = mode;

        init();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loadJPanel = new javax.swing.JPanel();
        lagEncJPanel = new javax.swing.JPanel();
        languageJPanel = new javax.swing.JPanel();
        languageJLabel = new javax.swing.JLabel();
        languageJComboBox = new javax.swing.JComboBox();
        encodingJPanel = new javax.swing.JPanel();
        encodingJLabel = new javax.swing.JLabel();
        encodingJComboBox = new javax.swing.JComboBox();
        mainJPanel = new javax.swing.JPanel();
        mainListEditingJPanel = new javax.swing.JPanel();
        leftJSplitPane = new javax.swing.JSplitPane();
        leftListJPanel = new javax.swing.JPanel();
        leftItemEditJPanel = new javax.swing.JPanel();
        leftItemEditJLabel = new javax.swing.JLabel();
        leftItemEditJTextField = new javax.swing.JTextField();
        leftNewItemJCheckBox = new javax.swing.JCheckBox();
        leftListJScrollPane = new javax.swing.JScrollPane();
        leftListJList = new javax.swing.JList();
        leftCommandsJPanel = new javax.swing.JPanel();
        deleteLeftJButton = new javax.swing.JButton();
        saveLeftJButton = new javax.swing.JButton();
        rightJSplitPane = new javax.swing.JSplitPane();
        selectionjPanel = new javax.swing.JPanel();
        topSelectionJPanel = new javax.swing.JPanel();
        addJButton = new javax.swing.JButton();
        removeJButton = new javax.swing.JButton();
        copyJButton = new javax.swing.JButton();
        rightListJPanel = new javax.swing.JPanel();
        rightItemEditJPanel = new javax.swing.JPanel();
        rightItemEditJLabel = new javax.swing.JLabel();
        rightItemEditJTextField = new javax.swing.JTextField();
        rightNewItemJCheckBox = new javax.swing.JCheckBox();
        rightListJScrollPane = new javax.swing.JScrollPane();
        rightListJList = new javax.swing.JList();
        rightCommandsJPanel = new javax.swing.JPanel();
        deleteRightJButton = new javax.swing.JButton();
        saveRightJButton = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        loadJPanel.setLayout(new java.awt.GridLayout(0, 1, 0, 4));

        lagEncJPanel.setLayout(new java.awt.GridLayout(0, 1, 0, 4));

        languageJPanel.setLayout(new java.awt.BorderLayout());

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("sanchay"); // NOI18N
        languageJLabel.setText(bundle.getString("Language:_")); // NOI18N
        languageJPanel.add(languageJLabel, java.awt.BorderLayout.WEST);

        languageJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                languageJComboBoxActionPerformed(evt);
            }
        });
        languageJPanel.add(languageJComboBox, java.awt.BorderLayout.CENTER);

        lagEncJPanel.add(languageJPanel);

        encodingJPanel.setLayout(new java.awt.BorderLayout());

        encodingJLabel.setText(bundle.getString("Encoding:__")); // NOI18N
        encodingJPanel.add(encodingJLabel, java.awt.BorderLayout.WEST);

        encodingJPanel.add(encodingJComboBox, java.awt.BorderLayout.CENTER);

        lagEncJPanel.add(encodingJPanel);

        loadJPanel.add(lagEncJPanel);

        add(loadJPanel, java.awt.BorderLayout.NORTH);

        mainJPanel.setLayout(new java.awt.BorderLayout());

        mainListEditingJPanel.setToolTipText("");
        mainListEditingJPanel.setLayout(new java.awt.BorderLayout());

        leftJSplitPane.setResizeWeight(0.45);
        leftJSplitPane.setOneTouchExpandable(true);

        leftListJPanel.setLayout(new java.awt.BorderLayout());

        leftItemEditJPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        leftItemEditJLabel.setText(bundle.getString("Edit_Item:_")); // NOI18N
        leftItemEditJLabel.setToolTipText(bundle.getString("Edit_an_item_or_add_new_item_to_the_list:_press_Enter_when_finished")); // NOI18N
        leftItemEditJLabel.setPreferredSize(new java.awt.Dimension(70, 15));
        leftItemEditJPanel.add(leftItemEditJLabel);

        leftItemEditJTextField.setToolTipText(bundle.getString("Edit_an_item_or_add_new_item_to_the_list:_press_Enter_when_finished")); // NOI18N
        leftItemEditJTextField.setPreferredSize(new java.awt.Dimension(200, 19));
        leftItemEditJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                leftItemEditJTextFieldKeyTyped(evt);
            }
        });
        leftItemEditJPanel.add(leftItemEditJTextField);

        leftNewItemJCheckBox.setText(bundle.getString("New")); // NOI18N
        leftNewItemJCheckBox.setToolTipText(bundle.getString("Select_to_add_new_items_to_the_list")); // NOI18N
        leftItemEditJPanel.add(leftNewItemJCheckBox);

        leftListJPanel.add(leftItemEditJPanel, java.awt.BorderLayout.NORTH);

        leftListJScrollPane.setPreferredSize(new java.awt.Dimension(100, 139));

        leftListJScrollPane.setViewportView(leftListJList);

        leftListJPanel.add(leftListJScrollPane, java.awt.BorderLayout.CENTER);

        leftCommandsJPanel.setLayout(new java.awt.GridLayout(1, 0, 4, 0));

        deleteLeftJButton.setText(bundle.getString("Delete")); // NOI18N
        deleteLeftJButton.setToolTipText(bundle.getString("Delete_the_selected_items")); // NOI18N
        leftCommandsJPanel.add(deleteLeftJButton);

        saveLeftJButton.setText(bundle.getString("Save")); // NOI18N
        saveLeftJButton.setToolTipText(bundle.getString("Save_the_edited_list")); // NOI18N
        leftCommandsJPanel.add(saveLeftJButton);

        leftListJPanel.add(leftCommandsJPanel, java.awt.BorderLayout.SOUTH);

        leftJSplitPane.setLeftComponent(leftListJPanel);

        rightJSplitPane.setResizeWeight(0.2);
        rightJSplitPane.setOneTouchExpandable(true);

        selectionjPanel.setPreferredSize(new java.awt.Dimension(100, 223));
        selectionjPanel.setLayout(new java.awt.BorderLayout());

        topSelectionJPanel.setLayout(new java.awt.GridLayout(0, 1, 0, 4));

        addJButton.setText(bundle.getString("Add_>>")); // NOI18N
        addJButton.setToolTipText(bundle.getString("Add_items_from_left_to_right")); // NOI18N
        topSelectionJPanel.add(addJButton);

        removeJButton.setText(bundle.getString("<<_Remove")); // NOI18N
        removeJButton.setToolTipText(bundle.getString("Remove_items_from_right_to_left")); // NOI18N
        topSelectionJPanel.add(removeJButton);

        copyJButton.setText(bundle.getString("Copy")); // NOI18N
        copyJButton.setToolTipText(bundle.getString("Copy_items_from_left_to_right")); // NOI18N
        topSelectionJPanel.add(copyJButton);

        selectionjPanel.add(topSelectionJPanel, java.awt.BorderLayout.NORTH);

        rightJSplitPane.setLeftComponent(selectionjPanel);

        rightListJPanel.setLayout(new java.awt.BorderLayout());

        rightItemEditJPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        rightItemEditJLabel.setText(bundle.getString("Edit_Item:_")); // NOI18N
        rightItemEditJLabel.setToolTipText(bundle.getString("Edit_an_item_or_add_new_item_to_the_list:_press_Enter_when_finished")); // NOI18N
        rightItemEditJLabel.setPreferredSize(new java.awt.Dimension(70, 15));
        rightItemEditJPanel.add(rightItemEditJLabel);

        rightItemEditJTextField.setToolTipText(bundle.getString("Edit_an_item_or_add_new_item_to_the_list:_press_Enter_when_finished")); // NOI18N
        rightItemEditJTextField.setPreferredSize(new java.awt.Dimension(200, 19));
        rightItemEditJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rightItemEditJTextFieldKeyTyped(evt);
            }
        });
        rightItemEditJPanel.add(rightItemEditJTextField);

        rightNewItemJCheckBox.setText(bundle.getString("New")); // NOI18N
        rightNewItemJCheckBox.setToolTipText(bundle.getString("Select_to_add_new_items_to_the_list")); // NOI18N
        rightItemEditJPanel.add(rightNewItemJCheckBox);

        rightListJPanel.add(rightItemEditJPanel, java.awt.BorderLayout.NORTH);

        rightListJScrollPane.setViewportView(rightListJList);

        rightListJPanel.add(rightListJScrollPane, java.awt.BorderLayout.CENTER);

        rightCommandsJPanel.setLayout(new java.awt.GridLayout(1, 0, 4, 0));

        deleteRightJButton.setText(bundle.getString("Delete")); // NOI18N
        deleteRightJButton.setToolTipText(bundle.getString("Delete_the_selected_items")); // NOI18N
        rightCommandsJPanel.add(deleteRightJButton);

        saveRightJButton.setText(bundle.getString("Save")); // NOI18N
        saveRightJButton.setToolTipText(bundle.getString("Save_the_edited_list")); // NOI18N
        rightCommandsJPanel.add(saveRightJButton);

        rightListJPanel.add(rightCommandsJPanel, java.awt.BorderLayout.SOUTH);

        rightJSplitPane.setRightComponent(rightListJPanel);

        leftJSplitPane.setRightComponent(rightJSplitPane);

        mainListEditingJPanel.add(leftJSplitPane, java.awt.BorderLayout.CENTER);

        mainJPanel.add(mainListEditingJPanel, java.awt.BorderLayout.CENTER);

        add(mainJPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void languageJComboBoxActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_languageJComboBoxActionPerformed
    {//GEN-HEADEREND:event_languageJComboBoxActionPerformed
        // TODO add your handling code here:
        langEnc = (String) languageJComboBox.getSelectedItem();
        SanchayLanguages.fillEncodings(encodings, SanchayLanguages.getLanguageCode(langEnc));
}//GEN-LAST:event_languageJComboBoxActionPerformed

    private void rightItemEditJTextFieldKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_rightItemEditJTextFieldKeyTyped
    {//GEN-HEADEREND:event_rightItemEditJTextFieldKeyTyped
        // TODO add your handling code here:
        if(rightNewItemJCheckBox.isSelected() && evt.getKeyChar() == '\n')
        {
            String newItem = rightItemEditJTextField.getText();
            rightListModel.addElement(newItem);
        }
    }//GEN-LAST:event_rightItemEditJTextFieldKeyTyped

    private void leftItemEditJTextFieldKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_leftItemEditJTextFieldKeyTyped
    {//GEN-HEADEREND:event_leftItemEditJTextFieldKeyTyped
        // TODO add your handling code here:
        if(leftNewItemJCheckBox.isSelected() && evt.getKeyChar() == '\n')
        {
            String newItem = leftItemEditJTextField.getText();
            leftListModel.addElement(newItem);
        }
    }//GEN-LAST:event_leftItemEditJTextFieldKeyTyped

    public ClientType getClientType()
    {
        return clientType;
    }

    protected void init()
    {
        leftListPT = new PropertyTokens();
        rightListPT = new PropertyTokens();

        leftListModel = new DefaultComboBoxModel();
        rightListModel = new DefaultComboBoxModel();

        leftListJList.setModel(leftListModel);
        rightListJList.setModel(rightListModel);

        if(mode == EMBEDDED_MODE)
        {
            loadJPanel.setVisible(false);
        }

        UtilityFunctions.setComponentFont(leftListJList, langEnc);
        UtilityFunctions.setComponentFont(rightListJList, langEnc);
        UtilityFunctions.setComponentFont(leftItemEditJTextField, langEnc);
        UtilityFunctions.setComponentFont(rightItemEditJTextField, langEnc);
    }

    public void loadFromPT()
    {
        leftListModel = PropertyTokens.getListModel(leftListPT);
        rightListModel = PropertyTokens.getListModel(rightListPT);

        leftListJList.setModel(leftListModel);
        rightListJList.setModel(rightListModel);
    }

    public String getLangEnc()
    {
        return langEnc;
    }

    public Frame getOwner() {
        return owner;
    }

    public void setOwner(Frame frame) {
        owner = (JFrame) frame;
    }

    public void setParentComponent(Component parentComponent)
    {
        this.parentComponent = parentComponent;
    }

    public void setDialog(JDialog dialog) {
        this.dialog = dialog;
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

    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame(GlobalProperties.getIntlString("List_Editor"));
        UtilityFunctions.setComponentFont(frame, GlobalProperties.getIntlString("hin::utf8"));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the menu bar and content pane.
        ListEditingJPanel demo = new ListEditingJPanel(STAND_ALONE_MODE, GlobalProperties.getIntlString("UTF-8"));
        demo.setOpaque(true); //content panes must be opaque
        frame.setContentPane(demo);

        demo.setOwner(frame);

        //Display the window.
        frame.pack();

        int inset = 5;
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setBounds(inset, inset,
                screenSize.width  - inset*2,
                screenSize.height - inset*9);

        frame.setVisible(true);

        demo.requestFocusInWindow();
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton copyJButton;
    private javax.swing.JButton deleteLeftJButton;
    private javax.swing.JButton deleteRightJButton;
    private javax.swing.JComboBox encodingJComboBox;
    private javax.swing.JLabel encodingJLabel;
    private javax.swing.JPanel encodingJPanel;
    private javax.swing.JPanel lagEncJPanel;
    private javax.swing.JComboBox languageJComboBox;
    private javax.swing.JLabel languageJLabel;
    private javax.swing.JPanel languageJPanel;
    private javax.swing.JPanel leftCommandsJPanel;
    private javax.swing.JLabel leftItemEditJLabel;
    private javax.swing.JPanel leftItemEditJPanel;
    private javax.swing.JTextField leftItemEditJTextField;
    private javax.swing.JSplitPane leftJSplitPane;
    private javax.swing.JList leftListJList;
    private javax.swing.JPanel leftListJPanel;
    private javax.swing.JScrollPane leftListJScrollPane;
    private javax.swing.JCheckBox leftNewItemJCheckBox;
    private javax.swing.JPanel loadJPanel;
    private javax.swing.JPanel mainJPanel;
    private javax.swing.JPanel mainListEditingJPanel;
    private javax.swing.JButton removeJButton;
    private javax.swing.JPanel rightCommandsJPanel;
    private javax.swing.JLabel rightItemEditJLabel;
    private javax.swing.JPanel rightItemEditJPanel;
    private javax.swing.JTextField rightItemEditJTextField;
    private javax.swing.JSplitPane rightJSplitPane;
    private javax.swing.JList rightListJList;
    private javax.swing.JPanel rightListJPanel;
    private javax.swing.JScrollPane rightListJScrollPane;
    private javax.swing.JCheckBox rightNewItemJCheckBox;
    private javax.swing.JButton saveLeftJButton;
    private javax.swing.JButton saveRightJButton;
    private javax.swing.JPanel selectionjPanel;
    private javax.swing.JPanel topSelectionJPanel;
    // End of variables declaration//GEN-END:variables

}
