import java.util.Scanner;

public class Display
{
    private Scanner s = new Scanner(System.in);
    private boolean check = false;
    
    public String mainPage()
    {
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("                            Welcome to MonashEats                          ");
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("                        Login Now To Make Your Order                       ");
        System.out.println("                              LOG IN (Enter L)                             ");
        System.out.println("");
        System.out.println("                              Sign Up For Free                             ");
        System.out.println("                            REGISTER NOW(Enter R)                          ");
        System.out.println("");
        System.out.println("                               ENTER E TO EXIT                             ");
        System.out.println("");
        System.out.print("     Enter Your Choice: ");
        String input = s.next();
        check = false;
        while (check == false){
            if (input.equals("L") || input.equals("R") || input.equals("E")){
                check = true;
            }
            else if(input.equals("l") || input.equals("r") || input.equals("e")){
                System.out.print("     The input shoulc be uppercase: ");
                input = s.next();
            }
            else{
                System.out.print("     Please Enter L For Login Or R For Register Or E To Exit: ");
                input = s.next();
            }
        }
        System.out.println("");
        return input;
    }
    
    //log in
    public String login(){
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("                                 LOGIN PAGE                                ");
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.print("                      Username: ");
        String username = s.next();
        System.out.println("");     
        System.out.print("                      Password: ");
        String password = s.next();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        return username;
    }
   
