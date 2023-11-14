/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class forgetpass extends javax.swing.JFrame {

    /**
     * Creates new form forgetpass
     */
    public forgetpass() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        label1 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        type = new javax.swing.JTextField();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        email = new java.awt.TextField();
        label4 = new java.awt.Label();
        phno = new java.awt.TextField();
        label5 = new java.awt.Label();
        newpass = new javax.swing.JPasswordField();
        label7 = new java.awt.Label();
        renewpass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton2.setText("Mainpage");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 150, 40));

        label1.setBackground(new java.awt.Color(255, 255, 255));
        label1.setFont(new java.awt.Font("Garamond", 1, 48)); // NOI18N
        label1.setText("FORGOT PASSWORD?");
        getContentPane().add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, -1, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("TYPE(DR/PAT)");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 210, 40));

        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });
        getContentPane().add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 420, 30));

        label2.setAlignment(java.awt.Label.CENTER);
        label2.setBackground(new java.awt.Color(255, 255, 255));
        label2.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        label2.setText("Don't worry we're on it.");
        getContentPane().add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 370, -1));

        label3.setBackground(new java.awt.Color(255, 255, 255));
        label3.setFont(new java.awt.Font("Calisto MT", 1, 36)); // NOI18N
        label3.setText("EMAIL");
        getContentPane().add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 130, 40));

        email.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 420, 40));

        label4.setBackground(new java.awt.Color(255, 255, 255));
        label4.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        label4.setText("PHONE NUMBER");
        getContentPane().add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 390, 310, -1));

        phno.setFont(new java.awt.Font("Constantia", 1, 36)); // NOI18N
        phno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phnoActionPerformed(evt);
            }
        });
        getContentPane().add(phno, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, 420, 40));

        label5.setAlignment(java.awt.Label.CENTER);
        label5.setBackground(new java.awt.Color(255, 255, 255));
        label5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label5.setFont(new java.awt.Font("Ebrima", 1, 36)); // NOI18N
        label5.setText("SET PASSWORD");
        getContentPane().add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 480, 310, 40));

        newpass.setBackground(new java.awt.Color(204, 204, 204));
        newpass.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        newpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newpassActionPerformed(evt);
            }
        });
        getContentPane().add(newpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 480, 420, 40));

        label7.setBackground(new java.awt.Color(255, 255, 255));
        label7.setFont(new java.awt.Font("Eras Bold ITC", 1, 24)); // NOI18N
        label7.setText("RETYPE NEW PASSWORD");
        getContentPane().add(label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 560, 370, -1));

        renewpass.setBackground(new java.awt.Color(255, 255, 255));
        renewpass.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        getContentPane().add(renewpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 550, 420, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("ENTER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 450, 210, 70));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/rsz_1pexels-pixabay-532173.jpg"))); // NOI18N
        jLabel2.setText("TYPE NEW PASSWORD");
        jLabel2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jLabel2FocusLost(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel2FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2FocusLost

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String Type = type.getText();
        String Email = email.getText();
        String PHno = phno.getText();
        String Newpass = newpass.getText();
        String Renewpass = renewpass.getText();

        if ("DR".equals(Type)) {

            if (Type.isEmpty() || Email.isEmpty() || PHno.isEmpty() || Newpass.isEmpty() || Renewpass.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Don't Keep Any Field Empty");
            } else if (!Renewpass.equals(Newpass)) {
                JOptionPane.showMessageDialog(this, "Retype Password Correctly");

            } else {

                try (BufferedReader reader = new BufferedReader(new FileReader("doctordetails.txt"))) {
                    StringBuilder updatedContent = new StringBuilder();
                    String line;
                    while ((line = reader.readLine()) != null) {

                        // Assuming each line in the file contains email, phone number, and password separated by a delimiter (e.g., comma)
                        String[] parts = line.split("   ");
                        String storedEmail = parts[4];
                        String storedPhone = parts[1];

                        if (Email.equals(storedEmail) && PHno.equals(storedPhone)) {
                            // Update the password in the parts array
                            parts[2] = Newpass;
                            parts[5] = Renewpass;

                            // Reconstruct the line with the updated password
                            line = String.join("   ", parts);
                        }

                        updatedContent.append(line).append(System.lineSeparator());

                    }

                    // Write the updated content back to the file
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter("doctordetails.txt"))) {
                        writer.write(updatedContent.toString());
                    }
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(forgetpass.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(forgetpass.class.getName()).log(Level.SEVERE, null, ex);
                }

                JOptionPane.showMessageDialog(this, "Update Successful");

            }
        }

        if ("PAT".equals(Type)) {
            if (Type.isEmpty() || Email.isEmpty() || PHno.isEmpty() || Newpass.isEmpty() || Renewpass.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Don't Keep Any Field Empty");
            } else if (!Renewpass.equals(Newpass)) {
                JOptionPane.showMessageDialog(this, "Retype Password Correctly");

            }
            
            else{
            try (BufferedReader reader = new BufferedReader(new FileReader("patientdetails.txt"))) {
                StringBuilder updatedContent = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    // Assuming each line in the file contains email, phone number, and password separated by a delimiter (e.g., comma)
                    String[] parts = line.split("   ");
                    String storedEmail = parts[4];
                    String storedPhone = parts[1];

                    if (Email.equals(storedEmail) && PHno.equals(storedPhone)) {
                        // Update the password in the parts array
                        parts[2] = Newpass;
                        parts[5] = Renewpass;

                        // Reconstruct the line with the updated password
                        line = String.join("   ", parts);
                    }

                    updatedContent.append(line).append(System.lineSeparator());
                }

                // Write the updated content back to the file
                try (BufferedWriter writer = new BufferedWriter(new FileWriter("patientdetails.txt"))) {
                    writer.write(updatedContent.toString());
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(forgetpass.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(forgetpass.class.getName()).log(Level.SEVERE, null, ex);
            }

            JOptionPane.showMessageDialog(this, "Update Successful");

        }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeActionPerformed

    private void phnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phnoActionPerformed

    private void newpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newpassActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        mainpage mpg=new mainpage();
        mpg.show();
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(forgetpass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(forgetpass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(forgetpass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(forgetpass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new forgetpass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.TextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label7;
    private javax.swing.JPasswordField newpass;
    private java.awt.TextField phno;
    private javax.swing.JPasswordField renewpass;
    private javax.swing.JTextField type;
    // End of variables declaration//GEN-END:variables
}