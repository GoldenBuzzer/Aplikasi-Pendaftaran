/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasipendaftaran;

/**
 *
 * @author Mery Chris
 */
public class Daftar extends javax.swing.JFrame {

    /**
     * Creates new form Daftar
     */
    public Daftar() {
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

        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButtonLihatPendaftar = new javax.swing.JButton();
        jButtonDaftar = new javax.swing.JButton();
        jButtonHome1 = new javax.swing.JButton();
        jButtonDaftar1 = new javax.swing.JButton();
        jButtonLogin1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Daftar Mahasiswa yang sudah mendaftar");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 570, 490, 50));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Pendaftaran Mahasiswa Baru");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 570, 330, 50));

        jButtonLihatPendaftar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jButtonLihatPendaftar.setText("Lihat Pendaftar");
        jButtonLihatPendaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLihatPendaftarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLihatPendaftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 630, 170, 40));

        jButtonDaftar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jButtonDaftar.setText("Daftar");
        jButtonDaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDaftarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDaftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 630, 90, 40));

        jButtonHome1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonHome1.setText("Home");
        jButtonHome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHome1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonHome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 100, 40));

        jButtonDaftar1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonDaftar1.setText("Daftar");
        jButtonDaftar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDaftar1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDaftar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 100, 40));

        jButtonLogin1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonLogin1.setText("Login");
        jButtonLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogin1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLogin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 100, 40));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasipendaftaran/Gambar/daftar.jpg"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLihatPendaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLihatPendaftarActionPerformed
        new DataMahasiswaTerdaftar().setVisible(true);
    }//GEN-LAST:event_jButtonLihatPendaftarActionPerformed

    private void jButtonDaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDaftarActionPerformed
        new FormDaftar().setVisible(true);
    }//GEN-LAST:event_jButtonDaftarActionPerformed

    private void jButtonHome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHome1ActionPerformed
        new Home().setVisible(true);
    }//GEN-LAST:event_jButtonHome1ActionPerformed

    private void jButtonDaftar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDaftar1ActionPerformed
        new Daftar().setVisible(true);
    }//GEN-LAST:event_jButtonDaftar1ActionPerformed

    private void jButtonLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogin1ActionPerformed
        new Login().setVisible(true);
    }//GEN-LAST:event_jButtonLogin1ActionPerformed

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
            java.util.logging.Logger.getLogger(Daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Daftar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDaftar;
    private javax.swing.JButton jButtonDaftar1;
    private javax.swing.JButton jButtonHome1;
    private javax.swing.JButton jButtonLihatPendaftar;
    private javax.swing.JButton jButtonLogin1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
