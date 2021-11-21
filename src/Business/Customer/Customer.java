/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harold
 */
public class Customer {
    private UserAccount customer;

    public UserAccount getCustomerUser() {
        return customer;
    }

    public void setCustomerUser(UserAccount deliveryUser) {
        this.customer = deliveryUser;
    }
    
    @Override
    public String toString(){
        return customer.getEmployee().getName();
    }
}
