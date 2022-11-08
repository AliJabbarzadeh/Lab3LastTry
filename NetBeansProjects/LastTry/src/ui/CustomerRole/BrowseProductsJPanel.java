/*
 * BrowseProducts.java
 *
 * Created on October 10, 2008, 9:10 AM
 */
package ui.CustomerRole;

import model.Product;
import model.Supplier;
import model.SupplierDirectory;
import ui.CustomerRole.ViewProductDetailJPanel;
import java.awt.CardLayout;
import java.awt.Color;
import static java.awt.Color.white;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.MasterOrderList;
import model.Order;
import model.OrderItem;


/**
 *
 * @author Rushabh
 */
public class BrowseProductsJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    SupplierDirectory supplierDirectory;
    MasterOrderList masterOrderList;
    Order currentOrder;

    /** Creates new form BrowseProducts */
    public BrowseProductsJPanel(JPanel userProcessContainer, SupplierDirectory supplierDirectory, MasterOrderList masterOrderList) {
        initComponents();
     
        this.userProcessContainer = userProcessContainer;
        this.supplierDirectory = supplierDirectory;
       // this.masterOrderList = masterOrderList;
        this.currentOrder = new Order();
        
        populateCombo();
        populateProductTable();
        populateCartTable();
    }

    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblSupplier = new javax.swing.JLabel();
        cmbSupplier = new javax.swing.JComboBox();
        txtSearch = new javax.swing.JTextField();
        btnSearchProduct = new javax.swing.JButton();
        lblProductCatalogue = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductCatalog = new javax.swing.JTable();
        lblQuantity = new javax.swing.JLabel();
        spnQuantity = new javax.swing.JSpinner();
        btnAddToCart = new javax.swing.JButton();
        lblItemsInCart = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCart = new javax.swing.JTable();
        btnRemoveOrderItem = new javax.swing.JButton();
        btnCheckOut = new javax.swing.JButton();

        setBackground(new java.awt.Color(240, 240, 240));
        setPreferredSize(new java.awt.Dimension(650, 600));

        lblTitle.setBackground(new java.awt.Color(0, 0, 0));
        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(51, 51, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTitle.setText("Please select comunity Hospital to view Doctors");
        lblTitle.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lblTitle.setIconTextGap(20);

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblSupplier.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSupplier.setForeground(new java.awt.Color(0, 0, 204));
        lblSupplier.setText("Hospitals:");

        cmbSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSupplierActionPerformed(evt);
            }
        });

        btnSearchProduct.setText("Search Doctors");
        btnSearchProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchProductActionPerformed(evt);
            }
        });

        lblProductCatalogue.setText("Doctors Directory:");

        tblProductCatalog.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        tblProductCatalog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Doctor ID", "Rating", "Spot Available"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProductCatalog);

        lblQuantity.setText("Quantity:");

        spnQuantity.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        btnAddToCart.setText("Reserve Encounter");
        btnAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToCartActionPerformed(evt);
            }
        });

        lblItemsInCart.setText("Reservations:");

        tblCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Doctor Name", "Quantity", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblCart);

        btnRemoveOrderItem.setText("Remove");
        btnRemoveOrderItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveOrderItemActionPerformed(evt);
            }
        });

        btnCheckOut.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnCheckOut.setText("Check out");
        btnCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblProductCatalogue)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cmbSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnSearchProduct))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(137, 137, 137)
                            .addComponent(lblQuantity)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(spnQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnAddToCart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(171, 171, 171))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                        .addComponent(lblItemsInCart)
                        .addComponent(jScrollPane2)
                        .addComponent(btnRemoveOrderItem, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(btnCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(lblTitle)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(btnBack))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblProductCatalogue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantity)
                    .addComponent(spnQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddToCart))
                .addGap(18, 18, 18)
                .addComponent(lblItemsInCart)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRemoveOrderItem)
                .addGap(18, 18, 18)
                .addComponent(btnCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jScrollPane1, jScrollPane2});

    }// </editor-fold>//GEN-END:initComponents

    private void cmbSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSupplierActionPerformed
        // TODO add your handling code here:
        populateProductTable();
        
    }//GEN-LAST:event_cmbSupplierActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckOutActionPerformed
        // TODO add your handling code here:
        
        //masterOrderList.addNewOrder(currentOrder);
        //currentOrder = new Order();
        //int selectedRowIndex = tblCart.getSelectedRow();
        
        //OrderItem item = (OrderItem) tblCart.getValueAt(selectedRowIndex, 0);
        //currentOrder.deleteItem(item);
        
        
        populateCombo();
        populateProductTable();
        populateCartTable();
        
        //txtNewQuantity.setText("");
        //txtSalesPrice.setText("");
        txtSearch.setText("");
        
        spnQuantity.setValue(0);
        
        tblCart.setValueAt("Finalized", 0, 2);
        tblCart.setBackground(Color.green);
        btnRemoveOrderItem.setEnabled(false);
        JOptionPane.showMessageDialog(this, "/Thank you!");
        
        BrowseProductsJPanel bpjp = new BrowseProductsJPanel(userProcessContainer, supplierDirectory, masterOrderList);
        userProcessContainer.add("BrowseProductsJPanel", bpjp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
       
    }//GEN-LAST:event_btnCheckOutActionPerformed

    private void btnSearchProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchProductActionPerformed
        
        String productName = txtSearch.getText();
        populateProductTable(productName);
    }//GEN-LAST:event_btnSearchProductActionPerformed

    private void btnRemoveOrderItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveOrderItemActionPerformed
       
        int selectedRowIndex = tblCart.getSelectedRow();
        if(selectedRowIndex<0){
        JOptionPane.showMessageDialog(this, "Please select the order item first.");
        return;
        }
        
        OrderItem item = (OrderItem) tblCart.getValueAt(selectedRowIndex, 0);
        
        int quant = 0;
        
        item.getProduct().setAvail(item.getProduct().getAvail()+item.getQuantity());
        currentOrder.deleteItem(item);
        
        populateCartTable();
        populateProductTable();
        
    }//GEN-LAST:event_btnRemoveOrderItemActionPerformed

    private void btnAddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToCartActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblProductCatalog.getSelectedRow();
        if(selectedRowIndex<0){
        JOptionPane.showMessageDialog(this, "Please select the product first.");
        return;
        }
        
        
        Product product = (Product) tblProductCatalog.getValueAt(selectedRowIndex, 0);
        double salesPrice = 0.0;
        int quant = 0;
         
        try {
        //salesPrice = Double.parseDouble(txtSalesPrice.getText());
        quant = (Integer) spnQuantity.getValue();
        } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Please check the price and quantity fields.");
            return;
        }
        /*
        if(salesPrice < product.getPrice()){
        JOptionPane.showMessageDialog(this, "Price should be more than it is set in the price");
        return;
        }
        */
        OrderItem item = currentOrder.findProduct(product);
        
        if (item == null){
        if (product.getAvail()>=quant){
        currentOrder.addNewOrderItem(product, salesPrice, quant);
        product.setAvail(product.getAvail() - quant);
        
        }else {
        JOptionPane.showMessageDialog(this, "Please check product availability.");
        return;
        }
        
        
        }else{
        int oldQuant = item.getQuantity();
        if (item.getProduct().getAvail() + oldQuant < quant){
        JOptionPane.showMessageDialog(this, "Please check product availability.");
        return;
        }
        item.getProduct().setAvail(item.getProduct().getAvail()+oldQuant-quant);
        item.setQuantity(quant);
        
        }
        populateProductTable();
        populateCartTable();
    }//GEN-LAST:event_btnAddToCartActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToCart;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCheckOut;
    private javax.swing.JButton btnRemoveOrderItem;
    private javax.swing.JButton btnSearchProduct;
    private javax.swing.JComboBox cmbSupplier;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblItemsInCart;
    private javax.swing.JLabel lblProductCatalogue;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblSupplier;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JSpinner spnQuantity;
    private javax.swing.JTable tblCart;
    private javax.swing.JTable tblProductCatalog;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private void populateCombo() {
        
        cmbSupplier.removeAllItems();
        for(Supplier s : supplierDirectory.getSupplierlist()){
        
            cmbSupplier.addItem(s);
            
        }
    }

    private void populateProductTable() {
        
        Supplier selectedSupplier = (Supplier) cmbSupplier.getSelectedItem();
        if (selectedSupplier==null){
        return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblProductCatalog.getModel();
        model.setRowCount(0);

        for (Product p : selectedSupplier.getProductCatalog().getProductcatalog()) {
            Object row[] = new Object[4];
            row[0] = p;
            row[1] = p.getModelNumber();
            row[2] = p.getPrice();
            row[3] = p.getAvail();
            model.addRow(row);
        }
    }
    
    private void populateCartTable() {
        
        
        DefaultTableModel model = (DefaultTableModel) tblCart.getModel();
        model.setRowCount(0);

        for (OrderItem oi : currentOrder.getOrderItemList()) {
            Object row[] = new Object[3];
            row[0] = oi;
            //row[1] = oi.getSalesPrice();
            row[1] = oi.getQuantity();
            //row[3] = oi.getQuantity() * oi.getSalesPrice();
            model.addRow(row);
        }
        tblCart.setBackground(white);
    }
    
    private void populateProductTable(String keyword) {
        
       /*
        DefaultTableModel model = (DefaultTableModel) tblProductCatalog.getModel();
        model.setRowCount(0);
        
        for (Supplier s: supplierDirectory.getSupplierlist()){
        
        for (Product p : s.getProductCatalog().getProductcatalog()) {
            
            if (p.getProdName().equalsIgnoreCase(keyword)){
            Object row[] = new Object[4];
            row[0] = p;
            row[1] = p.getModelNumber();
            row[2] = p.getPrice();
            row[3] = p.getAvail();
            model.addRow(row);
        }
        }
        }
*/ 
    }
   
}
