class SavingAccount extends Account {

    public SavingAccount(Double balance, String accountID ){
        this.balance = balance;
        this.accountID = accountID;
        
    }

    boolean withdraw(double amount) {
        while (this.balance - (amount + 3) >= 10) {
            this.balance = this.balance - (amount + 3);
            return true;
        }
        return false;

    }

    boolean deposit(double amount) {

        if (amount < 10) {

            return false;
        }

        if (amount > 1000) {

            this.balance += 10;
        }
        this.balance += amount;

    

        return true;
    }

    double addIntress(double rate) {
        double paid;

        paid = this.balance * rate/100;

        this.balance += paid;

        return paid;

        }

    



     public static void main(String[] args) {
    SavingAccount Grandeur = new SavingAccount(0.00, "Grandeur");
    System.out.println(Grandeur.deposit(100));
    //System.out.println(Grandeur.withdraw(137));
    System.out.println(Grandeur.addIntress(5));

      }

}