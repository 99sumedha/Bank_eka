import java.util.*;

public class Run {
    private static Scanner sc = new Scanner(System.in);

    private static List<Account> accounts = new ArrayList<Account>();

    private static void displayMenu(){
        System.out.println("1. Create Account");
        System.out.println("2. Login");

        int menuInput1 = sc.nextInt();

        if(menuInput1 == 1){
            createAccount();
        }else if(menuInput1 == 2) {
            login();
        }else{
            System.out.println("Invaid input");
            displayMenu();
        }




    }

    private static void createAccount(){
        System.out.println("Insert Name");
        String name = sc.next();

        System.out.println("pin");
        String pin = sc.next();

        Account a1 = new Account(name, pin);
        accounts.add(a1);

        displayMenu();

    }

    private static void login(){
        System.out.println("Insert Account Number :");
        int accNo = sc.nextInt();

        System.out.println("Pin :");
        String pin = sc.nextLine();
    }

    public static void main(String[] args) {
        displayMenu();
    }
}
