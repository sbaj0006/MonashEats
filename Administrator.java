
/**
 * Write a description of class Administrator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Administrator extends Users
{
    private RestaurantList list;
    private Customer cust;
    private Owner own;

    /**
     * Constructor for objects of class Administrator
     */
    public Administrator()
    {
        list = new RestaurantList();
        cust = new Customer();
        own = new Owner();
    }

    public void getUserFlags()
    {
        getFlag();
    }

    public void changeUserFlag()
    {
        setFlag(false);
    }
    
    public void getRestaurantFlag()
    {
        list.getRestFlag();
    }
    
    public void printRest()
    {
        list.printRestaurants();
    }
    
    public void printMenu(int i)
    {
        list.getRestDetails(i).printMenus();
    }
    
    public void printFood(int i, int b)
    {
        i = (i -1);
        b = (b -1);
        list.getRestDetails(i).getMenu(b).printing();
    }
    
    public void setRestaurantFlag(int i, boolean flag)
    {
        list.getRestDetails(i).setRestFlag(flag);
    }
}
