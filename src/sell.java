import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shreyas
 */
public class sell extends javax.swing.JFrame {

    /**
     * Creates new form sell
     */
    public sell() {
        initComponents();
    }
    sell(String userid)
    {
        initComponents();
        jLabel1.setText(userid);
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

        jTextField1 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 215, 187, -1));

        jTextField6.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 588, 188, -1));

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jButton1.setText("Details");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 274, -1, -1));

        jButton2.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jButton2.setText("Sell");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 656, 132, 39));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel3.setText("Product Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 355, 180, 35));

        jButton3.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.jpg"))); // NOI18N
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 750, 100, -1));

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 352, 188, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel4.setText("Brand");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 412, 163, 32));

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 408, 188, -1));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel5.setText("Quantity sold");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 491, 191, 39));

        jTextField4.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 490, 188, -1));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel6.setText("Sold to");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 543, 173, 33));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 129, 32));

        jTextField5.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 539, 188, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel2.setText("Enter product ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 214, 210, 42));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel7.setText("Price per piece");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 594, 173, 29));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 3, 30)); // NOI18N
        jLabel8.setText("Enter sale records");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 281, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel9.setText("Welcome");
        jLabel9.setOpaque(true);
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, -1, 32));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FoodpileLogo.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 740, 200, 70));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/54088843-healthy-food-background-studio-photo-of-different-fruits-on-white-wooden-table-high-resolution-produ.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 820));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String userid=jLabel1.getText();
        String icode=jTextField1.getText();
        if(icode==null)
        JOptionPane.showMessageDialog(this,"Enter product code");
        else
        {
            try
            {
                Class.forName("java.sql.DriverManager");
                Connection con=(Connection)DriverManager.getConnection
                ( FoodPileDataSource.connect,FoodPileDataSource.userid,FoodPileDataSource.passwd);
                Statement stmt=(Statement)con.createStatement();
                String query="SELECT name,brand from item where itemcode='"+icode+"' and userid='"+userid+"';";
                ResultSet rs=stmt.executeQuery(query);
                if (rs.next())
                {     jTextField2.setText((String)rs.getString("name"));
                    jTextField3.setText((String)rs.getString("brand"));

                }

                else  JOptionPane.showMessageDialog (this,"Sorry! Invalid Product Code");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,e.getMessage());
            }

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String userid=jLabel1.getText();
        String icode=jTextField1.getText();
        String qnty=jTextField4.getText();
        String cons=jTextField5.getText();
        String sp=jTextField6.getText();
        if(qnty==null||cons==null||sp==null)
        JOptionPane.showMessageDialog(this,"Enter all records");
        else
        {
            try{
                java.util.Date date=new java.util.Date();
                java.sql.Date sqlDate=new java.sql.Date(date.getTime());
                Class.forName("java.sql.DriverManager");
                Connection con=(Connection)DriverManager.getConnection
                (FoodPileDataSource.connect,FoodPileDataSource.userid,FoodPileDataSource.passwd);
                Statement stmt=(Statement)con.createStatement();
                String q1="SELECT THRESHOLD FROM ITEM WHERE ITEMCODE='"+icode+"' and userid='"+userid+"';";
                ResultSet rs1=stmt.executeQuery(q1);
                //String threshold;
                int th = 0,curr_qnty = 0;
                if(rs1.next())
                    th=rs1.getInt("threshold");
                String q2="Select quantity from item where ITEMCODE='"+icode+"' and userid='"+userid+"';";
                ResultSet rs2=stmt.executeQuery(q2);
                if(rs2.next())
                    curr_qnty=rs2.getInt("quantity");
                if(Integer.parseInt(qnty)>curr_qnty)
                    JOptionPane.showMessageDialog(this,"Sorry! we don;t havve this much quantity");
                else
                {
                    if(curr_qnty-Integer.parseInt(qnty)<th)
                    {

                         int input = JOptionPane.showConfirmDialog(this,
                    "The stock will be less than threshold. Do you want to sell?", "Confirmation",JOptionPane.YES_NO_OPTION);
                      if(input==0)
                      {icode=jTextField1.getText();
                       PreparedStatement ps=con.prepareStatement("INSERT INTO sell(itemcode, consumer, quantity, sprice,Sdate,userid) VALUES('"+icode+"','"+cons+"','"+qnty+"','"+sp+"',?,'"+userid+"')");
                    ps.setDate(1,sqlDate);
                    ps.executeUpdate();

                    String query="UPDATE item SET quantity=quantity-'"+qnty+"' where itemcode='"+icode+"'and userid='"+userid+"';";
                    stmt.executeUpdate(query);

                    JOptionPane.showMessageDialog(this,"Purchase Succesful\nThis product is now less in stock!!!");

                      }
                    
                }
                    else{
                        icode=jTextField1.getText();
                PreparedStatement ps=con.prepareStatement("INSERT INTO sell(itemcode, consumer, quantity, sprice,Sdate,userid) VALUES('"+icode+"','"+cons+"','"+qnty+"','"+sp+"',?,'"+userid+"')");
                ps.setDate(1,sqlDate);
                ps.executeUpdate();
                String query="UPDATE item SET quantity=quantity+'"+qnty+"' where itemcode='"+icode+"'and userid='"+userid+"';";
                stmt.executeUpdate(query);

                JOptionPane.showMessageDialog(this,"Purchase Succesful");}
                }
            }
            catch(Exception e)
            {JOptionPane.showMessageDialog(this,e.getMessage());}
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String user=jLabel1.getText();
        new home(user).setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(sell.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sell.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sell.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sell.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sell().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
