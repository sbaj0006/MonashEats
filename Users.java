import java.util.ArrayList;
import java.util.Scanner;
/**
 * Write a description of class Users here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Users
{
    // instance variables - replace the example below with your own
    private int account_number;
    private String username;
    private String name;
    private String password;
    private int age;
    private String telephone_number;
    private String address;
    private Scanner input;
    private String flag;
    /**
     * Constructor for objects of class Users
     */
    public Users()
    {
        // initialise instance variables
        this.account_number = account_number;
        this.username = username;
        this.name = name;
        this.password = password;
        this.age = age;
        this.telephone_number = telephone_number;
        this.address = address;
        input = new Scanner(System.in);
    }

    public int getAccount_number()
    {
        return account_number;
    }

    public void setAccount_number(int account_number)
    {
        this.account_number = account_number;
    }

    public String getUsername()
    {
        return username;   
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getName()
    {
        return name;   
    }

    public void setName(String username)
    {
        this.name = name;
    }

    public String getPassword()
    {
        return password;   
    }

    public void setPassword(String password)
    {
        this.password = password;   
    }

    public int getAge()
    {
        return age;   
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getTelephone_number()
    {
        return telephone_number;
    }

    public void setTelephone_number(String telephone_number)
    {
        this.telephone_number = telephone_number;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address; 
    }

    public void changePasswords()
    {
        System.out.println("Please enter your new password");
        String newpassword = input.next();
        if(newpassword.equals(this.getPassword()))
        {
            System.out.println("Your new password should not be the same as old one");
        }
        else
        {
            this.setPassword(newpassword);
            System.out.println("Password reset successfully");
        }

    }

    public void changeAddress()
    {
        System.out.println("Please enter your new address");
        String newaddress = input.next();
        this.setAddress(newaddress);
    }

    public void changeNumber()
    {
        System.out.println("Please enter your new telephone number");
        String newnumber = input.next();
        this.setTelephone_number(newnumber);
    }
    
    public String getFlag()
    {
        return flag;
    }
    
    public void setFlag(String flag)
    {
        this.flag = flag;
    }

}
