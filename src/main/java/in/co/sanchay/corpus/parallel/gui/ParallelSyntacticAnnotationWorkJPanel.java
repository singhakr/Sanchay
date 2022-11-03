/*
 * ParallelSyntacticAnnotationWorkJPanel.java
 *
 * Created on March 4, 2008, 12:55 AM
 */

package in.co.sanchay.corpus.parallel.gui;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;

import in.co.sanchay.GlobalProperties;
import in.co.sanchay.corpus.ssf.SSFSentence;
import in.co.sanchay.corpus.ssf.SSFStory;
import in.co.sanchay.gui.WorkJPanelInterface;
import in.co.sanchay.gui.clients.SanchayClient;
import in.co.sanchay.gui.common.JPanelDialog;
import in.co.sanchay.tree.gui.SyntacticAlignmentTransferHandler;
import in.co.sanchay.corpus.ssf.gui.SyntacticAnnotationWorkJPanel;
import in.co.sanchay.properties.KeyValueProperties;
import in.co.sanchay.common.types.ClientType;
import in.co.sanchay.corpus.ssf.gui.SyntacticAnnotationTaskSetupJPanel;

/**
 *
 * @author  anil
 */
public class ParallelSyntacticAnnotationWorkJPanel extends javax.swing.JPanel
    implements WorkJPanelInterface, JPanelDialog, SanchayClient {

    protected ClientType clientType = ClientType.LANGUAGE_ENCODING_IDENTIFIER;

    protected JFrame owner;
    protected JDialog dialog;
    protected Component parentComponent;

    protected JDialog workDialog;

    protected String taskName;
    protected KeyValueProperties kvTaskProps;

    protected String title = "";
    protected String srcLangEnc = GlobalProperties.getIntlString("eng::utf8");
    protected String tgtLangEnc = GlobalProperties.getIntlString("hin::utf8");

    protected SyntacticAnnotationWorkJPanel srcWorkJPanel;
    protected SyntacticAnnotationWorkJPanel tgtWorkJPanel;

    protected SSFSentence sentence;
    protected int currentPosition;
    protected boolean dirty;

    protected boolean standAloneMode;
    
    protected SSFStory ssfStory;
    
    /** Creates new form ParallelSyntacticAnnotationWorkJPanel */
    public ParallelSyntacticAnnotationWorkJPanel() {
        initComponents();

        parentComponent = this;
        
        kvTaskProps = SyntacticAnnotationTaskSetupJPanel.getDefaultTaskKVP();
    }

    public ParallelSyntacticAnnotationWorkJPanel(KeyValueProperties kvTaskProps) {
	this();

    	this.kvTaskProps = kvTaskProps;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainJSplitPane = new javax.swing.JSplitPane();
        bottomJPanel = new javax.swing.JPanel();
        beginJButton = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        mainJSplitPane.setResizeWeight(0.4);
        add(mainJSplitPane, java.awt.BorderLayout.CENTER);

        bottomJPanel.setLayout(new java.awt.BorderLayout());

        beginJButton.setText("Begin");
        beginJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beginJButtonActionPerformed(evt);
            }
        });
        bottomJPanel.add(beginJButton, java.awt.BorderLayout.CENTER);

        add(bottomJPanel, java.awt.BorderLayout.SOUTH);
    }// </editor-fold>//GEN-END:initComponents

    private void beginJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beginJButtonActionPerformed
        // TODO add your handling code here:
        ((SyntacticAlignmentTransferHandler) srcWorkJPanel.getSanchayTreeJPanel().getTransferHandler()).setTargetPanel(tgtWorkJPanel.getSanchayTreeJPanel());
        ((SyntacticAlignmentTransferHandler) tgtWorkJPanel.getSanchayTreeJPanel().getTransferHandler()).setTargetPanel(srcWorkJPanel.getSanchayTreeJPanel());
    }//GEN-LAST:event_beginJButtonActionPerformed

    public ClientType getClientType()
    {
        return clientType;
    }

    public void configure() {
        
        KeyValueProperties srcTaskKVP = null;
        KeyValueProperties tgtTaskKVP = null;
        
        srcTaskKVP = kvTaskProps.getCopy();
        tgtTaskKVP = kvTaskProps.getCopy();
        
        srcTaskKVP.removeProperty(GlobalProperties.getIntlString("SSFTgtCorpusStoryFile"));
        tgtTaskKVP.removeProperty(GlobalProperties.getIntlString("SSFSrcCorpusStoryFile"));

        srcTaskKVP.addProperty(GlobalProperties.getIntlString("SSFCorpusStoryFile"), srcTaskKVP.removeProperty(GlobalProperties.getIntlString("SSFSrcCorpusStoryFile")));
        tgtTaskKVP.addProperty(GlobalProperties.getIntlString("SSFCorpusStoryFile"), tgtTaskKVP.removeProperty(GlobalProperties.getIntlString("SSFTgtCorpusStoryFile")));
        
        srcTaskKVP.addProperty(GlobalProperties.getIntlString("SSFCorpusStoryUTF8File"), "");
        tgtTaskKVP.addProperty(GlobalProperties.getIntlString("SSFCorpusStoryUTF8File"), "");
        
	srcWorkJPanel = new SyntacticAnnotationWorkJPanel(srcTaskKVP);
	tgtWorkJPanel = new SyntacticAnnotationWorkJPanel(tgtTaskKVP);

        srcWorkJPanel.setOwner(this.getOwner());
        tgtWorkJPanel.setOwner(this.getOwner());

        srcWorkJPanel.setDialog(dialog);
        tgtWorkJPanel.setDialog(dialog);
        
        srcWorkJPanel.setTaskName(taskName);
        tgtWorkJPanel.setTaskName(taskName);

        srcWorkJPanel.setAlignmentMode(true);
        tgtWorkJPanel.setAlignmentMode(true);

//        srcWorkJPanel.configure();
//        tgtWorkJPanel.configure();
//        
//        srcWorkJPanel.showBottomJPanel(false);
//        srcWorkJPanel.showCommentJPanel(false);
//        srcWorkJPanel.getSanchayTreeJPanel().setNodeTextEditable(true);
//        
//        tgtWorkJPanel.showBottomJPanel(false);
//        tgtWorkJPanel.showCommentJPanel(false);
//        tgtWorkJPanel.getSanchayTreeJPanel().setNodeTextEditable(true);
        
        mainJSplitPane.setLeftComponent(srcWorkJPanel);    
        mainJSplitPane.setRightComponent(tgtWorkJPanel);        
    }

