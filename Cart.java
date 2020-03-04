import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
/**
 * Write a description of class Cart here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cart
{
    // instance variables - replace the example below with your own
    private String foodname;
    private double foodprice;
    private int totalquantity;
    private double totalprice;
    private String RestaurantName;
    private String date;

    /**
     * Constructor for objects of class Cart
     */
    public Cart()
    {
        this.foodname = "";
        this.foodprice = 0;
        this.RestaurantName = "";
        this.totalprice = 0;
        this.date = date;
    }

    public Cart(String foodname, double foodprice, String RestaurantName, int totalquantity, double totalprice, String date)
    {
        this.foodname = foodname;
        this.foodprice = foodprice;
        this.RestaurantName = RestaurantName;
        this.totalquantity = totalquantity;
        this.totalprice = totalprice;
        this.date = date;
    }

    public void addFoodToCart()
    {
        RestaurantList list = new RestaurantList();
        printRest();
        System.out.println("choose restaurant");
        
        int i = 0;
        this.RestaurantName = list.getDetails(i);
    }
    
    public String returnRestName(int i)
    {
        RestaurantList list = new RestaurantList();
        return list.getRestDetails(i).getRestaurantName();
    }
    
    public String returnFoodName(int i)
    {
        RestaurantList list = new RestaurantList();
        return list.getRestDetails(i).getMenu(i).getFoodDetails(i).getFoodName();
    }
    
    public double returnFoodPrice(int i)
    {
        RestaurantList list = new RestaurantList();
        return list.getRestDetails(i).getMenu(i).getFoodDetails(i).getPrice();
    }
    
    public void testing()
    {
        RestaurantList list = new RestaurantList();
        list.createRestaurant();
    }
    
    public void printRest()
    {
        RestaurantList list = new RestaurantList();
        list.printRestaurants();
    }
    
    public void printMenu(int i, int b)
    {
        RestaurantList list = new RestaurantList();
        list.printMenu(i, b);
    }
    
    public void printFood(int i, int b)
    {
        RestaurantList list = new RestaurantList();
        list.printFood(i, b);
    }

    public String getFoodname()
    {
        return foodname;
    }

    public void setFoodname(String foodname)
    {
        this.foodname=foodname;
    }

    public String getRestName()
    {
        return RestaurantName;
    }

    public void setRestName(String restName)
    {
        RestaurantName = restName;
    }

    public double getFoodprice()
    {
        return foodprice;   
    }

    public void setFoodprice(double foodprice)
    {
        this.foodprice=foodprice;
    }

    public int getTotalquantity()
    {
        return totalquantity;   
    }

    public void setTotalquantity(int totalquantity)
    {
        this.totalquantity=totalquantity;   
    }

    public double getTotalPrice()
    {
        return totalprice;   
    }

    public void setTotalprice(double totalprice)
    {
        this.totalprice=totalprice;    
    }

    public String getDate()
    {
        return date;   
    }
    
    public String getDates()
    {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        String dates = dateFormat.format(date);
        return dates;
    }

    public void setDate(String date)
    {
        this.date = date;     
    }
    
    public void test()
    {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        Date date1 = new Date();
        this.foodname = "Butter chicken";
        this.foodprice = 12;
        this.RestaurantName = "6 dollar curry";
        this.totalprice = 24;
        this.date = dateFormat.format(date1);
    }
}
