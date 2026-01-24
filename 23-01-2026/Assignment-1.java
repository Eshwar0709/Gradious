// WAP to create a bank account class with private variables, account number,
// account holder name, balance and the public methods deposite,
// withdrawl, getbalance, getAccountDetails.

class Bank{
    private String AccountNumber;
    private String HolderName;
    private double balance;
    
    Bank(String accNumber,String name,double amount){
        AccountNumber=accNumber;
        HolderName=name;
        balance=amount;
    }
    
    public void deposit(){
        System.out.println("Deposited");
    }
    public void withdraw(){
        System.out.println("Withdrawn");
    }
    public void getBalance(){
        System.out.println("Checked Balance");
    }
    public void accountDetails(){
        System.out.println("Account Number: "+AccountNumber+"\nAccount Holder Name: "+HolderName+"\nAccount Balance: "+balance);
    }
}
class Session1
{
	public static void main(String[] args) {
	    Bank b=new Bank("12345678","Eshwar",23456.97);
	    b.accountDetails();
	}
}
