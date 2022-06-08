/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tampilan;

import koneksi.koneksi;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;

/**
 *
 * @author IQBAL
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
        kdbarang.setEnabled(true);
        kdnama.setEnabled(true);
        kdjenis.setEnabled(true);
        kdstock.setEnabled(true);
    }
    
    protected void kosong(){
        kdbarang.setText("");
        kdnama.setText("");
        kdjenis.setText("");
        kdstock.setText("");
    }
    
    protected void datatable(){
        Object[] Baris={"Kode Barang","Nama Barang","Jenis Barang","Stok Barang"};
        tabmode = new DefaultTableModel (null, Baris);
        tabeldokter.setModel(tabmode);
        sql="SELECT*from barang";
        
        try{
            java.sql.Statement stat = con.createStatement();
            rs =stat.executeQuery(sql);
            while (rs.next()){
                String a=rs.getString("kode");
                String b=rs.getString("nama");
                String c=rs.getString("jenis");
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
        kdbarang = new javax.swing.JTextField();
        kdnama = new javax.swing.JTextField();
        kdjenis = new javax.swing.JTextField();
        kdstock = new javax.swing.JTextField();
        kdcari = new javax.swing.JTextField();
        tcari = new javax.swing.JButton();
        tsimpan = new javax.swing.JButton();
        tubah = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabeldokter = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("kode Barang");

        jLabel2.setText("Nama Barang");

        jLabel3.setText("Jenis Barang");

        jLabel4.setText("Stock Barang");

        kdbarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kdbarangActionPerformed(evt);
            }
        });

        kdnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kdnamaActionPerformed(evt);
            }
        });

        kdjenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kdjenisActionPerformed(evt);
            }
        });

        kdstock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kdstockActionPerformed(evt);
            }
        });

        kdcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kdcariActionPerformed(evt);
            }
        });

        tcari.setText("CARI");
        tcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcariActionPerformed(evt);
            }
        });

        tsimpan.setText("SIMPAN");
        tsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tsimpanActionPerformed(evt);
            }
        });

        tubah.setText("UBAH");
        tubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tubahActionPerformed(evt);
            }
        });

        jButton4.setText("HAPUS");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("KEMBALI");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        tabeldokter.setModel(new javax.swing.table.DefaultTableModel(
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
        tabeldokter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabeldokterMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabeldokter);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("BARANG");

        jButton1.setText("REFRESH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(kdnama, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(43, 43, 43)
                                        .addComponent(kdbarang, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(kdjenis, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(kdstock, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tubah, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tsimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(kdcari, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(tcari))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(kdbarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tsimpan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(kdjenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(kdnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(tubah))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4)
                                .addGap(9, 9, 9)
                                .addComponent(jButton1)
                                .addGap(12, 12, 12))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(kdstock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jButton5)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kdcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tcari))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kdbarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kdbarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kdbarangActionPerformed

    private void kdnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kdnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kdnamaActionPerformed

    private void kdjenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kdjenisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kdjenisActionPerformed

    private void kdstockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kdstockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kdstockActionPerformed

    private void kdcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kdcariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kdcariActionPerformed

    private void tcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcariActionPerformed
        // TODO add your handling code here:
        Object[] Baris={"Kode Barang","Nama Barang","Jenis Barang","Stok Barang"};
        tabmode = new DefaultTableModel (null, Baris);
        tabeldokter.setModel(tabmode);
        sql="SELECT*from barang where nama like'%"+kdcari.getText()+"%' OR kode like'%"+kdcari.getText()+"%'";
        
        try{
            java.sql.Statement stat = con.createStatement();
            rs =stat.executeQuery(sql);
            while (rs.next()){
                String a=rs.getString("kode");
                String b=rs.getString("nama");
                String c=rs.getString("jenis");
                String d=rs.getString("stok");
                
                String[] data={a,b,c,d};
                tabmode.addRow(data);
            }
        }catch(SQLException e){
            System.err.println(e);
        }
    }//GEN-LAST:event_tcariActionPerformed

    private void tsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tsimpanActionPerformed
        // TODO add your handling code here:
        sql="insert into barang values(?,?,?,?)";
        try{
            PreparedStatement stat= con.prepareStatement(sql);
            stat.setString(1, kdbarang.getText());
            stat.setString(2, kdnama.getText());
            stat.setString(3, kdjenis.getText());
            stat.setString(4, kdstock.getText());

            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            kosong();
            kdbarang.requestFocus();
            datatable();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan" + e);
        }
    }//GEN-LAST:event_tsimpanActionPerformed

    private void tubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tubahActionPerformed
        // TODO add your handling code here:
        try{
            sql = "update barang set nama=?, jenis=?, stok=? where kode=?";
            PreparedStatement stat= con.prepareStatement(sql);
            
            stat.setString(1, kdnama.getText());
            stat.setString(2, kdjenis.getText());
            stat.setString(3, kdstock.getText());
            stat.setString(4, kdbarang.getText());
            
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
            kosong();
            kdbarang.requestFocus(true);
            datatable();

        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Data Gagal Diubah" + e);
            System.err.println(e);
        }
    }//GEN-LAST:event_tubahActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int ok = JOptionPane.showConfirmDialog (null, "hapus","Konfirmasi Dialog",JOptionPane.YES_NO_CANCEL_OPTION);
        if (ok==0){
            sql = "delete from barang where kode='"+kdbarang.getText()+"'";
            try{
                PreparedStatement stat = con.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
                kosong();
                kdbarang.requestFocus(true);
                datatable();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Data Gagal Dihapur" +e)
                ;
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        dispose();
        Menu_Utama r = new Menu_Utama();
        r.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tabeldokterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabeldokterMouseClicked
        // TODO add your handling code here:
        int bar = tabeldokter.getSelectedRow();
        String a = tabmode.getValueAt (bar, 0).toString();
        String b = tabmode.getValueAt (bar, 1).toString();
        String c = tabmode.getValueAt (bar, 2).toString();
        String d = tabmode.getValueAt (bar, 3).toString();

        kdbarang.setText(a);
        kdnama.setText(b);
        kdjenis.setText(c);
        kdstock.setText(d);
    }//GEN-LAST:event_tabeldokterMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Object[] Baris={"Kode Barang","Nama Barang","Jenis Barang","Stok Barang"};
        tabmode = new DefaultTableModel (null, Baris);
        tabeldokter.setModel(tabmode);
        sql="SELECT*from barang";
        
        try{
            java.sql.Statement stat = con.createStatement();
            rs =stat.executeQuery(sql);
            while (rs.next()){
                String a=rs.getString("kode");
                String b=rs.getString("nama");
                String c=rs.getString("jenis");
                String d=rs.getString("stok");
                
                String[] data={a,b,c,d};
                tabmode.addRow(data);
            }
        }catch(SQLException e){
            System.err.println(e);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kdbarang;
    private javax.swing.JTextField kdcari;
    private javax.swing.JTextField kdjenis;
    private javax.swing.JTextField kdnama;
    private javax.swing.JTextField kdstock;
    private javax.swing.JTable tabeldokter;
    private javax.swing.JButton tcari;
    private javax.swing.JButton tsimpan;
    private javax.swing.JButton tubah;
    // End of variables declaration//GEN-END:variables
}
