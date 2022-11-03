/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * LocalKeyboardShorcutEditorJPanel.java
 *
 * Created on 11 Nov, 2009, 11:36:16 PM
 */

package in.co.sanchay.gui.common;

import java.awt.BorderLayout;
import java.util.LinkedHashMap;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import in.co.sanchay.common.SanchayShortcutsData;
import in.co.sanchay.table.SanchayTableModel;
import in.co.sanchay.table.gui.SanchayTableJPanel;

/**
 *
 * @author anil
 */
public class LocalKeyboardShorcutEditorJPanel extends javax.swing.JPanel implements JPanelDialog {

    protected JFrame owner;
    protected JDialog dialog;

    protected InputMap customInputMap;
    protected ActionMap customActionMap;
    protected Action[] actions;

    protected LinkedHashMap<String,KeyStroke> actionsKeyMap;

    protected SanchayTableModel shortcutTableModel;
    protected SanchayTableJPanel shortcutTableJPanel;

    protected KeystrokeCellRenderer renderer;

    /** Creates new form LocalKeyboardShorcutEditorJPanel */
    public LocalKeyboardShorcutEditorJPanel(SanchayTableModel shortcutTableModel) {
        initComponents();

        customInputMap = new InputMap();
        customActionMap = new ActionMap();

        actionsKeyMap = new LinkedHashMap<String,KeyStroke>();

        this.shortcutTableModel = shortcutTableModel;

        shortcutTableJPanel = SanchayTableJPanel.createTableDisplayJPanel(shortcutTableModel, "eng::utf8");

        add(shortcutTableJPanel, BorderLayout.CENTER);

        renderer = new KeystrokeCellRenderer();
        renderer.setHorizontalAlignment(SwingConstants.CENTER);

        renderer.setToolTipText("Click to edit the keyboard shortcut");

        KeystrokeCellEditor editor = new KeystrokeCellEditor(owner, "eng::utf8");
        shortcutTableJPanel.getJTable().getColumnModel().getColumn(2).setCellEditor(editor);
    }

    /**
     * @return the customInputMap
     */
    public InputMap getCustomInputMap()
    {
        return customInputMap;
    }

    /**
     * @param customInputMap the customInputMap to set
     */
    public void setCustomInputMap(InputMap customInputMap)
    {
        this.customInputMap = customInputMap;
    }

    /**
     * @return the customActionMap
     */
    public ActionMap getCustomActionMap()
    {
        return customActionMap;
    }

    /**
     * @param customActionMap the customActionMap to set
     */
    public void setCustomActionMap(ActionMap customActionMap)
    {
        this.customActionMap = customActionMap;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new java.awt.BorderLayout());
    }// </editor-fold>//GEN-END:initComponents

    public void setActions(Action[] actions)
    {
        this.actions = actions;
    }

    public void prepareShortcutTable()
    {
//        shortcutTableModel = SanchayShortcutsData.getShortcutsTable(actions, customInputMap, customActionMap, actionsKeyMap);

//        for (int i = 0; i < actions.length; i++)
//        {
//            int row = shortcutTableModel.getRowCount();
//
//            shortcutTableModel.addRow();
//
//            String actionName = (String) actions[i].getValue(Action.NAME);
//
//            shortcutTableModel.setValueAt(actionName, row, 0);
//            shortcutTableModel.setValueAt(actions[i].getValue(Action.SHORT_DESCRIPTION), row, 1);
//
//            KeyStroke keyStroke = KeyStroke.getKeyStroke(actionName.charAt(actionName.length() - 1));
//
//            if(actionsKeyMap.get(actionName) != null)
//                keyStroke = actionsKeyMap.get(actionName);
//
//            shortcutTableModel.setValueAt(keyStroke, row, 2);
//
//            getCustomInputMap().put(keyStroke, actionName);
//            getCustomActionMap().put(actionName, actions[i]);
//
////            actionsKeyMap.put(actionName, keyStroke);
//        }

//        Iterator itr = actionsKeyMap.keySet().iterator();
//
//        while(itr.hasNext())
//        {
//            String actionName = (String) itr.next();
//            KeyStroke keyStroke
//        }

        if(shortcutTableModel.getColumnCount() == 3)
            shortcutTableJPanel.getJTable().setDefaultRenderer(shortcutTableModel.getColumnClass(2), renderer);
    }

    public void readShortcuts()
    {
        SanchayShortcutsData.readShortcuts(shortcutTableModel, actions, customInputMap, customActionMap, actionsKeyMap);

//        for (int i = 0; i < actions.length; i++)
//        {
//            String actionName = (String) actions[i].getValue(Action.NAME);
//
//            KeyStroke keyStroke = (KeyStroke) shortcutTableModel.getValueAt(i, 2);
//
//            getCustomInputMap().put(keyStroke, actionName);
//            getCustomActionMap().put(actionName, actions[i]);
//
//            actionsKeyMap.put(actionName, keyStroke);
//        }
    }

    public void setDialog(JDialog dialog) {
        this.dialog = dialog;
    }

    public LinkedHashMap<String,KeyStroke> getActionKeyMap()
    {
        return actionsKeyMap;
    }

    public void setActionKeyMap(LinkedHashMap<String,KeyStroke> am)
    {
        actionsKeyMap = am;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

}
