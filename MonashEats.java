import java.util.Scanner;
import java.util.ArrayList;
/**
 * Write a description of class MonashEats here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MonashEats
{
    // instance variables - replace the example below with your own
    private String username;
    private String password;
    private Scanner input;
    private Users users;
    //private ArrayList<Users> users;
    /**
     * Constructor for objects of class MonashEats
     */
    public MonashEats()
    {
        // initialise instance variables
        //users = new ArrayList<>();
        users = new Users();
        input = new Scanner(System.in);
    }

    public static void main(String[] args)
    {
        MonashEats eats = new MonashEats();
        eats.check();
    }

    public MonashEats(String username, String password)
    {
        this.username = username;
        this.password = password;
    }

    public void check()
    {
        System.out.println("Press 1 if you already have an account or Press 2 if you want to register");
        Scanner ralph = new Scanner(System.in);
        int number  = ralph.nextInt();
        boolean hey = true;
        while (hey) {
            if(number == 1)
            {
                login();
            }
            else
            {
                createAccount();  
            }
        }
    }   

    public void login()
    {
        int i = 0;
        while (i < 5) 
        {
            System.out.println("Please enter your username");
            String username = input.next();
            System.out.println("Please enter your password");
            String password = input.next();

            if(username.equals(users.getUsername()) & password.equals(users.getPassword()))
            {
                System.out.println("You have successfully logged in");   
            }
            else 
            {
                System.out.println("Wrong password or username");
            }
        }
    }

    public void createAccount()
    {
        System.out.println("Please enter your name");
        String name = input.next();
        users.setName(name);

        System.out.println("Please enter your username");
        String username = input.next();
        users.setUsername(username);

        System.out.println("Please enter your pasword");
        String password = input.next();
        users.setPassword(password);

        System.out.println("Please renter your password");
        String repassword = input.next();

        if(repassword.equals(users.getPassword()))
        {
            users.setPassword(password);   
        }
        else
        {
            System.out.println("Wrong password");   
        }

        System.out.println("Please enter your age");
        int age  = input.nextInt();
        users.setAge(age);

        System.out.println("Please enter your telephone number");
        String telephone = input.next();
        users.setTelephone_number(telephone);

        System.out.println("Please enter your address");
        String address = input.next();
        users.setAddress(address);
    }
}
