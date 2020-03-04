import java.util.ArrayList;
/**
 * Write a description of class Customer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Customer extends Users
{
    // instance variables - replace the example below with your own
    private ArrayList<OrderHistory> reciept;
    private CartList cart;

    /**
     * Constructor for objects of class Customer
     */
    public Customer()
    {
        reciept = new ArrayList<OrderHistory>();
        cart = new CartList();
    }

    public void createCart(int i)
    {
        cart.createCart(i);
    }

    public void createHistory()
    {
        cart.testing();
        cart.testing();
        double price = cart.calculateFinalPrice();
        for (int i = 0; i < cart.getSize(); i++)
        {
            reciept.add(new OrderHistory(cart.returningCart(), price));
            //reciept.add(new OrderHistory(cart.returningCart()));
        }

    }

    public void fishined()
    {
        OrderHistory ord = new OrderHistory();
        double reciepts = 0;
        cart.testing();
        cart.testing();
        cart.testing();
        cart.testing();
        int b = 0;
        reciept.get(b).addCartHistory();
        for (int i = 0; i < cart.getSize(); i++)
        {
            //ord.adding(cart.getCart(i));
            //reciept.add(new OrderHistory(cart.getCart(i)));
        }
    }

    public void finishCart()
    {
        int i = 0;
        double reciepts = 0;
        OrderHistory ord = new OrderHistory();
        ord.addCartHistory();
        reciepts = cart.calculateFinalPrice();
        //reciept.add(new OrderHistory(reciepts));
        System.out.println(reciepts);
        //reciept.get(i).addCartHistory();
        //cart.finishCartDelete();
        //ord.printOrderHistory();
        //reciept.get(i).printOrderHistory();
    }

    public void printCart()
    {
        cart.printCart();
    }

    public void printOrderHistory()
    {
        int i = 0;
        reciept.get(i).printOrderHistory();
    }

    public void printRest()
    {
        cart.printRest();
    }

    public void printMenu(int i, int b)
    {
        i = (i -1);
        b = (b -1);
        cart.printMenu(i, b);
    }

    public void printFood(int i, int b)
    {
        i = (i -1);
        b = (b -1);
        cart.printFood(i, b);
    }

}
