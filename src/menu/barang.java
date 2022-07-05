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
public class barang extends javax.swing.JFrame {
    Connection con;
    Statement stm;
    ResultSet rs;
    private DefaultTableModel tabmode;
    String sql;
    /**
     * Creates new form barang
     */
    public barang() {
        initComponents();
        
        koneksi DB = new koneksi();
        DB.config();
        con = DB.con;
        stm = DB.stm;
        
        datatable();
        setLocationRelativeTo(null);
    }
    
     protected void aktif(){
        kd_Barang.setEnabled(true);
        nama_Barang.setEnabled(true);
        jenis_Barang.setEnabled(true);
        stok.setEnabled(true);
    }
    
    protected void kosong(){
        kd_Barang.setText("");
        nama_Barang.setText("");
        jenis_Barang.setText("");
        stok.setText("");
    }
    
    protected void datatable(){
        Object[] Baris={"Kode Barang","Nama Barang","Jenis Barang","Stok Barang"};
        tabmode = new DefaultTableModel (null, Baris);
        tabel_Barang.setModel(tabmode);
        sql="SELECT*from barang";
        
        try{
            java.sql.Statement stat = con.createStatement();
            rs =stat.executeQuery(sql);
            while (rs.next()){
                String a=rs.getString("kd_Barang");
                String b=rs.getString("nama_Barang");
                String c=rs.getString("jenis_Barang");
                String d=rs.getString("stok");
                
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
        kd_Barang = new javax.swing.JTextField();
        nama_Barang = new javax.swing.JTextField();
        jenis_Barang = new javax.swing.JTextField();
        stok = new javax.swing.JTextField();
        cari_Barang = new javax.swing.JTextField();
        tombol_Cari = new javax.swing.JButton();
        tombol_Simpan = new javax.swing.JButton();
        tombol_Ubah = new javax.swing.JButton();
        tombol_Hapus = new javax.swing.JButton();
        tombol_Kembali = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_Barang = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        tombol_Refresh = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().
            getResource("/menu/bntech.jpg")).getImage());
    getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
    jLabel1.setText("Kode Barang");
    getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 123, -1, -1));

    jLabel2.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
    jLabel2.setText("Nama Barang");
    getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, -1, -1));

    jLabel3.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
    jLabel3.setText("Jenis Barang");
    getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, -1, -1));

    jLabel4.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
    jLabel4.setText("Stok Barang");
    getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));

    kd_Barang.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            kd_BarangActionPerformed(evt);
        }
    });
    getContentPane().add(kd_Barang, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 210, -1));

    nama_Barang.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            nama_BarangActionPerformed(evt);
        }
    });
    getContentPane().add(nama_Barang, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 210, -1));

    jenis_Barang.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jenis_BarangActionPerformed(evt);
        }
    });
    getContentPane().add(jenis_Barang, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 210, -1));

    stok.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            stokActionPerformed(evt);
        }
    });
    getContentPane().add(stok, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 210, -1));

    cari_Barang.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            cari_BarangActionPerformed(evt);
        }
    });
    getContentPane().add(cari_Barang, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 210, -1));

    tombol_Cari.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    tombol_Cari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/magnifying-glass.png"))); // NOI18N
    tombol_Cari.setText("CARI");
    tombol_Cari.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            tombol_CariActionPerformed(evt);
        }
    });
    getContentPane().add(tombol_Cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 310, -1, -1));

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
    getContentPane().add(tombol_Kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 40, -1));

    tabel_Barang.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null}
        },
        new String [] {
            "Kode Barang", "Nama Barang", "Jenis Barang", "Stok Barang"
        }
    ));
    tabel_Barang.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            tabel_BarangMouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(tabel_Barang);

    getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 519, 114));

    jLabel5.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
    jLabel5.setText("BARANG");
    getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, -1, -1));

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
    getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, -1, -1));

    jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/menu.png"))); // NOI18N
    getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kd_BarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kd_BarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kd_BarangActionPerformed

    private void nama_BarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nama_BarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nama_BarangActionPerformed

    private void jenis_BarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenis_BarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jenis_BarangActionPerformed

    private void stokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stokActionPerformed

    private void cari_BarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cari_BarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cari_BarangActionPerformed

    private void tombol_CariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_CariActionPerformed
        // TODO add your handling code here:
        Object[] Baris={"Kode Barang","Nama Barang","Jenis Barang","Stok Barang"};
        tabmode = new DefaultTableModel (null, Baris);
        tabel_Barang.setModel(tabmode);
        sql="SELECT*from barang where kd_Barang like'%"+cari_Barang.getText()+"%'";
        
        try{
            java.sql.Statement stat = con.createStatement();
            rs =stat.executeQuery(sql);
            while (rs.next()){
                String a=rs.getString("kd_Barang");
                String b=rs.getString("nama_Barang");
                String c=rs.getString("jenis_Barang");
                String d=rs.getString("stok");
                
                String[] data={a,b,c,d};
                tabmode.addRow(data);
            }
        }catch(SQLException e){
            System.err.println(e);
        }
    }//GEN-LAST:event_tombol_CariActionPerformed

    private void tombol_SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_SimpanActionPerformed
        // TODO add your handling code here:
        sql="insert into barang values(?,?,?,?)";
        try{
            PreparedStatement stat= con.prepareStatement(sql);
            stat.setString(1, kd_Barang.getText());
            stat.setString(2, nama_Barang.getText());
            stat.setString(3, jenis_Barang.getText());
            stat.setString(4, stok.getText());

            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            kosong();
            kd_Barang.requestFocus();
            datatable();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan" + e);
        }
    }//GEN-LAST:event_tombol_SimpanActionPerformed

    private void tombol_UbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_UbahActionPerformed
        // TODO add your handling code here:
        try{
            sql = "update barang set nama_Barang=?, jenis_Barang=?, stok=? where kd_Barang=?";
            PreparedStatement stat= con.prepareStatement(sql);
            
            stat.setString(1, nama_Barang.getText());
            stat.setString(2, jenis_Barang.getText());
            stat.setString(3, stok.getText());
            stat.setString(4, kd_Barang.getText());
            
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
            kosong();
            kd_Barang.requestFocus(true);
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
            sql = "delete from barang where kd_Barang='"+kd_Barang.getText()+"'";
            try{
                PreparedStatement stat = con.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
                kosong();
                kd_Barang.requestFocus(true);
                datatable();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Data Gagal Dihapus" +e);
            }
        }
    }//GEN-LAST:event_tombol_HapusActionPerformed

    private void tombol_KembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_KembaliActionPerformed
        // TODO add your handling code here:
        dispose();
        menu_admin r = new menu_admin();
        r.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_tombol_KembaliActionPerformed

    private void tabel_BarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_BarangMouseClicked
        // TODO add your handling code here:
        int bar = tabel_Barang.getSelectedRow();
        String a = tabmode.getValueAt (bar, 0).toString();
        String b = tabmode.getValueAt (bar, 1).toString();
        String c = tabmode.getValueAt (bar, 2).toString();
        String d = tabmode.getValueAt (bar, 3).toString();

        kd_Barang.setText(a);
        nama_Barang.setText(b);
        jenis_Barang.setText(c);
        stok.setText(d);
    }//GEN-LAST:event_tabel_BarangMouseClicked

    private void tombol_RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_RefreshActionPerformed
        // TODO add your handling code here:
        Object[] Baris={"Kode Barang","Nama Barang","Jenis Barang","Stok Barang"};
        tabmode = new DefaultTableModel (null, Baris);
        tabel_Barang.setModel(tabmode);
        sql="SELECT*from barang";
        
        try{
            java.sql.Statement stat = con.createStatement();
            rs =stat.executeQuery(sql);
            while (rs.next()){
                String a=rs.getString("kd_Barang");
                String b=rs.getString("nama_Barang");
                String c=rs.getString("jenis_Barang");
                String d=rs.getString("stok");
                
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
            java.util.logging.Logger.getLogger(barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new barang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cari_Barang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jenis_Barang;
    private javax.swing.JTextField kd_Barang;
    private javax.swing.JTextField nama_Barang;
    private javax.swing.JTextField stok;
    private javax.swing.JTable tabel_Barang;
    private javax.swing.JButton tombol_Cari;
    private javax.swing.JButton tombol_Hapus;
    private javax.swing.JButton tombol_Kembali;
    private javax.swing.JButton tombol_Refresh;
    private javax.swing.JButton tombol_Simpan;
    private javax.swing.JButton tombol_Ubah;
    // End of variables declaration//GEN-END:variables
}
