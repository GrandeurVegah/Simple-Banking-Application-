
public abstract class Account {

    String accountID;
    double balance;
    double rate;
    int numberOfChecksUsed;

    abstract boolean withdraw(double amount);
    abstract boolean deposit(double amount);
    //abstract double addIntress(double rate);
// defult constructor that takes makes a plain account // needed 
    public Account(){
        System.out.println("Account was made");
    }

    public Account(String a, double b ){
        accountID = a;
        balance = b;
    }

    @Override
    public String toString(){
        String message = "Account:" + accountID + "," + "Balance =" + balance + "Intreast" + rate + "Number of checks"+ numberOfChecksUsed;
       return message; 


       

     }

    
}


