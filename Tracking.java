/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tonmoy
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class Tracking extends javax.swing.JFrame {
Connection conn;
PreparedStatement pst;
ResultSet rs;
    /**
     * Creates new form Tracking
     */
    public Tracking() {
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

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(206, 90, 156, 53);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(210, 180, 160, 50);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(200, 250, 180, 40);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(220, 310, 210, 30);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(200, 360, 290, 30);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(200, 410, 270, 20);

        jLabel1.setText("id");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 110, 8, 14);

        jLabel2.setText("dep");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 190, 18, 14);

        jLabel3.setText("ariuval");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 260, 32, 14);

        jLabel4.setText("present");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(90, 330, 37, 14);

        jLabel5.setText("due");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(90, 380, 18, 14);

        jLabel6.setText("place");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(100, 420, 25, 14);

        jButton1.setText("show");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(490, 300, 57, 23);

        jButton2.setText("show1");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(410, 100, 63, 23);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(440, 180, 160, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        conn=MysqlConnect.ConnectionDB();
        String id=jTextField1.getText();
        
        try{
            pst=conn.prepareStatement("select * from trac where id=?"); 
            pst.setString(1, id);
            rs=pst.executeQuery();
            if(rs.next())
            {
                String add1=rs.getString("dep");
                jTextField2.setText(add1);
                String add2=rs.getString("arival");
                jTextField3.setText(add2);
                
            }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String a=jTextField2.getText();
        String b=jTextField3.getText();
        String e=jTextField4.getText();
        
        float c=Float.parseFloat(b) - Float.parseFloat(a);
        String d=String.valueOf(c);
        jTextField7.setText(d);
        
        float f=Float.parseFloat(b) - Float.parseFloat(e);
        String g=String.valueOf(f);
        jTextField5.setText(g);
        
        if(f<=7.34 & f>7.00)
        {
            jTextField6.setText("Dhaka");
        }
        else if(f<6.99 & f>5.10)
        {
            jTextField6.setText("Gabtoli");
        }
        else if(f<5.09 & f>4.30)
        {
            jTextField6.setText("Manikgonj");
        }
        else if(f<4.29 & f>4.00)
        {
            jTextField6.setText("Shibaloy");
        }
        else if(f<3.99 & f>2.99)
        {
            jTextField6.setText("Goalondo");
        }
        else if(f<2.99 & f>1.99)
        {
            jTextField6.setText("Modhukhali");
        }
        else if(f<1.98 & f>1.40)
        {
            jTextField6.setText("Magura");
        }
        else if(f<1.39 & f>1.00)
        {
            jTextField6.setText("Khajura");
        }
        else if(f<.99 & f>0.00)
        {
            jTextField6.setText("Jessore");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Tracking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tracking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tracking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tracking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tracking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}