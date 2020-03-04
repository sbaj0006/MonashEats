import java.util.Date;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
/**
 * Write a description of class CartList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CartList
{
    private ArrayList<Cart> cart;

    /**
     * Constructor for objects of class CartList
     */
    public CartList()
    {
        cart = new ArrayList<>();
    }
    
    public ArrayList<Cart> returningCart()
    {
        return cart;
    }

    public void createCart(int i)
    {
        Cart carts = new Cart();
        carts.testing();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date1 = new Date();
        String RestaurantName = carts.returnRestName(i);
        String foodname = carts.returnFoodName(i);
        double foodprice = carts.returnFoodPrice(i);
        int totalquantity = 2;
        double totalprice = 24;
        String date = dateFormat.format(date1);

        cart.add(new Cart(foodname, foodprice, RestaurantName, totalquantity, totalprice, date));
    }
    
    public void testing()
    {
        Cart carts = new Cart();
        String RestaurantName = "Abc";
        String foodname = "dfdfed";
        double foodprice = 12.0;
        int totalquantity = 2;
        double totalprice = (foodprice * totalquantity);
        
        String date = carts.getDates();
        cart.add(new Cart(foodname, foodprice, RestaurantName, totalquantity, totalprice, date));
    }

    public void printCart()
    {
        for (int i = 0; i < cart.size(); i++)
        {
            System.out.println("Restaurant Name: " + cart.get(i).getRestName());
            System.out.println("Food Name name: " + cart.get(i).getFoodname());
            System.out.println("Food Price: " + cart.get(i).getFoodprice());
            System.out.println("Total Quantity: " + cart.get(i).getTotalquantity());
            System.out.println("Total Price: " + cart.get(i).getTotalPrice());
            System.out.println("Get Date: " + cart.get(i).getDate());
        }
    }
    
    public void finishCartDelete()
    {
        for (int i = 0; i < cart.size(); i ++)
        {
           cart.remove(i); 
        }
    }
    
    public int getSize()
    {
        return cart.size();
    }
    
    public Cart getCart(int i)
    {
        return cart.get(i);
    }

    public void printRest()
    {
        Cart carts = new Cart();
        carts.printRest();
    }

    public void printMenu(int i, int b)
    {
        Cart carts = new Cart();
        carts.printMenu(i, b);
    }

    public void printFood(int i, int b)
    {
        Cart carts = new Cart();
        carts.printFood(i, b);
    }
    
    public double calculateFinalPrice()
    {
        double totalprice = 0;
        for (int i = 0; i < cart.size(); i ++)
        {
            totalprice = (totalprice + cart.get(i).getFoodprice());
        }
        return totalprice;
    }

}
