import java.util.Scanner;
/**
 * Write a description of class Owner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Owner extends Users
{
    // instance variables - replace the example below with your own
    private int restaurantId;
    private RestaurantList rest;
    /**
     * Constructor for objects of class Owner
     */
    public Owner()
    {
        // initialise instance variables
        super();
        restaurantId = 1;
        rest = new RestaurantList();
    }
    
    /**
     * Call this method to create a new restaurant, Insert restaurant details
     */
    public void createRestaurants(String RestName, String restCat, String Address,
    int restPrice, String restDesc)
    {
        rest.createRestaurant(RestName, restCat, Address, restPrice, restDesc);
    }
    
    /**
     * call this method to add restaurant, insert which restaurant, then the menu
     */
    public void createMenu(int i, String MenuName, String menuDesc, String foodCategory, String foodName, double price)
    {
        rest.getRestDetails(i).createMenus(MenuName, menuDesc, foodCategory, foodName, price);
    }
    
    public void addMenu(int i, String foodCategory, String foodName, double price)
    {
        rest.getRestDetails(i).getMenu(i).createMenu(foodCategory, foodName, price);
    }
    
    public void removeMenuItem(int i)
    {
        rest.getRestDetails(i).getMenu(i).removeMenu(i);
    }
    
    public void printRestaurants()
    {
        rest.printRestaurants();
    }
    
    public void printMenu(int i)
    {
        rest.getRestDetails(i).printMenus();
    }
    
    public void printFood(int i)
    {
        rest.getRestDetails(i).getMenu(i).printing();
    }
    
    public void getRestaurantFlag()
    {
        rest.getRestFlag();
    }
    
    public void setRestaurantFlag(int i, boolean flag)
    {
        rest.getRestDetails(i).setRestFlag(flag);
    }
}
