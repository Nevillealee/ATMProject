import java.util.Scanner;

public class ATM {
	
	public static void main(String[] args) {

	//create object array to hold accounts 1-10
	Account[] actArray = new Account[10];

	Scanner input = new Scanner(System.in);
	
	//prompt user to enter id
	System.out.print("Enter an id: ");
	
	int idChoice = input.nextInt();
	int fail= 0;
	int menuChoice = 0;
	actArray[idChoice-1] = new Account(idChoice, 100);
	
	
	while (fail == 0 && menuChoice != 4) {
	//If correct id is entered enter loop 
	
	if(idChoice <= 10 && idChoice > 0){
		//create account with id and starting balance of 100.
		
		
		// print menu 
		System.out.println("Main Menu\n" + "1: check balance\n" + "2: withdraw\n" + "3: deposit\n" + "4: exit\n"+ "Enter a choice: ");
		
		//place user selection in menuChoice variable
		menuChoice = input.nextInt();
		
		//enter loop to modify or check accounts	
		
		switch (menuChoice) {
			
				case 1: System.out.println("\n" + "-------" +actArray[idChoice-1].getBalance()+"\n"); break;
				
				case 2: System.out.print("Enter amount to withdraw: ");
						double wAmt = input.nextInt();
						actArray[idChoice-1].withdraw(wAmt); break;
				
				case 3: System.out.print("Enter amount to deposit: ");
						double dAmt = input.nextInt();
						actArray[idChoice-1].deposit(dAmt); break;
			
			
		}
		
		
		//System.out.println(actArray[idChoice-1].getId());
		
	
		}
	
	else {
		System.out.print("Please enter a correct id");
		fail++;
		} 
	}
	
	
}
	


public static class Account{
	
	private int id =0;
	private double balance = 0;
	
	public Account(){
		
	}
	
	public Account(final int id, final double newBalance){
		
		this.id = id;
		balance = newBalance;
	}
	
	public double getBalance(){
		
		return balance;
	}
	
	public double withdraw(double n){
		
		balance -= n;
		return balance;
	
	}
	
	
	public double deposit(double k){
		
		balance += k;
        
        return balance;
		
		}
	
	public int getId(){
		return id;
	}
	
}


}