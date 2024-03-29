
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
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
public class Sil extends javax.swing.JFrame {

    /**
     * Creates new form Sil
     */
    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    public Sil() {
        initComponents();
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("PayposTableCıkar32.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_ara = new javax.swing.JButton();
        btn_tumurunler = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_urunler = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txt_barkod = new javax.swing.JTextField();
        btn_urunsil = new javax.swing.JButton();
        lbl_barkodgetir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Paypos Ürün Sil");
        setBounds(new java.awt.Rectangle(580, 270, 0, 0));
        setResizable(false);

        btn_ara.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_ara.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PayposGoster.png"))); // NOI18N
        btn_ara.setText("Ara");
        btn_ara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_araActionPerformed(evt);
            }
        });

        btn_tumurunler.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_tumurunler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PayposGoster.png"))); // NOI18N
        btn_tumurunler.setText("Tüm Ürünler");
        btn_tumurunler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tumurunlerActionPerformed(evt);
            }
        });

        table_urunler.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        table_urunler.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        table_urunler.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Barkod", "Ürün Adı", "Miktar", "Fiyat"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_urunler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_urunlerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_urunler);
        if (table_urunler.getColumnModel().getColumnCount() > 0) {
            table_urunler.getColumnModel().getColumn(0).setMinWidth(50);
            table_urunler.getColumnModel().getColumn(0).setMaxWidth(50);
            table_urunler.getColumnModel().getColumn(2).setMinWidth(48);
            table_urunler.getColumnModel().getColumn(2).setMaxWidth(48);
            table_urunler.getColumnModel().getColumn(3).setMinWidth(40);
            table_urunler.getColumnModel().getColumn(3).setMaxWidth(40);
        }

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Barkod Numarası Giriniz:");

        btn_urunsil.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_urunsil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/table-remove-icon.png"))); // NOI18N
        btn_urunsil.setText("Ürün Sil");
        btn_urunsil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_urunsilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txt_barkod))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_tumurunler, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_ara, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbl_barkodgetir, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_urunsil)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btn_tumurunler))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_barkod, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ara))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_barkodgetir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_urunsil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            String sorgu="Select * From Urunler WHERE Barkod=?";
            pst=conn.prepareStatement(sorgu);
            pst.setString(1,txt_barkod.getText());
            rs=pst.executeQuery();
            while (rs.next())
            {
                String barkodal=rs.getString("Barkod");
                String urunal=rs.getString("Urun");
                String miktaral=rs.getString("Miktar");
                String fiyatal=rs.getString("Fiyat");
                model.addRow(new Object[] {barkodal,urunal,miktaral,fiyatal});
                txt_barkod.setText("");

            }
        }
        catch (Exception e)
        {
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
            String sorgu="Select * From Urunler";
            pst=conn.prepareStatement(sorgu);
            rs=pst.executeQuery();
            while (rs.next())
            {
                String barkodal=rs.getString("Barkod");
                String urunal=rs.getString("Urun");
                String miktaral=rs.getString("Miktar");
                String fiyatal=rs.getString("Fiyat");
                model.addRow(new Object[] {barkodal,urunal,miktaral,fiyatal});

            }
        }
        catch (Exception e)
        {
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

    private void btn_urunsilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_urunsilActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) table_urunler.getModel();  
        int secilen=table_urunler.getSelectedRow();
        Object gelenıd=table_urunler.getValueAt(secilen,0);
        String barkod=((String) gelenıd);
        conn=db.db_java();
        String sql="Delete  From Urunler Where Barkod=?";
        try 
        {
            pst=conn.prepareStatement(sql);
            pst.setString(1,lbl_barkodgetir.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Ürün Silinmiştir.!");
         }
        catch (Exception e) 
        {
            
            e.printStackTrace();
             JOptionPane.showMessageDialog(null,"Ürün Silinemedi.!");
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
        conn=db.db_java();
        String sqlsorgu="Delete From Stoklar Where Barkod=?";
        try 
        {
             pst=conn.prepareStatement(sqlsorgu);
             pst.setString(1,lbl_barkodgetir.getText());
             pst.execute();
             model.removeRow(secilen);
              
        } 
        catch (Exception e)
        {
            e.printStackTrace();;
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
        
        
    }//GEN-LAST:event_btn_urunsilActionPerformed

    private void table_urunlerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_urunlerMouseClicked
        // TODO add your handling code here:
        lbl_barkodgetir.setText(table_urunler.getValueAt(table_urunler.getSelectedRow(),0).toString());
        lbl_barkodgetir.setVisible(false);
    }//GEN-LAST:event_table_urunlerMouseClicked

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
            java.util.logging.Logger.getLogger(Sil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ara;
    private javax.swing.JButton btn_tumurunler;
    private javax.swing.JButton btn_urunsil;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_barkodgetir;
    private javax.swing.JTable table_urunler;
    private javax.swing.JTextField txt_barkod;
    // End of variables declaration//GEN-END:variables

    private String Id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
