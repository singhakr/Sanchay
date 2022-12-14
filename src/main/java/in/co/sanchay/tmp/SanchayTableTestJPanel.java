/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package in.co.sanchay.tmp;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Vector;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.TableColumn;

import in.co.sanchay.GlobalProperties;
import in.co.sanchay.table.gui.SanchayTableJPanel;
import in.co.sanchay.table.SanchayTableModel;
import in.co.sanchay.util.UtilityFunctions;

/**
 *
 * @author User
 */
public class SanchayTableTestJPanel extends javax.swing.JPanel {

    protected JFrame owner;

    private SanchayTableModel sanchayTableModel;
    private SanchayTableJPanel sanchayTableJPanel;
    /**
     * Creates new form SanchayTableTestJPanel
     */
    public SanchayTableTestJPanel() {
        initComponents();
        
        sanchayTableModel = new SanchayTableModel(0, 4);

        sanchayTableJPanel = SanchayTableJPanel.createFindOptionsTableJPanel(sanchayTableModel, "hin::utf8", false);
        
        add(sanchayTableJPanel, BorderLayout.CENTER);
        
        sanchayTableModel.addRow();
        
        Vector tagsVec = new Vector();
        
        tagsVec.add("One");
        tagsVec.add("Two");
        tagsVec.add("Three");
        
        JTable tableJTable = sanchayTableJPanel.getJTable();
        
        DefaultComboBoxModel labelEditorModel = new DefaultComboBoxModel(tagsVec);
        labelEditorModel.insertElementAt("[.]*", 0);
        JComboBox labelEditor = new JComboBox();
        labelEditor.setModel(labelEditorModel);
        UtilityFunctions.setComponentFont(labelEditor, "hin::utf8");

        TableColumn tagsCol = tableJTable.getColumn(GlobalProperties.getIntlString("Tag"));
        labelEditor.setEditable(true);
        tagsCol.setCellEditor(new DefaultCellEditor(labelEditor));

        sanchayTableModel.addRow();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new java.awt.BorderLayout());
    }// </editor-fold>//GEN-END:initComponents

    private static void createAndShowGUI() {
        //Make sure we have nice window decorations.
        JFrame.setDefaultLookAndFeelDecorated(true);

        //Create and set up the window.
        JFrame frame = new JFrame("Sanchay Table Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SanchayTableTestJPanel newContentPane = new SanchayTableTestJPanel();

        
        newContentPane.owner = frame;
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);
//            frame.addWindowListener(newContentPane);

//            newContentPane.setTitle(newContentPane.getTitle());

            //Display the window.
        frame.pack();

        int inset = 5;
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setBounds(inset, inset,
                screenSize.width  - inset*2,
                screenSize.height - inset*9);

        frame.setVisible(true);
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
    // End of variables declaration//GEN-END:variables
}
