/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {
    private List<Restaurant> restaurantList = new ArrayList<>();

    public RestaurantDirectory() {
    }

    public List<Restaurant> getRestaurantList() {
        return restaurantList;
    }

    public void setRestaurantList(List<Restaurant> restaurantList) {
        this.restaurantList = restaurantList;
    }
    
    public Restaurant createRestaurant(){
        Restaurant restaurant = new Restaurant();
        restaurantList.add(restaurant);
        return restaurant;
    }
    
    public void removeEncounter(Restaurant encounter) {
        restaurantList.remove(encounter);
    }
}
