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
public class barang_keluar extends javax.swing.JFrame {
    Connection con;
    Statement stm;
    ResultSet rs;
    private DefaultTableModel tabmode;
    String sql;
    /**
     * Creates new form barang_keluar
     */
    public barang_keluar() {
        initComponents();
        
        koneksi DB = new koneksi();
        DB.config();
        con = DB.con;
        stm = DB.stm;
        
        datatable();
        setLocationRelativeTo(null);
    }
    
     protected void aktif(){
        kd_BarangKeluar.setEnabled(true);
        kd_Barang.setEnabled(true);
        id_Customer.setEnabled(true);
        nama_Barang.setEnabled(true);
        jumlah_Keluar.setEnabled(true);
        tanggal_Keluar.setEnabled(true);
    }
    
    protected void kosong(){
        kd_BarangKeluar.setText("");
        kd_Barang.setText("");
        id_Customer.setText("");
        nama_Barang.setText("");
        jumlah_Keluar.setText("");
        tanggal_Keluar.setText("");
    }
    
    protected void datatable(){
        Object[] Baris={"Kode Barang Keluar","Kode Barang","ID Customer","Nama Barang","Jumlah Keluar","Tanggal Keluar"};
        tabmode = new DefaultTableModel (null, Baris);
        tabel_BarangKeluar.setModel(tabmode);
        sql="SELECT*from barang_keluar";
        
        try{
            java.sql.Statement stat = con.createStatement();
            rs =stat.executeQuery(sql);
            while (rs.next()){
                String a=rs.getString("kd_BarangKeluar");
                String b=rs.getString("kd_Barang");
                String c=rs.getString("id_Customer");
                String d=rs.getString("nama_Barang");
                String e=rs.getString("jumlah_Keluar");
                String f=rs.getString("tanggal_Keluar");
                
                String[] data={a,b,c,d,e,f};
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
        kd_BarangKeluar = new javax.swing.JTextField();
        kd_Barang = new javax.swing.JTextField();
        id_Customer = new javax.swing.JTextField();
        nama_Barang = new javax.swing.JTextField();
        cari_Barang = new javax.swing.JTextField();
        tombol_Cari = new javax.swing.JButton();
        tombol_Simpan = new javax.swing.JButton();
        tombol_Ubah = new javax.swing.JButton();
        tombol_Hapus = new javax.swing.JButton();
        tombol_Kembali = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_BarangKeluar = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        tombol_Refresh = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jumlah_Keluar = new javax.swing.JTextField();
        tanggal_Keluar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().
            getResource("/menu/bntech.jpg")).getImage());
    getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
    jLabel1.setText("Kode Barang Keluar");
    getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, -1));

    jLabel2.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
    jLabel2.setText("Kode Barang");
    getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, -1, -1));

    jLabel3.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
    jLabel3.setText("ID Pelanggan");
    getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, -1, -1));

    jLabel4.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
    jLabel4.setText("Nama Barang");
    getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, -1, -1));

    kd_BarangKeluar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            kd_BarangKeluarActionPerformed(evt);
        }
    });
    getContentPane().add(kd_BarangKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 210, -1));

    kd_Barang.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            kd_BarangActionPerformed(evt);
        }
    });
    getContentPane().add(kd_Barang, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 210, -1));

    id_Customer.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            id_CustomerActionPerformed(evt);
        }
    });
    getContentPane().add(id_Customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 210, -1));

    nama_Barang.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            nama_BarangActionPerformed(evt);
        }
    });
    getContentPane().add(nama_Barang, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 210, -1));

    cari_Barang.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            cari_BarangActionPerformed(evt);
        }
    });
    getContentPane().add(cari_Barang, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, 210, -1));

    tombol_Cari.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    tombol_Cari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/magnifying-glass.png"))); // NOI18N
    tombol_Cari.setText("CARI");
    tombol_Cari.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            tombol_CariActionPerformed(evt);
        }
    });
    getContentPane().add(tombol_Cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, -1, -1));

    tombol_Simpan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    tombol_Simpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/diskette.png"))); // NOI18N
    tombol_Simpan.setText("SIMPAN");
    tombol_Simpan.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            tombol_SimpanActionPerformed(evt);
        }
    });
    getContentPane().add(tombol_Simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, 122, -1));

    tombol_Ubah.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    tombol_Ubah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/edit.png"))); // NOI18N
    tombol_Ubah.setText("UBAH");
    tombol_Ubah.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            tombol_UbahActionPerformed(evt);
        }
    });
    getContentPane().add(tombol_Ubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 122, -1));

    tombol_Hapus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    tombol_Hapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/delete.png"))); // NOI18N
    tombol_Hapus.setText("HAPUS");
    tombol_Hapus.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            tombol_HapusActionPerformed(evt);
        }
    });
    getContentPane().add(tombol_Hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 240, 122, -1));

    tombol_Kembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/previous.png"))); // NOI18N
    tombol_Kembali.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            tombol_KembaliActionPerformed(evt);
        }
    });
    getContentPane().add(tombol_Kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 40, -1));

    tabel_BarangKeluar.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null, null, null, null},
            {null, null, null, null, null, null},
            {null, null, null, null, null, null},
            {null, null, null, null, null, null}
        },
        new String [] {
            "Kode Barang Masuk", "Kode Barang", "Id Pelanggan", "Nama Barang", "Jumlah Keluar", "Tanggal Keluar"
        }
    ));
    tabel_BarangKeluar.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            tabel_BarangKeluarMouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(tabel_BarangKeluar);

    getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, 740, 114));

    jLabel5.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
    jLabel5.setText("BARANG KELUAR");
    getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, -1, -1));

    tombol_Refresh.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    tombol_Refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/refresh.png"))); // NOI18N
    tombol_Refresh.setText("SEGARKAN");
    tombol_Refresh.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            tombol_RefreshActionPerformed(evt);
        }
    });
    getContentPane().add(tombol_Refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, 122, -1));

    jLabel7.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
    jLabel7.setText("Cari Barang");
    getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, -1, -1));

    jLabel8.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
    jLabel8.setText("Jumlah Keluar");
    getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, -1, -1));

    jLabel9.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
    jLabel9.setText("Tanggal Keluar");
    getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, -1, -1));
    getContentPane().add(jumlah_Keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 210, -1));
    getContentPane().add(tanggal_Keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 210, -1));

    jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/menu.png"))); // NOI18N
    getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kd_BarangKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kd_BarangKeluarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kd_BarangKeluarActionPerformed

    private void kd_BarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kd_BarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kd_BarangActionPerformed

    private void id_CustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_CustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_CustomerActionPerformed

    private void nama_BarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nama_BarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nama_BarangActionPerformed

    private void cari_BarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cari_BarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cari_BarangActionPerformed

    private void tombol_CariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_CariActionPerformed
        // TODO add your handling code here:
        Object[] Baris={"Kode Barang Keluar","Kode Barang","ID Customer","Nama Barang","Jumlah Keluar","Tanggal Keluar"};
        tabmode = new DefaultTableModel (null, Baris);
        tabel_BarangKeluar.setModel(tabmode);
        sql="SELECT*from barang_keluar where kd_BarangKeluar like'%"+cari_Barang.getText()+"%'";
        
        try{
            java.sql.Statement stat = con.createStatement();
            rs =stat.executeQuery(sql);
            while (rs.next()){
                String a=rs.getString("kd_BarangKeluar");
                String b=rs.getString("kd_Barang");
                String c=rs.getString("id_Customer");
                String d=rs.getString("nama_Barang");
                String e=rs.getString("jumlah_Keluar");
                String f=rs.getString("tanggal_Keluar");
                
                String[] data={a,b,c,d,e,f};
                tabmode.addRow(data);
            }
        }catch(SQLException e){
            System.err.println(e);
        }
    }//GEN-LAST:event_tombol_CariActionPerformed

    private void tombol_SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_SimpanActionPerformed
        // TODO add your handling code here:
        sql="insert into barang_keluar values(?,?,?,?,?,?)";
        try{
            PreparedStatement stat= con.prepareStatement(sql);
            stat.setString(1, kd_BarangKeluar.getText());
            stat.setString(2, kd_Barang.getText());
            stat.setString(3, id_Customer.getText());
            stat.setString(4, nama_Barang.getText());
            stat.setString(5, jumlah_Keluar.getText());
            stat.setString(6, tanggal_Keluar.getText());

            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            kosong();
            kd_BarangKeluar.requestFocus();
            datatable();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan" + e);
        }
    }//GEN-LAST:event_tombol_SimpanActionPerformed

    private void tombol_UbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_UbahActionPerformed
        // TODO add your handling code here:
        try{
            sql = "update barang_keluar set kd_Barang=?, id_Customer=?, nama_Barang=?, jumlah_Keluar=?, tanggal_Keluar=? where kd_BarangKeluar=?";
            PreparedStatement stat= con.prepareStatement(sql);
            
            stat.setString(1, kd_Barang.getText());
            stat.setString(2, id_Customer.getText());
            stat.setString(3, nama_Barang.getText());
            stat.setString(4, jumlah_Keluar.getText());
            stat.setString(5, tanggal_Keluar.getText());
            stat.setString(6, kd_BarangKeluar.getText());
            
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
            kosong();
            kd_BarangKeluar.requestFocus(true);
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
            sql = "delete from barang_keluar where kd_BarangKeluar='"+kd_BarangKeluar.getText()+"'";
            try{
                PreparedStatement stat = con.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
                kosong();
                kd_BarangKeluar.requestFocus(true);
                datatable();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Data Gagal Dihapus" +e);
            }
        }
    }//GEN-LAST:event_tombol_HapusActionPerformed

    private void tombol_KembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_KembaliActionPerformed
        // TODO add your handling code here:
        dispose();
        menu_logistic r = new menu_logistic();
        r.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_tombol_KembaliActionPerformed

    private void tabel_BarangKeluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_BarangKeluarMouseClicked
        // TODO add your handling code here:
        int bar = tabel_BarangKeluar.getSelectedRow();
        String a = tabmode.getValueAt (bar, 0).toString();
        String b = tabmode.getValueAt (bar, 1).toString();
        String c = tabmode.getValueAt (bar, 2).toString();
        String d = tabmode.getValueAt (bar, 3).toString();
        String e = tabmode.getValueAt (bar, 4).toString();
        String f = tabmode.getValueAt (bar, 5).toString();

        kd_BarangKeluar.setText(a);
        kd_Barang.setText(b);
        id_Customer.setText(c);
        nama_Barang.setText(d);
        jumlah_Keluar.setText(e);
        tanggal_Keluar.setText(f);
    }//GEN-LAST:event_tabel_BarangKeluarMouseClicked

    private void tombol_RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_RefreshActionPerformed
        // TODO add your handling code here:
        Object[] Baris={"Kode Barang Keluar","Kode Barang","ID Customer","Nama Barang","Jumlah Keluar","Tanggal Keluar"};
        tabmode = new DefaultTableModel (null, Baris);
        tabel_BarangKeluar.setModel(tabmode);
        sql="SELECT*from barang_keluar";
        
        try{
            java.sql.Statement stat = con.createStatement();
            rs =stat.executeQuery(sql);
            while (rs.next()){
                String a=rs.getString("kd_BarangKeluar");
                String b=rs.getString("kd_Barang");
                String c=rs.getString("id_Customer");
                String d=rs.getString("nama_Barang");
                String e=rs.getString("jumlah_Keluar");
                String f=rs.getString("tanggal_Keluar");
                
                String[] data={a,b,c,d,e,f};
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
            java.util.logging.Logger.getLogger(barang_keluar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(barang_keluar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(barang_keluar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(barang_keluar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new barang_keluar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cari_Barang;
    private javax.swing.JTextField id_Customer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jumlah_Keluar;
    private javax.swing.JTextField kd_Barang;
    private javax.swing.JTextField kd_BarangKeluar;
    private javax.swing.JTextField nama_Barang;
    private javax.swing.JTable tabel_BarangKeluar;
    private javax.swing.JTextField tanggal_Keluar;
    private javax.swing.JButton tombol_Cari;
    private javax.swing.JButton tombol_Hapus;
    private javax.swing.JButton tombol_Kembali;
    private javax.swing.JButton tombol_Refresh;
    private javax.swing.JButton tombol_Simpan;
    private javax.swing.JButton tombol_Ubah;
    // End of variables declaration//GEN-END:variables
}
