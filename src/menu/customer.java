/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import koneksi.koneksi;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;

/**
 *
 * @author Rofi Setiawan
 */
public class customer extends javax.swing.JFrame {
    Connection con;
    Statement stm;
    ResultSet rs;
    private DefaultTableModel tabmode;
    String sql;
    /**
     * Creates new form customer
     */
    public customer() {
        initComponents();
        
        koneksi DB = new koneksi();
        DB.config();
        con = DB.con;
        stm = DB.stm;
        
        datatable();
        setLocationRelativeTo(null);
    }
    
     protected void aktif(){
        id_Customer.setEnabled(true);
        nama_Customer.setEnabled(true);
        no_Hp.setEnabled(true);
        alamat_Customer.setEnabled(true);
    }
    
    protected void kosong(){
        id_Customer.setText("");
        nama_Customer.setText("");
        no_Hp.setText("");
        alamat_Customer.setText("");
    }
    
    protected void datatable(){
        Object[] Baris={"ID Customer","Nama Customer","NO HP","Alamat Customer"};
        tabmode = new DefaultTableModel (null, Baris);
        tabel_Customer.setModel(tabmode);
        sql="SELECT*from customer";
        
        try{
            java.sql.Statement stat = con.createStatement();
            rs =stat.executeQuery(sql);
            while (rs.next()){
                String a=rs.getString("id_Customer");
                String b=rs.getString("nama_Customer");
                String c=rs.getString("noHp");
                String d=rs.getString("alamat_Customer");
                
                String[] data={a,b,c,d};
                tabmode.addRow(data);
            }
        }catch(SQLException e){
            System.err.println(e);
        }
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
        id_Customer = new javax.swing.JTextField();
        nama_Customer = new javax.swing.JTextField();
        no_Hp = new javax.swing.JTextField();
        alamat_Customer = new javax.swing.JTextField();
        cari_Barang = new javax.swing.JTextField();
        tombol_Cari = new javax.swing.JButton();
        tombol_Simpan = new javax.swing.JButton();
        tombol_Ubah = new javax.swing.JButton();
        tombol_Hapus = new javax.swing.JButton();
        tombol_Kembali = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_Customer = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        tombol_Refresh = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().
            getResource("/menu/bntech.jpg")).getImage());
    getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
    jLabel1.setText("ID Customer");
    getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, -1, -1));

    jLabel2.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
    jLabel2.setText("Nama Customer");
    getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, -1, -1));

    jLabel3.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
    jLabel3.setText("No HP");
    getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, -1, -1));

    jLabel4.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
    jLabel4.setText("Alamat Customer");
    getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, -1, -1));

    id_Customer.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            id_CustomerActionPerformed(evt);
        }
    });
    getContentPane().add(id_Customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 210, -1));

    nama_Customer.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            nama_CustomerActionPerformed(evt);
        }
    });
    getContentPane().add(nama_Customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 210, -1));

    no_Hp.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            no_HpActionPerformed(evt);
        }
    });
    getContentPane().add(no_Hp, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 210, -1));

    alamat_Customer.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            alamat_CustomerActionPerformed(evt);
        }
    });
    getContentPane().add(alamat_Customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 210, -1));

    cari_Barang.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            cari_BarangActionPerformed(evt);
        }
    });
    getContentPane().add(cari_Barang, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 210, -1));

    tombol_Cari.setText("CARI");
    tombol_Cari.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            tombol_CariActionPerformed(evt);
        }
    });
    getContentPane().add(tombol_Cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 290, -1, -1));

    tombol_Simpan.setText("SIMPAN");
    tombol_Simpan.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            tombol_SimpanActionPerformed(evt);
        }
    });
    getContentPane().add(tombol_Simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, 122, -1));

    tombol_Ubah.setText("UBAH");
    tombol_Ubah.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            tombol_UbahActionPerformed(evt);
        }
    });
    getContentPane().add(tombol_Ubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, 122, -1));

    tombol_Hapus.setText("HAPUS");
    tombol_Hapus.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            tombol_HapusActionPerformed(evt);
        }
    });
    getContentPane().add(tombol_Hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 210, 122, -1));

    tombol_Kembali.setText("<");
    tombol_Kembali.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            tombol_KembaliActionPerformed(evt);
        }
    });
    getContentPane().add(tombol_Kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 40, -1));

    tabel_Customer.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null}
        },
        new String [] {
            "Title 1", "Title 2", "Title 3", "Title 4"
        }
    ));
    tabel_Customer.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            tabel_CustomerMouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(tabel_Customer);

    getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 340, 519, 114));

    jLabel5.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
    jLabel5.setText("CUSTOMER");
    getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, -1, -1));

    tombol_Refresh.setText("REFRESH");
    tombol_Refresh.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            tombol_RefreshActionPerformed(evt);
        }
    });
    getContentPane().add(tombol_Refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, 122, -1));

    jLabel7.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
    jLabel7.setText("Cari Barang");
    getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, -1, -1));

    jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/menu.png"))); // NOI18N
    getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void id_CustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_CustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_CustomerActionPerformed

    private void nama_CustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nama_CustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nama_CustomerActionPerformed

    private void no_HpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no_HpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_no_HpActionPerformed

    private void alamat_CustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamat_CustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alamat_CustomerActionPerformed

    private void cari_BarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cari_BarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cari_BarangActionPerformed

    private void tombol_CariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_CariActionPerformed
        // TODO add your handling code here:
        Object[] Baris={"ID Customer","Nama Customer","NO HP","Alamat Customer"};
        tabmode = new DefaultTableModel (null, Baris);
        tabel_Customer.setModel(tabmode);
        sql="SELECT*from customer where id_Customer like'%"+cari_Barang.getText()+"%'";
        
        try{
            java.sql.Statement stat = con.createStatement();
            rs =stat.executeQuery(sql);
            while (rs.next()){
                String a=rs.getString("id_Customer");
                String b=rs.getString("nama_Customer");
                String c=rs.getString("noHp");
                String d=rs.getString("alamat_Customer");
                
                String[] data={a,b,c,d};
                tabmode.addRow(data);
            }
        }catch(SQLException e){
            System.err.println(e);
        }
    }//GEN-LAST:event_tombol_CariActionPerformed

    private void tombol_SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_SimpanActionPerformed
        // TODO add your handling code here:
        sql="insert into customer values(?,?,?,?)";
        try{
            PreparedStatement stat= con.prepareStatement(sql);
            stat.setString(1, id_Customer.getText());
            stat.setString(2, nama_Customer.getText());
            stat.setString(3, no_Hp.getText());
            stat.setString(4, alamat_Customer.getText());

            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            kosong();
            id_Customer.requestFocus();
            datatable();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan" + e);
        }
    }//GEN-LAST:event_tombol_SimpanActionPerformed

    private void tombol_UbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_UbahActionPerformed
        // TODO add your handling code here:
        try{
            sql = "update customer set nama_Customer=?, noHp=?, alamat_Customer=? where id_Customer=?";
            PreparedStatement stat= con.prepareStatement(sql);
            
            stat.setString(1, nama_Customer.getText());
            stat.setString(2, no_Hp.getText());
            stat.setString(3, alamat_Customer.getText());
            stat.setString(4, id_Customer.getText());
            
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
            kosong();
            id_Customer.requestFocus(true);
            datatable();

        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Data Gagal Diubah" + e);
            System.err.println(e);
        }
    }//GEN-LAST:event_tombol_UbahActionPerformed

    private void tombol_HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_HapusActionPerformed
        // TODO add your handling code here:
        int ok = JOptionPane.showConfirmDialog (null, "hapus","Konfirmasi Dialog",JOptionPane.YES_NO_CANCEL_OPTION);
        if (ok==0){
            sql = "delete from customer where id_Customer='"+id_Customer.getText()+"'";
            try{
                PreparedStatement stat = con.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
                kosong();
                id_Customer.requestFocus(true);
                datatable();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Data Gagal Dihapus" +e);
            }
        }
    }//GEN-LAST:event_tombol_HapusActionPerformed

    private void tombol_KembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_KembaliActionPerformed
        // TODO add your handling code here:
        dispose();
        menu r = new menu();
        r.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_tombol_KembaliActionPerformed

    private void tabel_CustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_CustomerMouseClicked
        // TODO add your handling code here:
        int bar = tabel_Customer.getSelectedRow();
        String a = tabmode.getValueAt (bar, 0).toString();
        String b = tabmode.getValueAt (bar, 1).toString();
        String c = tabmode.getValueAt (bar, 2).toString();
        String d = tabmode.getValueAt (bar, 3).toString();

        id_Customer.setText(a);
        nama_Customer.setText(b);
        no_Hp.setText(c);
        alamat_Customer.setText(d);
    }//GEN-LAST:event_tabel_CustomerMouseClicked

    private void tombol_RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_RefreshActionPerformed
        // TODO add your handling code here:
        Object[] Baris={"ID Customer","Nama Customer","NO HP","Alamat Customer"};
        tabmode = new DefaultTableModel (null, Baris);
        tabel_Customer.setModel(tabmode);
        sql="SELECT*from customer";
        
        try{
            java.sql.Statement stat = con.createStatement();
            rs =stat.executeQuery(sql);
            while (rs.next()){
                String a=rs.getString("id_Customer");
                String b=rs.getString("nama_Customer");
                String c=rs.getString("noHp");
                String d=rs.getString("alamat_Customer");
                
                String[] data={a,b,c,d};
                tabmode.addRow(data);
            }
        }catch(SQLException e){
            System.err.println(e);
        }
    }//GEN-LAST:event_tombol_RefreshActionPerformed

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
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamat_Customer;
    private javax.swing.JTextField cari_Barang;
    private javax.swing.JTextField id_Customer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nama_Customer;
    private javax.swing.JTextField no_Hp;
    private javax.swing.JTable tabel_Customer;
    private javax.swing.JButton tombol_Cari;
    private javax.swing.JButton tombol_Hapus;
    private javax.swing.JButton tombol_Kembali;
    private javax.swing.JButton tombol_Refresh;
    private javax.swing.JButton tombol_Simpan;
    private javax.swing.JButton tombol_Ubah;
    // End of variables declaration//GEN-END:variables
}
