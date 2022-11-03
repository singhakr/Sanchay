/*
 * SubApplicationDescriptionJDialog.java
 *
 * Created on June 22, 2008, 10:03 PM
 */

package in.co.sanchay.gui.clients;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

import in.co.sanchay.GlobalProperties;
import in.co.sanchay.common.types.ClientType;
import in.co.sanchay.common.types.SanchayType;
import in.co.sanchay.util.UtilityFunctions;

/**
 *
 * @author  Rahul
 */
public class SubApplicationDescriptionJDialog extends javax.swing.JDialog {

    /** Creates new form SubApplicationDescriptionJDialog */
    public SubApplicationDescriptionJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        setTitle(GlobalProperties.getIntlString("About_a_Sanchay_Application"));

        BufferedImage image = null;

        try {
            image = javax.imageio.ImageIO.read(new File(GlobalProperties.getHomeDirectory() + "/" + "images/sanchay-logo.gif"));
        } catch (IOException ex) {
            Logger.getLogger(AboutDialog.class.getName()).log(Level.SEVERE, null, ex);
        }

        image = UtilityFunctions.getScaledInstance(image, logoJLabel.getWidth(), logoJLabel.getHeight(), UtilityFunctions.getDefaultConfiguration());

        ImageIcon icon = new ImageIcon(image, GlobalProperties.getIntlString("Sanchay"));

        logoJLabel.setIcon(icon);
        
        //runClientJComboBox.addItem("---Select an application---");
        
        Enumeration enm = ClientType.elements();
        
//        System.out.println("Second time??");
        while (enm.hasMoreElements()) {
//            System.out.println("");

            SanchayType u = (SanchayType) enm.nextElement();
            //String addThis=u.toString();
//            System.out.println("--->>" + u.getClassName());
            runClientJComboBox.addItem(u);
            //runClientJComboBox.add
            //runClientJComboBox.add(u);
            
            //runClientJComboBox.addItem(u.toString());
        }
        
//        this.setVisible(true);
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        runClientJComboBox = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        componentDescription = new javax.swing.JTextPane();
        emailTextJLabel = new javax.swing.JLabel();
        emailJLabel = new javax.swing.JLabel();
        logoJLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sub Application Description");

        runClientJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runClientJComboBoxActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(componentDescription);

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("sanchay"); // NOI18N
        emailTextJLabel.setText(bundle.getString("Please_send_your_comments_and_suggestions_to:")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(runClientJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailJLabel)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(emailTextJLabel)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(196, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(logoJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(196, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(runClientJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(emailTextJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(emailJLabel))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(49, 49, 49)
                    .addComponent(logoJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(47, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void runClientJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runClientJComboBoxActionPerformed
    //displays the details of the application selected
//    System.out.println("Action in the combo box");
//    if(runClientJComboBox.getSelectedIndex()==0)
//    {
//        //addThis
//        return;
//    }
//    else
//    {
        /*
        ClientType ctype = (ClientType) runClientJComboBox.getSelectedItem();


        String applicationName = ctype.toString();

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("sanchay/gui/clients/applicationDescription"); // NOI18N
          jTextPane1.setText(bundle.getString(applicationName));

        */
        
        int selected=runClientJComboBox.getSelectedIndex();
        
        ClientType temp=(ClientType)runClientJComboBox.getItemAt(selected);
        //String showThis=(ClientType)runClientJComboBox.getItemAt(selected);
        
        
        
        //String showThis=runClientJComboBox.getItemAt(selected).applicationDescription();
        
          //ApplicationDescription appl=(ApplicationDescription)temp.createSanchayClient(temp);
        String showThis=temp.applicationDescription(temp);
        
        componentDescription.setText(showThis);
        
//        String emailid=temp.email(temp);
        emailJLabel.setText("aiklavya@gmail.com");
        
//        System.out.println("An application selected");
        return;
        
    //}
    
}//GEN-LAST:event_runClientJComboBoxActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SubApplicationDescriptionJDialog dialog = new SubApplicationDescriptionJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane componentDescription;
    private javax.swing.JLabel emailJLabel;
    private javax.swing.JLabel emailTextJLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoJLabel;
    private javax.swing.JComboBox runClientJComboBox;
    // End of variables declaration//GEN-END:variables

}
