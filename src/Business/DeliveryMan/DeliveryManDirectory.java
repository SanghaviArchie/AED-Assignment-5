/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Restaurant.Restaurant;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory {
    
     private List<DeliveryMan> deliveryManList = new ArrayList<>();

    public List<DeliveryMan> getDeliveryManList() {
        return deliveryManList;
    }

    public void setDeliveryManList(List<DeliveryMan> deliveryManList) {
        this.deliveryManList = deliveryManList;
    }
     
    public DeliveryMan createDeliveryMan(){
        DeliveryMan deliveryMan = new DeliveryMan();
        deliveryManList.add(deliveryMan);
        return deliveryMan;
    }
    
    public void removeEncounter(DeliveryMan deliveryMan) {
        deliveryManList.remove(deliveryMan);
    }
}
