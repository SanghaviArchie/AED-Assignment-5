/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.UserAccount.UserAccount;

/**
 *
 * @author harold
 */
public class DeliveryMan {
    private UserAccount deliveryUser;

    public UserAccount getDeliveryUser() {
        return deliveryUser;
    }

    public void setDeliveryUser(UserAccount deliveryUser) {
        this.deliveryUser = deliveryUser;
    }
    
    @Override
    public String toString(){
        return deliveryUser.getEmployee().getName();
    }
}
