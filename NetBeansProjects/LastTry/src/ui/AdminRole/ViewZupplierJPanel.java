package ui.AdminRole;

import model.ZupplierDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Droduct;
import model.Zupplier;
/**
 *
 * @author Ali-pc
 */
public class ViewZupplierJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private Zupplier zupplier;
    
    public ViewZupplierJPanel(JPanel upc, Zupplier z) {
        initComponents();
        userProcessContainer = upc;
        zupplier = z;
        lblSupplierName.setText(z.getZupplyName());
        refreshTable();
    }
    
    public void refreshTable(){
        int rowCount = droductCatalog.getRowCount();
        DefaultTableModel model = (DefaultTableModel) droductCatalog.getModel();
        for(int i=rowCount - 1;i>=0;i--){
            model.removeRow(i);
        }
        for(Droduct d: zupplier.getDroductCatalog().getDroductcatalog()){
            Object row[] = new Object[6];
            row[0] = d;
            row[1] = d.getModelNumber();
            row[2] = d.getPrice();
            row[3] = d.getAvail();
            row[4] = d.getTemperature();
            row[5] = d.getDate();
            
            model.addRow(row);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSupplierName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        droductCatalog = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();

        lblSupplierName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSupplierName.setText("<Supplier Name>");

        droductCatalog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "ID", "Pressure", "Pulse", "Temperature", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(droductCatalog);

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(18, 18, 18)
                        .addComponent(lblSupplierName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(lblSupplierName))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(337, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JTable droductCatalog;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSupplierName;
    // End of variables declaration//GEN-END:variables
}
