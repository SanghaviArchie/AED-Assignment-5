package Business;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryMan;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Employee.Employee;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.Role.AdminRole;
import Business.Role.CustomerRole;
import Business.Role.DeliverManRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import business.Organization.SystemAdminOrganization;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        system.setCustomerDirectory(new CustomerDirectory());
        system.setRestaurantDirectory(new RestaurantDirectory());
        system.setDeliveryManDirectory(new DeliveryManDirectory());
        
        //Create a network
        
        //create an enterprise
        
        //initialize some organizations
        
        //have some employees 
        
        //create user account
        
        // Sytem Admin
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sys", "sys", employee, new SystemAdminRole());
        
        //Restaurant Management 1
       Employee restEmp = system.getEmployeeDirectory().createEmployee("manager1");
       UserAccount<Restaurant>  restuser = system.getUserAccountDirectory().createUserAccount("m1", "m1", restEmp, new AdminRole());
       Restaurant restaurant = system.getRestaurantDirectory().createRestaurant();
       restaurant.setManager(restuser);
       restuser.setWorkAreaObj(restaurant);
       restaurant.setRestaurantName("Indian Taste");
       List<String> menu = new ArrayList<>( Arrays.asList("Panner", "Chicken", "Curry"));
       restaurant.setMenu(menu);
       
       //Restaurant Management 2
       Employee restEmp1 = system.getEmployeeDirectory().createEmployee("manager2");
       UserAccount<Restaurant>  restuser1 = system.getUserAccountDirectory().createUserAccount("m2", "m2", restEmp1, new AdminRole());
       Restaurant restaurant1 = system.getRestaurantDirectory().createRestaurant();
       restaurant1.setManager(restuser1);
       restuser1.setWorkAreaObj(restaurant1);
       restaurant1.setRestaurantName("Italian");
       List<String> menu1 = new ArrayList<>( Arrays.asList("Pasta", "spaghetti"));
       restaurant1.setMenu(menu1);
         
        //Customer Management 1
       Employee custEmp = system.getEmployeeDirectory().createEmployee("cust1");
       UserAccount<Customer> custuser = system.getUserAccountDirectory().createUserAccount("c1", "c1", custEmp, new CustomerRole());
       Customer customer = system.getCustomerDirectory().createCustomer();
       customer.setCustomerUser(custuser);
       custuser.setWorkAreaObj(customer);
       
         //Customer Management 2
       Employee custEmp1 = system.getEmployeeDirectory().createEmployee("cust2");
       UserAccount<Customer> custuser1 = system.getUserAccountDirectory().createUserAccount("c2", "c2", custEmp1, new CustomerRole());
       Customer customer1 = system.getCustomerDirectory().createCustomer();
       customer1.setCustomerUser(custuser1);
       custuser1.setWorkAreaObj(customer1);
       
       //Delivery Man Management 1
       Employee delEmp = system.getEmployeeDirectory().createEmployee("del1");
       UserAccount deluser = system.getUserAccountDirectory().createUserAccount("d", "d", delEmp, new DeliverManRole());
       DeliveryMan deliveryMan = system.getDeliveryManDirectory().createDeliveryMan();
       deliveryMan.setDeliveryUser(deluser);
       
       
        return system;
    }
    
}
