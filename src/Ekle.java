
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
public class Ekle extends javax.swing.JFrame {

    /**
     * Creates new form Ekle
     */
    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    public Ekle() {
        initComponents();
           setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("PayposTableEkle32.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_fiyat = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_urunadı = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_barkod = new javax.swing.JTextField();
        txt_miktar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btn_kaydet = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Paypos  Ürün Ekle");
        setBounds(new java.awt.Rectangle(620, 330, 0, 0));
        setResizable(false);

        txt_fiyat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_fiyatFocusLost(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("Ürün Adı");

        txt_urunadı.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_urunadıFocusLost(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Barkod");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Miktar");

        txt_barkod.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_barkodFocusLost(evt);
            }
        });

        txt_miktar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_miktarFocusLost(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Ürün Ekle");

        btn_kaydet.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_kaydet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Paypostabloekle.png"))); // NOI18N
        btn_kaydet.setText("Ürün Ekle");
        btn_kaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kaydetActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Fiyat");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_urunadı, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(txt_barkod))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_miktar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_fiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn_kaydet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_barkod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_miktar)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_fiyat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_urunadı, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18)
                .addComponent(btn_kaydet)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void txt_urunadıFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_urunadıFocusLost
        // TODO add your handling code here:
        if(txt_urunadı.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(this,"Bos bırakamazsınız");
            txt_urunadı.requestFocus();
        }
    }//GEN-LAST:event_txt_urunadıFocusLost

    private void txt_barkodFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_barkodFocusLost
        // TODO add your handling code here:
        if(txt_barkod.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(this,"Bos bırakamazsınız");
            txt_barkod.requestFocus();
        }

    }//GEN-LAST:event_txt_barkodFocusLost

    private void txt_miktarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_miktarFocusLost
        // TODO add your handling code here:
        if(txt_miktar.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(this,"Bos bırakamazsınız");
            txt_miktar.requestFocus();
        }
    }//GEN-LAST:event_txt_miktarFocusLost

    private void btn_kaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kaydetActionPerformed
        // TODO add your handling code here:
        if (txt_barkod.getText().length()==0&&txt_urunadı.getText().length()==0&&txt_miktar.getText().length()==0&&txt_fiyat.getText().length()==0)
        {
            JOptionPane.showMessageDialog(null,"Ürün kaydı başarısız..Boş Alanları Doldurunuz");
        }
        else  if (txt_barkod.getText().length()!=0&&txt_urunadı.getText().length()==0&&txt_miktar.getText().length()==0&&txt_fiyat.getText().length()==0)
        {
            JOptionPane.showMessageDialog(null,"Ürün kaydı başarısız..Ürün Adı Miktar ve Fiyat Alanlarını Doldurunuz");
        }
        else  if (txt_barkod.getText().length()!=0&&txt_urunadı.getText().length()!=0&&txt_miktar.getText().length()==0&&txt_fiyat.getText().length()==0)
        {
            JOptionPane.showMessageDialog(null,"Ürün kaydı başarısız.. Mİktar ve Fiyat Alanlarını Doldurunuz");
        }
        else  if (txt_barkod.getText().length()!=0&&txt_urunadı.getText().length()!=0&&txt_miktar.getText().length()!=0&&txt_fiyat.getText().length()==0)
        {
            JOptionPane.showMessageDialog(null,"Ürün kaydı başarısız..Fiyat Alanını Doldurunuz");
        }
        else if (txt_barkod.getText().length()!=0 && txt_urunadı.getText().length()!=0 && txt_miktar.getText().length()!=0 && txt_fiyat.getText().length()!=0)
        {
            conn=db.db_java();
            String sorgu="INSERT  INTO  Urunler (Barkod,Urun,Miktar,Fiyat) VALUES(?,?,?,?)";
            try
            {
                pst=conn.prepareStatement(sorgu);
                pst.setString(1,txt_barkod.getText());
                pst.setString(2,txt_urunadı.getText());
                pst.setString(3,txt_miktar.getText());
                pst.setString(4,txt_fiyat.getText());
                pst.execute();
                JOptionPane.showMessageDialog(null,"Ürün başarı ile kaydedildi..");
                                                            
             }
            catch(Exception ex)
            {
                ex.printStackTrace();
               JOptionPane.showMessageDialog(null,"Ürün kaydı başarısız.Barkod numarası benzersiz olmalıdır.");
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
             try
             {
                 conn=db.db_java();
                 String sql="INSERT  INTO  Stoklar (Barkod,Urun,Adet,Adetfiyat) VALUES(?,?,?,?)";
                    pst=conn.prepareStatement(sql);
                    pst.setString(1,txt_barkod.getText());
                    pst.setString(2,txt_urunadı.getText());
                    pst.setString(3,txt_miktar.getText());
                    pst.setString(4,txt_fiyat.getText());
                    pst.execute();
                    txt_barkod.setText("");
                    txt_urunadı.setText("");
                    txt_miktar.setText("");
                    txt_fiyat.setText(""); 
             } catch (Exception e) 
             {
                 e.printStackTrace();
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
            java.util.logging.Logger.getLogger(Ekle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ekle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ekle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ekle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ekle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_kaydet;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txt_barkod;
    private javax.swing.JTextField txt_fiyat;
    private javax.swing.JTextField txt_miktar;
    private javax.swing.JTextField txt_urunadı;
    // End of variables declaration//GEN-END:variables
}
