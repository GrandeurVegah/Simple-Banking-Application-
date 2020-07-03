class CurrentAccount extends Account  {


    public CurrentAccount(Double balance, String accountID ){
        numberOfChecksUsed = 0;
        //System.out.println(numberOfChecksUsed + "startng of with");
        this.balance = balance;
        this.accountID = accountID;
        System.out.println(balance + "startng of with");
        //System.out.println(accountID + "bank account");
        
    }

     boolean withdraw(double amount){
         while (this.balance - (amount + (amount * 0.01)) >= 0) {
             this.balance = this.balance - (amount * 0.01);
             
             return true;
         }
         return false;

    }
     boolean deposit(double amount){
        this.balance += amount - (amount*0.01);
         return true;

     }

     public void resetChecksUsed(int numberOfChecksUsed){
        System.out.println(numberOfChecksUsed);
        numberOfChecksUsed = 0;
        System.out.println(numberOfChecksUsed);
    }

    public boolean withdrawUsingCheck(double amount) {
        while (numberOfChecksUsed < 3) {
            if (balance - amount > -10) {
                balance -= amount;
                numberOfChecksUsed ++;
                return true;
                
            }
            
        }
        return false;
        
    }

     // christian mugwagwa


    public static void main(String[] args){
    CurrentAccount Grandeur = new CurrentAccount(1500.00, "Grandeur");
    //System.out.println(Grandeur.deposit(150));
    System.out.println(Grandeur.withdrawUsingCheck(25));
    System.out.println(Grandeur.withdrawUsingCheck(25));
    System.out.println(Grandeur.withdrawUsingCheck(25));
    System.out.println(Grandeur.withdrawUsingCheck(25));
    System.out.println(Grandeur.withdrawUsingCheck(25));
    Grandeur.resetChecksUsed(Grandeur.numberOfChecksUsed);
    System.out.println(Grandeur.withdrawUsingCheck(25));
    // something wrong with the reset checks 
    
    
}
    
}
        
