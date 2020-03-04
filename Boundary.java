import java.util.Scanner;

public class Boundary
{
    private Display d = new Display();
    private Scanner s = new Scanner(System.in);
    private String input = ""; 
    private String back = "";
    
    public void customer(){
        input = d.mainPage();       
        switch(input){
            case "E":
                d.logout();
                break;
            case "L":                 
                String username = d.login();
                OUT:
                do{
                    String function = d.customerPage(username);
                    switch(function){
                        case "1": 
                            String searchType = d.search();
                            switch(searchType){
                                case "1": 
                                    d.searchResult(d.search1());
                                    String add = d.addCart(d.restaurant());
                                    while(add.equals("B")){
                                        add = d.addCart(d.restaurant());
                                    }
                                    String create = d.createOrder();
                                    if(create.equals("C")){
                                        d.confirm();
                                    }
                                    break;
                                case "2":
                                    d.searchResult(d.search2());
                                    String add2 = d.addCart(d.restaurant());
                                    while(add2.equals("B")){
                                        add = d.addCart(d.restaurant());
                                    }
                                    String create2 = d.createOrder();
                                    if(create2.equals("C")){
                                        d.confirm();
                                    }
                                    break;
                                case "3":
                                    d.searchResult(d.search3());
                                    String add3 = d.addCart(d.restaurant());
                                    while(add3.equals("B")){
                                        add3 = d.addCart(d.restaurant());
                                    }
                                    String create3 = d.createOrder();
                                    if(create3.equals("C")){
                                        d.confirm();
                                    }
                                    break;
                            }
                            break;
                        case "2": 
                            d.viewCart();
                            break;
                        case "3": 
                            d.viewHistory();
                            break;
                        case "4": 
                            d.editAddress();
                            break;
                        case "5":
                            d.logout();
                            break OUT;
                    }
                    System.out.print("     Enter B To Go Back To The Main Page Or Enter E To Log Out: ");
                    back = s.next();
                    boolean check = false;
                    while (check == false){
                        if (back.equals("B") || back.equals("E")){
                            check = true;
                        }
                        else if(back.equals("b") || back.equals("e")){
                            System.out.print("     The Input Should be Uppercase: ");
                            back = s.next();
                        }
                        else{
                            System.out.print("     Enter B To Go Back To The Main Page Or Enter E To Log Out: ");
                            back = s.next();
                        }
                    }
                }while(back.equals("B"));
                d.logout();
                break;
            case "R":
                String signType = d.signUp();
                if (signType.equals("1")){
                    username = d.signCustomer();
                    OUT:
                    do{
                        String function = d.customerPage(username);
                        switch(function){
                            case "1": 
                                String searchType = d.search();
                                switch(searchType){
                                    case "1": 
                                        d.searchResult(d.search1());
                                        String add = d.addCart(d.restaurant());
                                        while(add.equals("B")){
                                            add = d.addCart(d.restaurant());
                                        }
                                        String create = d.createOrder();
                                        if(create.equals("C")){
                                            d.confirm();
                                        }
                                        break;
                                    case "2":
                                        d.searchResult(d.search2());
                                        String add2 = d.addCart(d.restaurant());
                                        while(add2.equals("B")){
                                            add = d.addCart(d.restaurant());
                                        }
                                        String create2 = d.createOrder();
                                        if(create2.equals("C")){
                                            d.confirm();
                                        }
                                        break;
                                    case "3":
                                        d.searchResult(d.search3());
                                        String add3 = d.addCart(d.restaurant());
                                        while(add3.equals("B")){
                                            add3 = d.addCart(d.restaurant());
                                        }
                                        String create3 = d.createOrder();
                                        if(create3.equals("C")){
                                            d.confirm();
                                        }
                                        break;
                                }
                                break;
                            case "2": 
                                d.viewCart();
                                break;
                            case "3": 
                                d.viewHistory();
                                break;
                            case "4": 
                                d.editAddress();
                                break;
                            case "5":
                                d.logout();
                                break OUT;
                        }
                        System.out.print("     Enter B To Go Back To The Main Page Or Enter E To Log Out: ");
                        back = s.next();
                        boolean check = false;
                        while (check == false){
                            if (back.equals("B") || back.equals("E")){
                                check = true;
                            }
                            else if(back.equals("b") || back.equals("e")){
                                System.out.print("     The Input Should be Uppercase: ");
                                back = s.next();
                            }
                            else{
                                System.out.print("     Enter B To Go Back To The Main Page Or Enter E To Log Out: ");
                                back = s.next();
                            }
                        }
                    }while(back.equals("B"));
                    d.logout();
                    if (signType.equals("2")){
                        d.signOwner();
                    }
                break;
            }
        }
    }
        