    //log out
    public void logout(){
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("                         Thanks For Using MonashEats                       ");
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("                             You Are Loged Out                             ");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
    }
    
    
    //sign up
    public String signUp(){
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("                                 SIGN UP PAGE                              ");
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("                                You Can Join As                            ");
        System.out.println("");
        System.out.println("");
        System.out.println("                                 1 - Customer                              ");
        System.out.println("");
        System.out.println("                                  2 - Owner                                ");
        System.out.println("");
        System.out.println("");
        System.out.print(" Choose Your Account Type By Entering The Number: ");
        String type = s.next();
        check = false;
        while (check == false){
            if (type.equals("1") || type.equals("2")){
                check = true;
            }
            else{
                System.out.print("     The Account Type Should Be 1 Or 2: ");
                type = s.next();
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        return type;
    }
    
    // sign up as a customer
    public String signCustomer(){
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("                             SIGN UP AS A CUSTOMER                         ");
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("");
        System.out.println("");
        System.out.println("  Please enter following details : ");
        System.out.println("");
        System.out.print("         Email: ");
        String email = s.next();
        System.out.println("");
        System.out.print("         Username: ");
        String username = s.next();
        System.out.println("");
        System.out.print("         Password: ");
        String password1 = s.next();
        System.out.println("");
        System.out.print("         Confirm Password: ");
        String password2 = s.next();
        System.out.println("");
        System.out.print("         Address: ");
        String address = s.next();
        System.out.println("");
        System.out.print("         Postcode: ");
        String postcode = s.next();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        return username;
    }
    
    //sign up as a owner
    public String signOwner(){
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("                              SIGN UP AS A OWNER                           ");
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("");
        System.out.println("");
        System.out.println("  Please enter following details : ");
        System.out.println("");
        System.out.print("         Email: ");
        String email = s.next();
        System.out.println("");
        System.out.print("         Username: ");
        String username = s.next();
        System.out.println("");
        System.out.print("         Password: ");
        String password1 = s.next();
        System.out.println("");
        System.out.print("         Confirm Password: ");
        String password2 = s.next();
        System.out.println("");
        System.out.print("         Restaurant Name: ");
        String restName = s.next();
        System.out.println("");
        System.out.print("         Restaurant Address: ");
        String restAddress = s.next();
        System.out.println("");
        System.out.print("         Restaurant Postcode: ");
        String restPostcode = s.next();
        System.out.println("");
        System.out.println("");
        return username;
    }
    
    public String customerPage(String username){
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("                               Customer "+ username                         );
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("                                  1 - Search                               ");
        System.out.println("");
        System.out.println("                                 2 - View Cart                             ");
        System.out.println("");
        System.out.println("                              3 - View Order History                       ");
        System.out.println("");
        System.out.println("                            4 - Edit Delivery Address                      ");
        System.out.println("");
        System.out.println("                                  5 - Log Out                              ");
        System.out.println("");        
        System.out.print("    Select What You Want To Do By Entering Number: ");
        String function = s.next();
        check = false;
        while (check == false){
            if (function.equals("1") || function.equals("2") || function.equals("3") || function.equals("4")|| function.equals("5")){
                check = true;
            }
            else{
                System.out.print("    Please Enter A Number For Above Function List: ");
                function = s.next();
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        return function;
    }
    
    public String search(){
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("                                   SEARCH                                  ");
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("    Current Location: ON EARTH                                             ");
        System.out.println("");
        System.out.println("    Search By:                                                             ");
        System.out.println("                             1 - Restaurant Name                           ");
        System.out.println("");
        System.out.println("                              2 - Food Category                            ");
        System.out.println("");
        System.out.println("                                 3 - Price                                 ");
        System.out.println("");
        System.out.println("");
        System.out.print("      Enter the Search Type number: ");
        String type = s.next();
        check = false;
        while (check == false){
            if (type.equals("1") || type.equals("2") || type.equals("3")){
                check = true;
            }
            else{
                System.out.print("      Please Enter A Search Type Number From Above List: ");
                type = s.next();
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        return type;
    }
    
    public String search1(){
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("                              SEARCH RESTAURANT                            ");
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("    Current Location: ON EARTH                                             ");
        System.out.println("");
        System.out.print("                   Search : ");
        String search = s.next();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        return search;
    }
    
    public String search2(){
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("                              SEARCH FOOD CATEGORY                         ");
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("    Current Location: ON EARTH                                             ");
        System.out.println("");
        System.out.print("                   Search : ");
        String search = s.next();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        return search;
    }
    
    public String search3(){
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("                                SEARCH BY PRICE                            ");
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("    Current Location: ON EARTH                                             ");
        System.out.println("");
        System.out.print("                   Search : ");
        String search = s.next();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        return search;
    }
    
    public String searchResult(String search){
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("                              SEARCH  " + search                           );
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("");
        System.out.println(" 1 - Restaurant Name");
        System.out.println("     Restaurant Category: ");
        System.out.println("     Restaurant Address: ");
        System.out.println("     Restaurant Price: ");
        System.out.println("     Restaurant Description: " );
        System.out.println("     Restaurant Feedback: " );
        System.out.println("");
        System.out.println(" 2 - Restaurant Name");
        System.out.println("     Restaurant Category: ");
        System.out.println("     Restaurant Address: ");
        System.out.println("     Restaurant Price: ");
        System.out.println("     Restaurant Description: " );
        System.out.println("     Restaurant Feedback: " );
        System.out.println("");
        System.out.println("");
        System.out.print("     Select Restaurant By Enter The Number: ");
        String restaurant = s.next();
        check = false;
        while (check == false){
            if (restaurant.equals("1") || restaurant.equals("2")){
                check = true;
            }
            else{
                System.out.print("     Please Enter A Valid Restaurant Number: ");
                restaurant = s.next();
            }
        }
        System.out.println("");
        return restaurant;
    }
    
    public String restaurant(){
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("                               RESTAURANT NAME                             ");
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("");
        System.out.println("    Restaurant Name");
        System.out.println("    Restaurant Category: ");
        System.out.println("    Restaurant Address: ");
        System.out.println("    Restaurant Price: ");
        System.out.println("    Restaurant Description: " );
        System.out.println("    Restaurant Feedback: " );
        System.out.println("    Menu: ");
        System.out.println("");
        System.out.println("     1 - Food 1   Price: ");
        System.out.println("         Description: ");
        System.out.println("     2 - Food 2   Price: ");
        System.out.println("         Description: ");
        System.out.println("     3 - Food 3   Price: ");
        System.out.println("         Description: ");
        System.out.println("     4 - Food 4   Price: ");
        System.out.println("         Description: ");
        System.out.println("     5 - Food 5   Price: ");
        System.out.println("         Description: ");
        System.out.println("");
        System.out.print("     Add Food Into Cart By Enter The Food Number: ");
        String food = s.next();
        check = false;
        while (check == false){
            if (food.equals("1") || food.equals("2") || food.equals("3")|| food.equals("4") || food.equals("5")){
                check = true;
            }
            else{
                System.out.print("     Please Enter A Valid Food Number: ");
                food = s.next();
            }
        }
        System.out.println("");
        System.out.println("");
        return food;
    }
    
    
    public String addCart(String food){
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("                                    CART                                   ");
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("");
        System.out.println(" Current Address: ");
        System.out.println(" Restaurant Name - ");
        System.out.println("   Food " + food + "        Price: " + "         Amount: ");
        System.out.println("                                                 Total Price: ");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.print("     Enter B Back To Menu Page OR Enter C To Create Order: ");
        String continueAdd = s.next();
        check = false;
        while (check == false){
            if (food.equals("B") || food.equals("C")){
                check = true;
            }
            else if(food.equals("b") || food.equals("c")){
                System.out.println("     The input should be uppercase!");
                food = s.next();
            }
            else{
                System.out.print("     Enter B Back To Menu Page OR Enter C To Create Order: ");
                food = s.next();
            }
        }
        System.out.println("");
        System.out.println("");
        return continueAdd;
    }
    
    public String createOrder(){
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("                                CREATE ORDER                               ");
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("");
        System.out.println(" Current Address: ");
        System.out.println(" Restaurant Name - ");
        System.out.println("   Food 1        Price:          Amount: ");
        System.out.println("   Food 2        Price:          Amount: ");
        System.out.println("   Food 3        Price:          Amount: ");
        System.out.println("                                 Total Price: ");
        System.out.println("");
        System.out.println("");
        System.out.print(" Enter C To Confirm: ");
        String confirm = s.next();
        check = false;
        while (check == false){
            if (confirm.equals("C")){
                check = true;
            }
            else if(confirm.equals("c")){
                System.out.print("     The input shoulc be uppercase!");
                confirm = s.next();
            }
            else{
                System.out.print("     Please Enter C To Confirm: ");
                confirm = s.next();
            }
        }
        System.out.println("");
        System.out.println("");
        return confirm;
    }
    
    public void confirm(){
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("                                ORDER CONFIRM                              ");
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("");
        System.out.println("");
        System.out.println("                   Your Order Already Sent To The Restaurant!              ");
        System.out.println("");
        System.out.println("");
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
    }
    
    public void viewCart(){
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("                                    CART                                   ");
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("                               Nothing In Here!                            ");
        System.out.println("");
        System.out.println("                  Enter B Back To Main Page To Search Restaurant           ");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
    
    public void viewHistory(){
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("                                ORDER HISTORY                              ");
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("");
        System.out.println("Order number #1 MMM Burger 03/04/2019 13:00    Order Status: UNCONFIRMED");
        System.out.println("                MMM Burger  *1  $7.99");
        System.out.println("                Chicken Nugget  *1 $ 5.99");
        System.out.println("                Paid $8.98");
        System.out.println("");
        System.out.println("Order number # 2MMM Burger 04/04/2019 14:00    Order Status: CONFIRMED");
        System.out.println("                MMM Burger  *1  $7.99");
        System.out.println("                Chicken Nugget  *1 $ 5.99");
        System.out.println("                Paid $8.98");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
    
    public void editAddress(){
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("                               Edit Address"                                );
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
    }
    
    public String ownerPage(String username){
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("                                 OWNER "+ username                          );
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("                            1 - Manage Restaurants                         ");
        System.out.println("");
        System.out.println("                              2 - Manage Orders                            ");
        System.out.println("");
        System.out.println("                              3 - Manage Coupons                           ");
        System.out.println("");
        System.out.println("                                 4 - Search                                ");
        System.out.println("");
        System.out.println("                                 5 - Log Out                               ");
        System.out.println("");
        System.out.print("     Enter the function number: ");
        String function = s.next();
        check = false;
        while (check == false){
            if (function.equals("1") || function.equals("2") || function.equals("3") || function.equals("4")|| function.equals("5")){
                check = true;
            }
            else{
                System.out.print("     Please Enter A Number For Above Function List: ");
                function = s.next();
            }
        }
        System.out.println("");
        System.out.println("");
        return function;
    }
    
    public String manageRestaurant(){
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("                              Manage Restaurant                            ");
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("                              1 - Restaurants 1                            ");
        System.out.println("");
        System.out.println("                              2 - Restaurants 2                            ");
        System.out.println("");
        System.out.println("                              3 - Restaurants 3                            ");
        System.out.println("");
        System.out.println("");
        System.out.print("     Enter the Restaurant number: ");
        String rest = s.next();
        check = false;
        while (check == false){
            if (rest.equals("1") || rest.equals("2") || rest.equals("3")){
                check = true;
            }
            else{
                System.out.print("     Restautant Does Not Exist! Please Enter Valid Restaurant Number: ");
                rest = s.next();
            }
        }
        System.out.println("");
        System.out.println("");
        return rest;
    }
    
    public String restaurantOwner(String rest){
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("                                Restaurants " + rest                        );
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("");
        System.out.println("     1 - Restaurant Name:  xxx ");
        System.out.println("     2 - Restaurant Opening Hour: 11 am - 11 pm  ");
        System.out.println("     3 - Restaurant Status: Opening ");
        System.out.println("     4 - Restaurant Address: 1 William St, Melbourne");
        System.out.println("     5 - Restaurant Postcode: 3000");
        System.out.println("     6 - Restaurant Category: Burger, Fastfood ");
        System.out.println("     7 - Current Menu: Menu A");
        System.out.println("");
        System.out.println("");
        System.out.println("   Enter Details Number To Update: ");
        System.out.print("   Or Enter S To Suspend This Restaurant: ");
        String manage = s.next();
        check = false;
        while (check == false){
            if (manage.equals("1") || manage.equals("2") || manage.equals("3")|| manage.equals("4") || manage.equals("5")|| manage.equals("6") || manage.equals("7")|| manage.equals("S")){
                check = true;
            }
            else if(manage.equals("c")){
                System.out.print("     Suspend Command should be Uppercase: ");
                manage = s.next();
            }
            else{
                System.out.print("     Restautant Does Not Exist! Please Enter Valid Restaurant Number: ");
                manage = s.next();
            }
        }
        System.out.println("");
        return manage;
    }
    
    public void update(){
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("                                  UPDATE                                   ");
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("");
        System.out.println("");
        System.out.println("    Current Detail : ");
        System.out.println("");
        System.out.print("    Enter The Update: ");
        String update = s.next();
        System.out.println("");
    }
    
    public void suspend(String rest){
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("                          Suspend Restaurant " + rest                       );
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("");
        System.out.println("");
        System.out.println("                        This Restaurant Has Been Suspend!                  ");
        System.out.println("");
        System.out.println("");
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
    }
    
    public void manageOrder(){
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("                              Manage Orders                                ");
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
    }
    
    public void manageCoupon(){
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("                              Manage Coupons                               ");
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
    }
    
}
