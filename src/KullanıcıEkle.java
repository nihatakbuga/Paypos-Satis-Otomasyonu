
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
public class KullanıcıEkle extends javax.swing.JFrame {

    /**
     * Creates new form KullanıcıEkle
     */
    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    KullanıcıGiris kullanıcıGiris=new KullanıcıGiris();
    public KullanıcıEkle() {
        initComponents();
           setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Payposkullanıcıekle32.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings({"unchecked", "Convert2Lambda"})
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        psf_sifretekrar = new javax.swing.JPasswordField();
        cm_yetlki = new javax.swing.JComboBox();
        btn_guncelle = new javax.swing.JButton();
        btn_kayıt = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_kullanıcıad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        psf_sifre = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Paypos Kullanıcı Ekle");
        setBounds(new java.awt.Rectangle(600, 320, 0, 0));
        setResizable(false);

        psf_sifretekrar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        psf_sifretekrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psf_sifretekrarActionPerformed(evt);
            }
        });

        cm_yetlki.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cm_yetlki.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seçiniz", "Admin", "Kullanıcı", "Misafir" }));

        btn_guncelle.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_guncelle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payposupdate.png"))); // NOI18N
        btn_guncelle.setText("Güncelle");
        btn_guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guncelleActionPerformed(evt);
            }
        });

        btn_kayıt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_kayıt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payposkaydet.png"))); // NOI18N
        btn_kayıt.setText("Kayıt");
        btn_kayıt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kayıtActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Şifre Tekrar");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Kullanıcı Adı");

        txt_kullanıcıad.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Şifre");

        psf_sifre.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(txt_kullanıcıad)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(psf_sifre)
                    .addComponent(cm_yetlki, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_kayıt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_guncelle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(psf_sifretekrar, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_kullanıcıad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(psf_sifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(psf_sifretekrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cm_yetlki, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_guncelle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_kayıt)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void psf_sifretekrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psf_sifretekrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_psf_sifretekrarActionPerformed

    private void btn_kayıtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kayıtActionPerformed
        // TODO add your handling code here:
        conn=db.db_java();
        String sorgu="Insert Into Kullanıcı (Ad,Şifre,Yetki) Values(?,?,?)";
       if (txt_kullanıcıad.getText().length()==0&&psf_sifre.getText().length()==0&&psf_sifretekrar.getText().length()==0&&cm_yetlki.getSelectedItem().equals("Seçiniz"))
        {
            JOptionPane.showMessageDialog(null,"Lütfen Boş Alanları Doldurunuz.");
        }
        else if (txt_kullanıcıad.getText().length()!=0&&psf_sifre.getText().length()==0&&psf_sifretekrar.getText().length()==0) 
        {
              JOptionPane.showMessageDialog(null,"Lütfen Şifrenizi Yazınız");
        }
        else if (txt_kullanıcıad.getText().length()!=0&&psf_sifre.getText().length()!=0&&psf_sifretekrar.getText().length()==0) 
        {
              JOptionPane.showMessageDialog(null,"Lütfen Şifre Tekrarını Yazınız");
        }
        else if (txt_kullanıcıad.getText().length()!=0&&psf_sifre.getText().length()==0&&psf_sifretekrar.getText().length()!=0) 
        {
              JOptionPane.showMessageDialog(null,"Lütfen Şifre Tekrarını Yazınız");
        }
        else if (txt_kullanıcıad.getText().length()==0&&psf_sifre.getText().length()!=0&&psf_sifretekrar.getText().length()!=0) 
        {
              JOptionPane.showMessageDialog(null,"Lütfen Kullanıcı Adını  Yazınız");
        }
        else
        {
        try 
        {
            char[]input=psf_sifre.getPassword();
            char[]input1=psf_sifretekrar.getPassword();
            String p=new String(input);
            String c=new String(input1);
           if (p.equals(c)) 
            {
               pst=conn.prepareStatement(sorgu);
               pst.setString(1,txt_kullanıcıad.getText());
               pst.setString(2,psf_sifre.getText());
               pst.setString(3,cm_yetlki.getSelectedItem().toString());    
               pst.execute();
               JOptionPane.showMessageDialog(null,"Kullanıcı Oluşturuldu.");
                kullanıcıGiris.setVisible(true);
                this.setVisible(false);
               txt_kullanıcıad.setText("");
               psf_sifre.setText("");
               psf_sifretekrar.setText("");
               cm_yetlki.setSelectedItem(null);
               
            }
            else
            {
                psf_sifretekrar.setText("");
                JOptionPane.showMessageDialog(null,"Şifre aynı değil.");
            }
          
        }
        catch (SQLException | HeadlessException e) 
        {
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
        
        
    };//GEN-LAST:event_btn_kayıtActionPerformed

    private void btn_guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guncelleActionPerformed
        // TODO add your handling code here:
        conn=db.db_java();
        String sorgu="Update Kullanıcı Set Yetki=? Where Ad=?";
        if (txt_kullanıcıad.getText().length()==0&&psf_sifre.getText().length()==0&&psf_sifretekrar.getText().length()==0&&cm_yetlki.getSelectedItem().equals("Seçiniz"))
        {
            JOptionPane.showMessageDialog(null,"Lütfen Boş Alanları Doldurunuz.");
        }
        else if (txt_kullanıcıad.getText().length()!=0&&psf_sifre.getText().length()==0&&psf_sifretekrar.getText().length()==0) 
        {
              JOptionPane.showMessageDialog(null,"Lütfen Şifrenizi Yazınız");
        }
        else if (txt_kullanıcıad.getText().length()!=0&&psf_sifre.getText().length()!=0&&psf_sifretekrar.getText().length()==0) 
        {
              JOptionPane.showMessageDialog(null,"Lütfen Şifre Tekrarını Yazınız");
        }
        else if (txt_kullanıcıad.getText().length()!=0&&psf_sifre.getText().length()==0&&psf_sifretekrar.getText().length()!=0) 
        {
              JOptionPane.showMessageDialog(null,"Lütfen Şifre Tekrarını Yazınız");
        }
        else if (txt_kullanıcıad.getText().length()==0&&psf_sifre.getText().length()!=0&&psf_sifretekrar.getText().length()!=0) 
        {
              JOptionPane.showMessageDialog(null,"Lütfen Kullanıcı Adını  Yazınız");
        }
        else
        {
        try 
        {
               pst=conn.prepareStatement(sorgu);
               pst.setString(1,cm_yetlki.getSelectedItem().toString());
               pst.setString(2,txt_kullanıcıad.getText());                          
               pst.executeUpdate();
               JOptionPane.showMessageDialog(null,"Kullanıcı Güncellendi.");
               kullanıcıGiris.setVisible(true);
               this.setVisible(false);
               txt_kullanıcıad.setText("");
               psf_sifre.setText("");
               psf_sifretekrar.setText("");
               cm_yetlki.setSelectedItem(null);

        }
        catch (SQLException | HeadlessException e) 
        {
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
        
        
    }//GEN-LAST:event_btn_guncelleActionPerformed

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
            java.util.logging.Logger.getLogger(KullanıcıEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new KullanıcıEkle().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_guncelle;
    private javax.swing.JButton btn_kayıt;
    private javax.swing.JComboBox cm_yetlki;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField psf_sifre;
    private javax.swing.JPasswordField psf_sifretekrar;
    private javax.swing.JTextField txt_kullanıcıad;
    // End of variables declaration//GEN-END:variables
}
