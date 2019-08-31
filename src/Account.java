public class Account {
    static int accountCount;

    String name;
    int accNo;
    double balance;
    String pin;

    Account(String name, String pin){
        accountCount++;
        this.name = name;
        this.accNo = accountCount;

        System.out.println("Account created!");
        System.out.println("Account number is " + accountCount);
    }
}
