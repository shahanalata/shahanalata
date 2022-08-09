package Java.Oops;

public class BankAccount {
	
	static double balance=0;                //static variable is share it's variable in every object
	
	public void deposit(double d) {
		balance = balance+d;
		System.out.println(balance);
		
	}
	public void withdraw(double w) {
		balance = balance-w;
		System.out.println(balance);
	}
	public static void getBall() {
		System.out.println("no need to creat object,call directly");
	
	}

	public static void main(String[] args) {
	   BankAccount ba= new BankAccount();
		ba.deposit(1000.00);
		ba.withdraw(300);
		ba. withdraw(300);
		ba.deposit(500);
		
		
		BankAccount day2=new BankAccount();
		day2.deposit(700); 
		//BankAccount.getBall(); 
		day2.withdraw(100);
		day2.deposit(500);

		
		BankAccount.getBall();
		

	}

}
