/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package menu;
import koneksi.koneksi;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.*;


/**
 *
 * @author Rofi Setiawan
 */
 public class registrasi_admin extends javax.swing.JFrame {
    Connection con;
    Statement stm;
    ResultSet rs;
    String sql;
        
    protected void active() {
        tusername.setEnabled(true);
        tpassword.setEnabled(true);
        tcfpassword.setEnabled(true);
        tusername.requestFocus();
    }
    
    protected void blank() {
        tusername.setText("");
        tpassword.setText("");
        tcfpassword.setText("");
    }
    
    public registrasi_admin() {
        initComponents();
        koneksi DB = new koneksi();
        DB.config();
        con = DB.con;
        stm = DB.stm;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tombol_Daftar = new javax.swing.JButton();
        tombol_Hapus = new javax.swing.JButton();
        tusername = new javax.swing.JTextField();
        tpassword = new javax.swing.JPasswordField();
        tcfpassword = new javax.swing.JPasswordField();
        tombol_Akun = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().
            getResource("/menu/bntech.jpg")).getImage());
    getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel1.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
    jLabel1.setText("Buat Akun Admin");
    getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, -1, -1));

    jLabel2.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
    jLabel2.setText("Username");
    getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 133, -1));

    jLabel3.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
    jLabel3.setText("Password");
    getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 133, -1));

    jLabel4.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
    jLabel4.setText("Konfirmasi Password");
    getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, -1, -1));

    tombol_Daftar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    tombol_Daftar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/add-friend.png"))); // NOI18N
    tombol_Daftar.setText("DAFTAR");
    tombol_Daftar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            tombol_DaftarActionPerformed(evt);
        }
    });
    getContentPane().add(tombol_Daftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 311, 120, 40));

    tombol_Hapus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    tombol_Hapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/cancel.png"))); // NOI18N
    tombol_Hapus.setText("HAPUS");
    tombol_Hapus.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            tombol_HapusActionPerformed(evt);
        }
    });
    getContentPane().add(tombol_Hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 311, 120, 40));

    tusername.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            tusernameActionPerformed(evt);
        }
    });
    getContentPane().add(tusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 185, -1));
    getContentPane().add(tpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 185, -1));
    getContentPane().add(tcfpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 185, -1));

    tombol_Akun.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    tombol_Akun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/user (1).png"))); // NOI18N
    tombol_Akun.setText("SUDAH PUNYA AKUN ");
    tombol_Akun.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            tombol_AkunActionPerformed(evt);
        }
    });
    getContentPane().add(tombol_Akun, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, -1, 40));

    jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/menu.png"))); // NOI18N
    getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tusernameActionPerformed

    private void tombol_DaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_DaftarActionPerformed
        // TODO add your handling code here:
        String username = tusername.getText();
        String password = tpassword.getText();
        String password2 = tcfpassword.getText();
        try {
            if(!password.equals(password2)) {
                JOptionPane.showMessageDialog(null, "password anda salah");
                tpassword.setText("");
                tcfpassword.setText("");
            } else {
                sql = "insert into user_admin values('" + username + "','" + password + "')";
                stm = con.createStatement();
                int SA= stm.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "registrasi berhasil");
                tusername.setText("");
                tpassword.setText("");
                tcfpassword.setText("");
                tusername.requestFocus(true);
                dispose();
                login_admin r = new login_admin();
                r.setVisible(true);
                this.setVisible(false);
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Registrasi gagal - " + e);
        } 
        
    }//GEN-LAST:event_tombol_DaftarActionPerformed

    private void tombol_HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_HapusActionPerformed
        // TODO add your handling code here:
        tusername.setText("");
        tpassword.setText("");
        tcfpassword.setText("");
        tusername.requestFocus();
    }//GEN-LAST:event_tombol_HapusActionPerformed

    private void tombol_AkunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_AkunActionPerformed
        // TODO add your handling code here:
        dispose();
        login_admin r = new login_admin();
        r.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_tombol_AkunActionPerformed

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
            java.util.logging.Logger.getLogger(registrasi_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrasi_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrasi_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrasi_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrasi_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField tcfpassword;
    private javax.swing.JButton tombol_Akun;
    private javax.swing.JButton tombol_Daftar;
    private javax.swing.JButton tombol_Hapus;
    private javax.swing.JPasswordField tpassword;
    private javax.swing.JTextField tusername;
    // End of variables declaration//GEN-END:variables

    private void setText() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private PreparedStatement setString(int i, String username) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setLocationRelativeTo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
