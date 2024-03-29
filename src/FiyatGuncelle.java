
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class FiyatGuncelle extends javax.swing.JFrame {

    /**
     * Creates new form FiyatGuncelle
     */
    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
      public FiyatGuncelle() {
        initComponents();
           setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("payposupdate32.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings({"unchecked", "Convert2Lambda"})
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_fiyat = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btn_kaydet = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_barkod = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Paypos Ürün Fiyat Güncelle");
        setBounds(new java.awt.Rectangle(650, 330, 0, 0));
        setResizable(false);

        txt_fiyat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_fiyatFocusLost(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Ürün Fiyat Güncelle");

        btn_kaydet.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_kaydet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payposupdate.png"))); // NOI18N
        btn_kaydet.setText("Güncelle");
        btn_kaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kaydetActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Barkod");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Fiyat");

        txt_barkod.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_barkodFocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_barkod, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_fiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_kaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_barkod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_fiyat)))
                .addGap(18, 18, 18)
                .addComponent(btn_kaydet)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_fiyatFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_fiyatFocusLost
        // TODO add your handling code here:
        if(txt_fiyat.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(this,"Bos bırakamazsınız");
            txt_fiyat.requestFocus();
        }
    }//GEN-LAST:event_txt_fiyatFocusLost

    private void btn_kaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kaydetActionPerformed
        // TODO add your handling code here:
        if (txt_barkod.getText().length()==0&&txt_fiyat.getText().length()==0)
        {
            JOptionPane.showMessageDialog(null,"Ürün Fiyat Güncelleme kaydı başarısız..Barkod ve Fiyat  Alanları Doldurunuz");
        }
        else  if (txt_barkod.getText().length()!=0&&txt_fiyat.getText().length()==0)
        {
            JOptionPane.showMessageDialog(null,"Ürün Fiyat Güncelleme  kaydı başarısız..Fiyat Alanını Doldurunuz");
        }
        else  if (txt_barkod.getText().length()==0&&txt_fiyat.getText().length()!=0)
        {
            JOptionPane.showMessageDialog(null,"Ürün Fiyat Güncelleme kaydı başarısız.. Barkod  Alanını Doldurunuz");
        }
        else if (txt_barkod.getText().length()!=0 &&txt_fiyat.getText().length()!=0)
        {
            conn=db.db_java();
            String sorgu="Update Urunler SET Fiyat=? Where Barkod=?";
            try
            {
                pst=conn.prepareStatement(sorgu);
                pst.setString(1,txt_fiyat.getText());
                pst.setString(2,txt_barkod.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null,"Ürün Fiyatı başarı ile Güncellendi..");
              }
            catch(SQLException | HeadlessException ex)
            {
                JOptionPane.showMessageDialog(null,"Ürün Fiyatı başarı ile Güncellenemedi..");
            }
            finally
            {
                try
                {
                    conn.close();
                }
                catch (Exception e) {
                }

            }
            conn=db.db_java();
            String sqlsorgu="Update Stoklar SET Adetfiyat=? Where Barkod=?";
            try
            {
                pst=conn.prepareStatement(sqlsorgu);
                pst.setString(1,txt_fiyat.getText());
                pst.setString(2,txt_barkod.getText());
                pst.executeUpdate();
                txt_barkod.setText("");
                txt_fiyat.setText("");
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null,"Ürün Fiyatı başarı ile Güncellenemedi..");
            }
            finally
            {
                try
                {
                    conn.close();
                }
                catch (Exception e) {
                }

            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Lütfen Boş Alan veya Alanları Doldurunuz..");
        }
    }//GEN-LAST:event_btn_kaydetActionPerformed

    private void txt_barkodFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_barkodFocusLost
        // TODO add your handling code here:
        if(txt_barkod.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(this,"Bos bırakamazsınız");
            txt_barkod.requestFocus();
        }
    }//GEN-LAST:event_txt_barkodFocusLost

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FiyatGuncelle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FiyatGuncelle().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_kaydet;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txt_barkod;
    private javax.swing.JTextField txt_fiyat;
    // End of variables declaration//GEN-END:variables
}
