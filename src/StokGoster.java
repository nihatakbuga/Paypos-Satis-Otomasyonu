
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class StokGoster extends javax.swing.JFrame {

    /**
     * Creates new form StokGoster
     */
    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    public StokGoster() {
        initComponents();
         setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("PyposGoster32.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table_urunler = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_barkod = new javax.swing.JTextField();
        btn_ara = new javax.swing.JButton();
        btn_tumurunler = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Paypos Stok Göster");
        setBounds(new java.awt.Rectangle(580, 250, 0, 0));
        setResizable(false);

        table_urunler.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        table_urunler.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        table_urunler.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Barkod", "Ürün Adı", "Adet", "Adet Fiyat"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_urunler);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("                          Stok Tablosu");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Barkod Numarası Giriniz:");

        btn_ara.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_ara.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PayposGoster.png"))); // NOI18N
        btn_ara.setText("Stok Ara");
        btn_ara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_araActionPerformed(evt);
            }
        });

        btn_tumurunler.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_tumurunler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PayposGoster.png"))); // NOI18N
        btn_tumurunler.setText("Tüm Stok");
        btn_tumurunler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tumurunlerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_barkod, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(btn_tumurunler))
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn_ara, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(126, 126, 126)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btn_tumurunler))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ara, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_barkod, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_araActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_araActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel)table_urunler.getModel();
        int row=model.getRowCount();
        for (int i =row-1; i >=0; i--)
        {
            model.removeRow(i);
        }
        try
        {
            conn=db.db_java();
            String sorgu="Select * From Stoklar WHERE Barkod=?";
            pst=conn.prepareStatement(sorgu);
            pst.setString(1,txt_barkod.getText());
            rs=pst.executeQuery();
            while (rs.next())
            {
                String barkodal=rs.getString("Barkod");
                String urunal=rs.getString("Urun");
                String miktaral=rs.getString("Adet");
                String fiyatal=rs.getString("Adetfiyat");
                model.addRow(new Object[] {barkodal,urunal,miktaral,fiyatal});
                txt_barkod.setText("");

            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            // JOptionPane.showMessageDialog(null,"Böyle bir ürün yok.");
        }
        finally
        {
            try
            {
                conn.close();
            }
            catch (Exception e)
            {

            }
        }

    }//GEN-LAST:event_btn_araActionPerformed

    private void btn_tumurunlerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tumurunlerActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel)table_urunler.getModel();
        txt_barkod.setText("");
        DefaultTableModel tablo=(DefaultTableModel) table_urunler.getModel();
        int row=tablo.getRowCount();
        for (int i =row-1; i >=0; i--)
        {
            tablo.removeRow(i);
        }
        try
        {
            conn=db.db_java();
            String sorgu="Select * From Stoklar";
            pst=conn.prepareStatement(sorgu);
            rs=pst.executeQuery();
            while (rs.next())
            {
                String barkodal=rs.getString("Barkod");
                String urunal=rs.getString("Urun");
                String miktaral=rs.getString("Adet");
                String fiyatal=rs.getString("Adetfiyat");
                model.addRow(new Object[] {barkodal,urunal,miktaral,fiyatal});

            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            // JOptionPane.showMessageDialog(null,"Böyle bir ürün yok.");
        }
        finally
        {
            try
            {
                conn.close();
            }
            catch (Exception e)
            {

            }
        }

    }//GEN-LAST:event_btn_tumurunlerActionPerformed

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
            java.util.logging.Logger.getLogger(StokGoster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StokGoster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StokGoster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StokGoster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StokGoster().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ara;
    private javax.swing.JButton btn_tumurunler;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_urunler;
    private javax.swing.JTextField txt_barkod;
    // End of variables declaration//GEN-END:variables
}