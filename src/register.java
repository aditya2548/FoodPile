import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.security.MessageDigest;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.util.regex.Matcher; 
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shreyas
 */
public class register extends javax.swing.JFrame {

    /**
     * Creates new form register
     */
    public register() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 3, 30)); // NOI18N
        jLabel1.setText("WELCOME NEW USER");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, 45));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 121, 38));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel3.setText("Userid");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 159, 35));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel4.setText("Mobile number");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 210, 35));

        jTextField1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 200, 40));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel5.setText("Email ID");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 159, 40));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel6.setText("Set a password");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 230, 36));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eye.png"))); // NOI18N
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton4MouseReleased(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, 20, 20));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eye.png"))); // NOI18N
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton5MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton5MouseReleased(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, 20, 20));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel7.setText("Re-enter the password");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, -1, 36));

        jTextField2.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 200, 40));

        jTextField3.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 200, 40));

        jTextField4.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 200, 40));

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jButton1.setText("Create user");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 540, -1, -1));

        jButton2.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jButton2.setText("Clear all fields");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 540, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.jpg"))); // NOI18N
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 630, 90, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/info.png"))); // NOI18N
        jLabel9.setText(" i");
        jLabel9.setToolTipText("The password should have atleast 6 characters.");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel9.setOpaque(true);
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, 25, 20));

        jPasswordField1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 200, 40));

        jPasswordField2.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 200, 40));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FoodpileLogo.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 670, 200, 50));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/54088843-healthy-food-background-studio-photo-of-different-fruits-on-white-wooden-table-high-resolution-produ.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String name=jTextField1.getText();
    String userid=jTextField2.getText();
    String mobile=jTextField3.getText();
    String email=jTextField4.getText();
    String psswd1=String.valueOf(jPasswordField1.getText());
    String psswd2=String.valueOf(jPasswordField2.getText());
    String psswd="";
    String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$"; 
                              
    Pattern pat = Pattern.compile(emailRegex);
    if(name.isEmpty())
        JOptionPane.showMessageDialog(this,"Enter a valid name");
    else if(userid.isEmpty())
        JOptionPane.showMessageDialog(this,"Enter a valid userid id");
    else if(mobile.isEmpty())
        JOptionPane.showMessageDialog(this,"Enter a valid mobile number");
    else if(pat.matcher(email).matches()==false)   
        JOptionPane.showMessageDialog(this,"Enter a valid Email ID");
    else if(psswd1.equals(psswd2)&&psswd1.length()>=6)
    {
        psswd=psswd1;
        try 
        {
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            md.update(psswd.getBytes());
            byte byteData[] = md.digest();
                    //convert the byte to hex format
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < byteData.length; i++) 
            {
                sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));               
            }
            String hexpsswd=sb.toString();
            Class.forName("java.sql.DriverManager");      
            Connection con = (Connection)DriverManager.getConnection (FoodPileDataSource.connect,FoodPileDataSource.userid,FoodPileDataSource.passwd);     
            Statement stmt = (Statement) con.createStatement();
            String query="INSERT INTO user VALUES('"+userid+"','"+name+"','"+hexpsswd+"','"+mobile+"','"+email+"');";
            stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(this,"User created");
        }
        catch(Exception e)
        {
            String mssg1=e.getMessage();
            if(mssg1.startsWith("Duplicate entry"))
            {
                JOptionPane.showMessageDialog(this,"This userid is already taken! Choose a different one");
            }
            
            else
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }
    else if(psswd1.equals(psswd2)==false)
    {
        JOptionPane.showMessageDialog(this,"Passwords are not matching");
    }  
    else
        JOptionPane.showMessageDialog(this,"Password should have minimum 6 characters");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    this.dispose();
    new login().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    jTextField1.setText("");
    jTextField2.setText("");
    jTextField3.setText("");
    jTextField4.setText("");
    jPasswordField1.setText("");
    jPasswordField2.setText("");
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
    jPasswordField1.setEchoChar('*');         // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
    jPasswordField1.setEchoChar('*');    // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed

    private void jButton5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MousePressed
    jPasswordField1.setEchoChar((char)0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5MousePressed

    private void jButton5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseReleased
    jPasswordField1.setEchoChar('*');         // TODO add your handling code here:
    }//GEN-LAST:event_jButton5MouseReleased

    private void jButton4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MousePressed
    jPasswordField2.setEchoChar((char)0);    // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MousePressed

    private void jButton4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseReleased
    jPasswordField2.setEchoChar('*');        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