//    public void setCurrentPosition(int cp) {
//        int slSize = ssfStory.countSentences();
//        if(cp >= 0 && cp < slSize) {
//            if(cp != currentPosition) {
//                storeCurrentPosition();
//                currentPosition = cp;
//            }
//
//            displayCurrentPosition();
//        }
//    }
//
//    private void storeCurrentPosition() {
//        if(sentence != null && dirty == true) {
//            JTree jtree = ssfPhraseJPanel.getJTree();
//            TreePath currentSelection = jtree.getSelectionPath();
//
//            if (currentSelection != null) {
//                SanchayMutableTreeNode currentNode = (SanchayMutableTreeNode) (currentSelection.getLastPathComponent());
//                ssfPhraseJPanel.saveTreeNode(currentNode);
//            }
//
//            ssfStory.modifySentence(sentence, currentPosition);
//            commentsPT.modifyToken(commentJTextArea.getText(), currentPosition);
//            dirty = false;
//        }
//    }
//
//    private void displayCurrentPosition() {
//        if(dirty == false) {
//            try {
//                SSFSentenceImpl storySentence = (SSFSentenceImpl) ssfStory.getSentence(currentPosition);
//                sentence = (SSFSentence) storySentence.getCopy();
//                dirty = true;
//            } catch (Exception ex) {
//                ex.printStackTrace();
//            }
//        }
//
//        comment = (String) commentsPT.getToken(currentPosition);
//        commentJTextArea.setText(comment);
//
//        ssfPhraseJPanel.getModel().setRoot(sentence.getRoot());
//        ssfPhraseJPanel.expandAll(null);
//
//        String currentPositionString = Integer.toString(currentPosition + 1);
//        positionJComboBox.setSelectedItem(currentPositionString);
//
//        ssfPhraseJPanel.initTreeJPanel();
//
//        // Moved to TreeJPanel
//        //senJTextArea.setText(sentence.getRoot().convertToBracketForm(1));
////      toggleTgtUTF8(utf8Shown);
//    }
//
//    private void clearCurrentPosition(long annotationLevelsFlag) {
//        if(UtilityFunctions.flagOn(annotationLevelsFlag, SSFCorpus.COMMENTS))
//            commentsPT.modifyToken("", currentPosition);
//
////        sentence.getRoot().flatten();
//        sentence.clearAnnotation(annotationLevelsFlag);
//    }
//
//    private void clearPosition(int pos) {
//        int count = ssfStory.countSentences();
//
//        if(pos >= 0 && pos < count) {
//            commentsPT.modifyToken("", pos);
//            SSFSentence sen = (SSFSentenceImpl) ssfStory.getSentence(pos);
//            sen.getRoot().flatten();
//        }
//    }
//
//    private void resetCurrentPosition() {
//        try {
//            SSFSentenceImpl storySentence = (SSFSentenceImpl) ssfStory.getSentence(currentPosition);
//            sentence = (SSFSentence) storySentence.getCopy();
//            dirty = true;
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//
//        displayCurrentPosition();
//    }

    public void convertToXML(String f, String charset) throws FileNotFoundException, UnsupportedEncodingException {
        PrintStream ps = new PrintStream(f, charset);
        printXML(ps);
    }

    public String getLangEnc()
    {
        return srcLangEnc;
    }

    public String getTgtLangEnc()
    {
        return tgtLangEnc;
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
    
    public void setDialog(JDialog d)
    {
        dialog = d;
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
    
    public void setTaskName(String tn)
    {
        taskName = tn;
    }

    public String getXML(int pos) {
        return null;        
    }

    public void printXML(PrintStream ps) {
    }
    
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
	
        JFrame.setDefaultLookAndFeelDecorated(true);

        //Create and set up the window.
        JFrame frame = new JFrame(GlobalProperties.getIntlString("Sanchay_Syntactic_Annotation"));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
        JDialog taskDialog = new JDialog(frame, GlobalProperties.getIntlString("Task_Panel"), true);

	ParallelSyntacticAnnotationTaskSetupJPanel taskJPanel = new ParallelSyntacticAnnotationTaskSetupJPanel();
        
        taskJPanel.setOwner(frame);
        taskJPanel.setDialog(taskDialog);
        
        taskDialog.add(taskJPanel);
        taskDialog.setBounds(280, 160, 500, 440);
	
        taskDialog.setVisible(true);
	
	KeyValueProperties taskKVP = taskJPanel.getTaskProps();

        //Create and set up the content pane.
	ParallelSyntacticAnnotationWorkJPanel newContentPane = null;

	newContentPane = new ParallelSyntacticAnnotationWorkJPanel(taskKVP);
	
        newContentPane.setOwner(frame);
        newContentPane.setTaskName(taskKVP.getPropertyValue(GlobalProperties.getIntlString("TaskName")));
        newContentPane.configure();
	
	newContentPane.owner = frame;
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);

        //Display the window.
        frame.pack();
	
        int xinset = 40;
        int yinset = 60;
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setBounds(xinset, yinset,
		screenSize.width  - xinset*2,
		screenSize.height - yinset*2);

	frame.setVisible(true);
    }
