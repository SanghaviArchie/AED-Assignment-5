/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harold
 */
public class Restaurant {
    private String restaurantName;
    private UserAccount Manager;
    private List<String> menu = new ArrayList<>();
    private List<CommentManage> comment = new ArrayList<>();

    public Restaurant(String restaurantName, UserAccount Manager) {
        this.restaurantName = restaurantName;
        this.Manager = Manager;
    }

    public Restaurant() {
    }

    public List<CommentManage> getComment() {
        return comment;
    }

    public void setComment(List<CommentManage> comment) {
        this.comment = comment;
    }

    public List<String> getMenu() {
        return menu;
    }

    public void setMenu(List<String> menu) {
        this.menu = menu;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public UserAccount getManager() {
        return Manager;
    }

    public void setManager(UserAccount Manager) {
        this.Manager = Manager;
    }
    
    public void addMenu(String item){
        menu.add(item);
    }
    
    public void deleteMenu(String item){
        menu.remove(item);
    }
    
    @Override
    public String toString(){
        return restaurantName;
    }
    
}
