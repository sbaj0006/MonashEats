/**
 * Write a description of class Menu here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Food
{
    // instance variables - replace the example below with your own
    private String foodCategory;
    private String foodName;
    private double price; 
    /**
     * Constructor for objects of class Menu
     */
    public Food()
    {
        // initialise instance variables
        foodCategory = "";
        foodName = "";
        price = 0.0;
    }

    public Food(String foodCategory, String foodName, Double price) 
    {
        this.foodCategory = foodCategory;
        this.foodName = foodName;
        this.price = price;
    }

    public String getFoodCategory()
    {
        return foodCategory;   
    }

    public void setFoodCategory(String foodCategory)
    {
        this.foodCategory=foodCategory;
    }

    public String getFoodName()
    {
        return foodName;   
    }

    public void setFoodName(String foodName)
    {
        this.foodName = foodName;
    }

    public double getPrice()
    {
        return price;   
    }

    public void setPrice(double price)
    {
        this.price = price;   
    }

}
