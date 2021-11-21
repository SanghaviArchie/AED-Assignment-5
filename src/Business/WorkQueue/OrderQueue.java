/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dhairyasheel
 */
public class OrderQueue {
    private List<Order> orderList = new ArrayList<>();

    public List<Order> getOrderList() {
        return orderList;
    }
    
    public Order createOrder(){
        Order order = new Order();
        orderList.add(order);
        return order;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
    
}
