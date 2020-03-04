import java.util.ArrayList;
/**
 * Write a description of class MenuList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MenuList
{
    // instance variables - replace the example below with your own
    private ArrayList<Food> food;
    private String MenuName;
    private String menuDesc;
    /**
     * Constructor for objects of class MenuList
     */
    public MenuList()
    {
        // initialise instance variables
        food = new ArrayList<>();
    }

    public MenuList(String MenuName, String menuDesc, ArrayList<Food> food)
    {
        this.MenuName = MenuName;
        this.menuDesc = menuDesc;
        this.food = food;
    }

    public void createMenu(String foodCategory, String foodName, double price) 
    {
        food.add(new Food(foodCategory, foodName, price));
    }

    public ArrayList<Food> getFoodList() 
    {
        Food fool = new Food();
        String cat = fool.getFoodCategory();
        String name = fool.getFoodName();
        double price = fool.getPrice();
        String abc = String.valueOf(price);
        return food;
    }

    public void printing()
    {
        for (int i = 0; i < food.size(); i++) 
        {
            System.out.println(food.get(i).getFoodName());
            System.out.println(food.get(i).getFoodCategory());
            System.out.println(food.get(i).getPrice());
        } 
    }

    public void removeMenu(int i)
    {
        food.remove(i);
    }

    public Food getFoodDetails(int i)
    {
        return food.get(i);
    }

    public String getMenuName()
    {
        return MenuName;
    }

    public String getMenuDesc()
    {
        return menuDesc;
    }

    public void setMenuName(String menuName)
    {
        MenuName = menuName;
    }

    public void setDescription(String menuDesc)
    {
        this.menuDesc = menuDesc;
    }
}
