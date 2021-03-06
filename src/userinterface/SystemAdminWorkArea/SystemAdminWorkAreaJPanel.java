/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryMan;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;

import Business.Organization;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author MyPC1
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount account;
    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer,UserAccount account,EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        this.account = account;
       populateTree();
    }
    
    public void populateTree(){
          DefaultTreeModel model=(DefaultTreeModel)jTree.getModel();
        CustomerDirectory customer=ecosystem.getCustomerDirectory();
         DeliveryManDirectory deliveryMan=ecosystem.getDeliveryManDirectory();
        RestaurantDirectory restaurant=ecosystem.getRestaurantDirectory();
        
        List<Customer> customerList;
        List<DeliveryMan> deliveryManList;
        List<Restaurant> restaurantList;
        
        DefaultMutableTreeNode sysadmin=new DefaultMutableTreeNode("System Administrator");
        DefaultMutableTreeNode root=(DefaultMutableTreeNode)model.getRoot();
        root.removeAllChildren();
        root.insert(sysadmin, 0);
        
        DefaultMutableTreeNode customerNode;
        DefaultMutableTreeNode deliveryNode;
        DefaultMutableTreeNode restaurantNode;
        
        customerList= customer.getCustomerList();
            deliveryManList = deliveryMan.getDeliveryManList();
            restaurantList = restaurant.getRestaurantList();
        
        for(int i=0;i<3;i++){
            if(i==0){
                 customerNode=new DefaultMutableTreeNode("Customer");
            sysadmin.insert(customerNode, i);
               for(int j=0; j<customerList.size();j++){
                    Customer cus =customerList.get(j);
                    DefaultMutableTreeNode customerNode1 =new DefaultMutableTreeNode(cus.getCustomerUser());
                    customerNode.insert(customerNode1, j);
                 }
            } else if(i ==1){
                 restaurantNode=new DefaultMutableTreeNode("Restaurant");
                sysadmin.insert(restaurantNode, i);
                for(int j=0; j< restaurantList.size();j++){
                   Restaurant rest =restaurantList.get(j);
                   DefaultMutableTreeNode restaurantNode1=new DefaultMutableTreeNode(rest.getRestaurantName());
                    restaurantNode.insert(restaurantNode1, j);
                }
            
            } else {
                deliveryNode=new DefaultMutableTreeNode("Delivery Man");
                sysadmin.insert(deliveryNode, i);
                for(int j=0; j< deliveryManList.size();j++){
                    DeliveryMan del=deliveryManList.get(j);
                    DefaultMutableTreeNode deliveryNode1 =new DefaultMutableTreeNode(del.getDeliveryUser());
                    deliveryNode.insert(deliveryNode1, j);
                }
            }
        }
        model.reload();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree = new javax.swing.JTree();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblSelectedNode = new javax.swing.JLabel();
        btnCust = new javax.swing.JButton();
        btnRest = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                jTreeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jTree);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
        );

        jSplitPane.setLeftComponent(jPanel1);

        jLabel1.setText("Selected Node:");

        lblSelectedNode.setText("<View_selected_node>");

        btnCust.setText("Manage All Customers");
        btnCust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustActionPerformed(evt);
            }
        });

        btnRest.setText("Manage Restaurants");
        btnRest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestActionPerformed(evt);
            }
        });

        btnDel.setText("Manage Deliveryman");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(lblSelectedNode))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCust, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(276, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblSelectedNode))
                .addGap(54, 54, 54)
                .addComponent(btnCust)
                .addGap(18, 18, 18)
                .addComponent(btnRest)
                .addGap(18, 18, 18)
                .addComponent(btnDel)
                .addContainerGap(175, Short.MAX_VALUE))
        );

        jSplitPane.setRightComponent(jPanel2);

        add(jSplitPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustActionPerformed
           CustomerManagementJPanel customerManagement = new CustomerManagementJPanel(userProcessContainer, account, ecosystem);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add(customerManagement);
        layout.next(userProcessContainer);   
        populateTree();
    }//GEN-LAST:event_btnCustActionPerformed

    private void btnRestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestActionPerformed
        RestaurantManagementJPanel restaurantManagement = new RestaurantManagementJPanel(userProcessContainer, account, ecosystem);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add(restaurantManagement);
        layout.next(userProcessContainer);
        populateTree();
    }//GEN-LAST:event_btnRestActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
         DeliveryManManagementJPanel deliveryManManagement = new DeliveryManManagementJPanel(userProcessContainer, account, ecosystem);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add(deliveryManManagement);
        layout.next(userProcessContainer);
        populateTree();
    }//GEN-LAST:event_btnDelActionPerformed

    private void jTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_jTreeValueChanged

        DefaultMutableTreeNode selectedNode= (DefaultMutableTreeNode)jTree.getLastSelectedPathComponent();
        if(selectedNode!=null){
            lblSelectedNode.setText(selectedNode.toString());
        }
    }//GEN-LAST:event_jTreeValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCust;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnRest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane;
    private javax.swing.JTree jTree;
    private javax.swing.JLabel lblSelectedNode;
    // End of variables declaration//GEN-END:variables
}
