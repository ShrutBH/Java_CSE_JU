package pgm;

public class Enap 
{
	private double balance;
	
	public void deposit(double amount)
	{
		balance =balance+ amount;
	}
	public void withdraw(double amount)
	{
		balance=balance-amount;
	}
	private void checkbalance()
	{
		System.out.println("Balance"+balance);
	}
	
	public static void main(String[] args)
	{
		Enap e=new Enap();
		e.deposit(100);
		e.withdraw(100);
		e.checkbalance();
	}
}