    public void owner(){
        input = d.mainPage();
        switch(input){
            case "L": 
                String username = d.login();
                OUT:
                do{
                    String function = d.ownerPage(username);
                    switch(function){
                        case "1": 
                            String rest = d.manageRestaurant();
                            String manage = d.restaurantOwner(rest);
                            if (manage.equals("S")){
                               d.suspend(rest);
                            }
                            else{
                               d.update();
                            }
                            break;
                        case "2": 
                            d.manageOrder();
                            break;
                        case "3": 
                            d.manageCoupon();
                            break;
                        case "4": 
                            String searchType = d.search();
                            switch(searchType){
                                case "1": 
                                    d.searchResult(d.search1());
                                    String add = d.addCart(d.restaurant());
                                    while(add.equals("B")){
                                        add = d.addCart(d.restaurant());
                                    }
                                    String create = d.createOrder();
                                    if(create.equals("C")){
                                        d.confirm();
                                    }
                                    break;
                                case "2":
                                    d.searchResult(d.search2());
                                    String add2 = d.addCart(d.restaurant());
                                    while(add2.equals("B")){
                                        add = d.addCart(d.restaurant());
                                    }
                                    String create2 = d.createOrder();
                                    if(create2.equals("C")){
                                        d.confirm();
                                    }
                                    break;
                                case "3":
                                    d.searchResult(d.search3());
                                    String add3 = d.addCart(d.restaurant());
                                    while(add3.equals("B")){
                                        add3 = d.addCart(d.restaurant());
                                    }
                                    String create3 = d.createOrder();
                                    if(create3.equals("C")){
                                        d.confirm();
                                    }
                                    break;
                            }
                            break;
                       case "5":
                            d.logout();
                            break OUT;
                    }
                    System.out.print("     Enter B To Go Back To The Main Page Or Enter E To Log Out: ");
                    back = s.next();
                    boolean check = false;
                    while (check == false){
                        if (back.equals("B") || back.equals("E")){
                            check = true;
                        }
                        else if(back.equals("b") || back.equals("e")){
                            System.out.print("     The Input Should be Uppercase: ");
                            back = s.next();
                        }
                        else{
                            System.out.print("     Enter B To Go Back To The Main Page Or Enter E To Log Out: ");
                            back = s.next();
                        }
                    }
                }while(back.equals("B"));
                d.logout();
                break;
            case "R":
                String signType = d.signUp();
                if (signType.equals("1")){
                    d.signCustomer();
                }
                if (signType.equals("2")){
                    username = d.signOwner();
                    OUT:
                    do{
                        String function = d.ownerPage(username);
                        switch(function){
                            case "1": 
                                String rest = d.manageRestaurant();
                                String manage = d.restaurantOwner(rest);
                                if (manage.equals("S")){
                                   d.suspend(rest);
                                }
                                else{
                                   d.update();
                                }
                                break;
                            case "2": 
                                d.manageOrder();
                                break;
                            case "3": 
                                d.manageCoupon();
                                break;
                            case "4": 
                                String searchType = d.search();
                                switch(searchType){
                                    case "1": 
                                        d.searchResult(d.search1());
                                        String add = d.addCart(d.restaurant());
                                        while(add.equals("B")){
                                            add = d.addCart(d.restaurant());
                                        }
                                        String create = d.createOrder();
                                        if(create.equals("C")){
                                            d.confirm();
                                        }
                                        break;
                                    case "2":
                                        d.searchResult(d.search2());
                                        String add2 = d.addCart(d.restaurant());
                                        while(add2.equals("B")){
                                            add = d.addCart(d.restaurant());
                                        }
                                        String create2 = d.createOrder();
                                        if(create2.equals("C")){
                                            d.confirm();
                                        }
                                        break;
                                    case "3":
                                        d.searchResult(d.search3());
                                        String add3 = d.addCart(d.restaurant());
                                        while(add3.equals("B")){
                                            add3 = d.addCart(d.restaurant());
                                        }
                                        String create3 = d.createOrder();
                                        if(create3.equals("C")){
                                            d.confirm();
                                        }
                                        break;
                                }
                                break;
                           case "5":
                                d.logout();
                                break OUT;
                        }
                        System.out.print("     Enter B To Go Back To The Main Page Or Enter E To Log Out: ");
                        back = s.next();
                        boolean check = false;
                        while (check == false){
                            if (back.equals("B") || back.equals("E")){
                                check = true;
                            }
                            else if(back.equals("b") || back.equals("e")){
                                System.out.print("     The Input Should be Uppercase: ");
                                back = s.next();
                            }
                            else{
                                System.out.print("     Enter B To Go Back To The Main Page Or Enter E To Log Out: ");
                                back = s.next();
                            }
                        }
                    }while(back.equals("B"));
                    d.logout();
                    break;
                }
            case "E":
                d.logout();
                break;    
    }
  }
}

