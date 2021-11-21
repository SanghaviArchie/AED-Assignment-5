/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import userinterface.SystemAdminWorkArea.*;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Restaurant.CommentManage;
import Business.Restaurant.Restaurant;
import Business.Role.AdminRole;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.Order;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dhairyasheel
 */
public class CommentManagementJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RestaurantManagementJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount account;
     Order selectedItem;
     Restaurant restaurant;
     int rowIndex;
    public CommentManagementJPanel(JPanel userProcessContainer,UserAccount account,Restaurant restaurant) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.restaurant = restaurant;
        this.account = account;
        initComponents();
        populateOrder();
    }

    private void populateOrder() {
        DefaultTableModel model = (DefaultTableModel) tblComment.getModel();
        
        model.setRowCount(0);
        
        for (CommentManage menu : restaurant.getComment()){
            Object[] row = new Object[3];
            row[0] = menu.getCustomer();
            row[1] = menu.getDish();
            row[2] = menu.getComment();
            model.addRow(row);
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

        lblTitle = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblComment = new javax.swing.JTable();

        setBackground(new java.awt.Color(254, 254, 254));

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblTitle.setText("Menu Management");

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblComment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "customer", "Dish", "Comment"
            }
        ));
        tblComment.setGridColor(new java.awt.Color(254, 254, 254));
        jScrollPane1.setViewportView(tblComment);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btnBack)
                        .addGap(171, 171, 171)
                        .addComponent(lblTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(207, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(lblTitle))
                .addGap(62, 62, 62)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(192, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblComment;
    // End of variables declaration//GEN-END:variables

    
}