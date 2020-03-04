import java.util.Date;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
/**
 * Write a description of class Reciepts here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OrderHistory
{
    // instance variables - replace the example below with your own
    private ArrayList<Cart> hist;
    private double totalprice;

    /**
     * Constructor for objects of class Reciepts
     */
    public OrderHistory()
    {
        hist = new ArrayList<>();
    }
    
    public OrderHistory(ArrayList<Cart> adding, double price)
    {
        this.hist = adding;
        totalprice = price;
    }
    
    public void adding(String hey)
    {
        
        
        //this.totalprice = price;
    }

    public void addCartHistory()
    {
        CartList carts = new CartList();
        for (int i = 0; i < carts.getSize(); i ++)
        {
            hist.add(carts.getCart(i));
        }
    }

    public double getTotalPrice()
    {
        return totalprice;   
    }

    public void printOrderHistory()
    {

        for (int i = 0; i < hist.size(); i++)
        {
            System.out.println("Restaurant Name: " + hist.get(i).getRestName());
            System.out.println("Food Name: " + hist.get(i).getFoodname());
            System.out.println("Food Price: " + hist.get(i).getFoodprice());
            System.out.println("Quantity: " + hist.get(i).getTotalquantity());
            System.out.println("Total Price: " + hist.get(i).getTotalPrice());
            System.out.println("Date: " + hist.get(i).getDate());
        }

    }
}
