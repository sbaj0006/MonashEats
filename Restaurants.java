import java.util.ArrayList;
/**
 * Write a description of class RestaurantList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RestaurantList
{
    // instance variables - replace the example below with your own
    private ArrayList<Restaurants> listOfRestaurants; 
    /**
     * Constructor for objects of class RestaurantList
     */
    public RestaurantList()
    {
        // initialise instance variables
        listOfRestaurants = new ArrayList<>();
    }

    public void createRest(String RestName, String restCat, String Address,
    int restPrice, String restDesc)
    {
        Restaurants resting = new Restaurants();
        listOfRestaurants.add(new Restaurants(RestName, restCat, Address, restPrice, restDesc, resting.returnMenu()));
    }

    public void createRestaurant(String RestName, String restCat, String Address,
    int restPrice, String restDesc)
    {
        Restaurants resting = new Restaurants();
        listOfRestaurants.add(new Restaurants(RestName, restCat, Address, restPrice, restDesc, resting.returnMenu()));
    }

    public void printRestaurants()
    {
        for(int i=0; i< listOfRestaurants.size(); i++)
        {
            System.out.println("Restaurant name: " + listOfRestaurants.get(i).getRestaurantName());  
            System.out.println("Restaurant category: " + listOfRestaurants.get(i).getRestaurantCategory());
            System.out.println("Restaurant Address: " + listOfRestaurants.get(i).getAddress());
            System.out.println("Restaurant Price: " + listOfRestaurants.get(i).getRestaurantPrice());
            System.out.println("get Restaqurant description: " +listOfRestaurants.get(i).getRestaurantDescription());
            System.out.println("Restaurant Feedback: " +listOfRestaurants.get(i).getFeedbackStarRating());
        }   
    } 

    public void createRestaurant()
    {
        int i = 0;
        String h = "KFC";
        String b = "abc";
        String rest = "caulf";
        int price = 10;
        String desc = "KFC";
        createRest(h, b, rest, price, desc);
        listOfRestaurants.get(i).havingFun();
    }

    public String getDetails(int i)
    {
        return listOfRestaurants.get(i).getRestaurantName();
    }

    public void printMenu(int i)
    {
        listOfRestaurants.get(i).printMenus();
    }

    public void printFood(int i)
    {
        listOfRestaurants.get(i).getMenu(i).printing();
    }

    public void getRestFlag()
    {
        int i = 0;
        listOfRestaurants.get(i).getRestFlag();
    }

    public Restaurants getRestDetails(int i)
    {
        return listOfRestaurants.get(i);
    }
}