//
//    public void save() {
//        Cursor cursor = getParent().getCursor();
//        getParent().setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
//
//        storeCurrentPosition();
//
//        try {
//            kvTaskProps.addProperty("CurrentPosition", Integer.toString(currentPosition + 1));
//            kvTaskProps.save(kvTaskProps.getPropertyValue("TaskPropFile"), kvTaskProps.getPropertyValue("TaskPropCharset"));
//
//            int count = ssfStory.countSentences();
//            for(int i = 0; i < count; i++) {
//                String cmt = commentsPT.getToken(i);
//                String spstr[] = cmt.split("[\n]");
//
//                cmt = "";
//                for(int j = 0; j < spstr.length; j++) {
//                    if(j < spstr.length - 1)
//                        cmt += spstr[j] + " ";
//                    else
//                        cmt += spstr[j];
//                }
//
//                commentsPT.modifyToken(cmt, i);
//            }
//
//            commentsPT.save(kvTaskProps.getPropertyValue("TaskPropFile") + ".comments", "UTF-8");
//
//            ssfStory.save(kvTaskProps.getPropertyValue("SSFCorpusStoryFile"),
//                    kvTaskProps.getPropertyValue("SSFCorpusCharset"));
//        } catch(Exception e) {
//            JOptionPane.showMessageDialog(parentComponent, "Error while saving.", "Error", JOptionPane.ERROR_MESSAGE);
//            e.printStackTrace();
//        }
//
//        // May be needed
////        setCurrentPosition(currentPosition + 1);
//        setCurrentPosition(currentPosition);
//
////        dialog.setVisible(false);
//
//        getParent().setCursor(cursor);
//    }

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
    private javax.swing.JButton beginJButton;
    private javax.swing.JPanel bottomJPanel;
    private javax.swing.JSplitPane mainJSplitPane;
    // End of variables declaration//GEN-END:variables
    
}