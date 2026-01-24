abstract class BankAccount{
    public double balance;
    
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
    abstract double get_balance();
    
    
    public void setBalance(double balance){
        this.balance=balance;
    }
    public double getBalance(){
        return this.balance;
    }
}

class SavingsAccount extends BankAccount{
    private double interest_rate;
    
    public void setInterest(double interest_rate){
        this.interest_rate=interest_rate;
    }
    public double getInterest(){
        return this.interest_rate;
    }
    
    public void deposit(double amount){
        System.out.println("Money is Deposited into the Account");
        balance+=amount;
    }
    public void withdraw(double amount){
        if (amount <= balance) {
            System.out.println("Money is Withdrawn from Savings Account");
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }
    
    public double get_balance(){
        double current_balance=balance*interest_rate/100;
        return current_balance+balance;
    }
}

class CurrentAccount extends BankAccount{
    private double overdraft_limit;
    
    public void setOverdraft(double overdraft_limit){
        this.overdraft_limit=overdraft_limit;
    }
    public double getOverdraft(){
        return this.overdraft_limit;
    }
    
    public void deposit(double amount){
        System.out.println("Money is Deposited into the Account");
        balance+=amount;
    }
    public void withdraw(double amount){
        if (balance - amount >= -overdraft_limit) {
            System.out.println("Money is Withdrawn from Current Account");
            balance -= amount;
        } else {
            System.out.println("Overdraft limit exceeded");
        }
    }
    public double get_balance(){
        return balance;
    }
}

public class BankDemo
{
	public static void main(String[] args) {
	    SavingsAccount sa = new SavingsAccount();
        sa.setBalance(10000);
        sa.setInterest(5);
        sa.deposit(2000);
        sa.withdraw(3000);
        System.out.println("Savings Account Balance (with interest): " + sa.get_balance());

        CurrentAccount ca = new CurrentAccount();
        ca.setBalance(5000);
        ca.setOverdraft(2000);
        ca.deposit(1000);
        ca.withdraw(4000);
        System.out.println("Current Account Balance: " + ca.get_balance());

	}
}
