import java.util.Scanner;
import java.util.ArrayList;


public class ATM2{

public static void main(String[] args){
	
	
	//create nAccount object
	nAccount testA = new nAccount("George", 1122, 1000.00, 1.5);
	
	
	// make 3 deposits
	testA.deposit(30);
	testA.deposit(40);
	testA.deposit(50);
	
	//make 3 withdrawals
	testA.withdraw(5);
	testA.withdraw(4);
	testA.withdraw(3);
	
	
	
	System.out.println("\n" + testA.transactions.get(0).toString() + "\n");
	System.out.println(testA.transactions.get(1).toString() + "\n");
	System.out.println(testA.transactions.get(2).toString() + "\n");
	
	System.out.println(testA.transactions.get(3).toString() + "\n");
	System.out.println(testA.transactions.get(4).toString() + "\n");
	System.out.println(testA.transactions.get(5).toString() + "\n"); 
	

	}

}

//create Account class
class Account{
	
	//data fields
	 int id =0;
	 static double balance = 0;
	 
	
	//default contructor	
	public Account(){
		}
		
	//constructor with int,double parameters
	public Account(final int id, final double newBalance){
		
		this.id = id;
		balance = newBalance;
		}
		
	//method that returns account balance
	public double getBalance(){
		
		return balance;
		}
		
	//method that withdraws double parameter from balance
	public double withdraw(double n){
		
		balance -= n;
		return balance;
		}
		
	// method that deposits double parameter into account balance
	public double deposit(double k){
		
		balance += k;
        
        return balance;
		}
		
	//returns account id 
	public int getId(){
		return id;
	}
	
}

//create nAccount class
class nAccount extends Account {
	
	//data fields
	static String name;
	static double iRate;
	public ArrayList<Transaction> transactions = new ArrayList<>();
	
	nAccount(String name, int id, double balance, double iRate){
		
		this.name = name;
		this.id = id;
		this.balance = balance;
		this.iRate = iRate;
		}
	
	//overrides withdraw method in super class
	public double withdraw(double n){
		
		// updates balance & creates new Transaction type object that gets added to transactions ArrayList
		balance -= n;
		Transaction t1 = new Transaction('W', iRate, balance, name);
		transactions.add(t1);
		
		return balance; 
		}
	
	//overrides deposit method in super class
	public double deposit(double k){
		
		// updates balance & creates new Transaction type object that gets added to transactions ArrayList
		balance += k;
		Transaction t2 = new Transaction('D', nAccount.iRate, nAccount.balance, nAccount.name);
		transactions.add(t2);
        
        return balance;
		
		}
		
}

//create Transaction class
class Transaction {
	
	//data fields
	java.util.Date date;
	char type;
	double inRate;
	double balance;
	String description;
	
	//default constructor
	Transaction(){	
		}
	
	//constructor with char, double, double, String parameters for nAccount info to be held in Transaction object
	Transaction(char type, double inRate, double balance, String description){
		this.type = type;
		this.inRate = inRate;
		this.balance = balance;
		this.description = description;
		}
	
	// Method from Object parent class to return nAccount info as a formatted string 
	
	public String toString(){
		return "Type: " + type + "\nInterest Rate: " +  inRate + "\nbalance: " + balance + "\ndescription: " + description;
		}
	}
