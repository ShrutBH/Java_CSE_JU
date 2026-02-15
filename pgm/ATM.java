package pgm;

public class ATM
{
	String bankname;
	String Location;//variable
	int CashAvl;
	ATM()//default const
	{
		String a = bankname;//new
		Location="Bengaluru";
	}
	ATM(String a)//new Const
	{
		System.out.println(a);
	}
	void display()//method
	{
		System.out.println(bankname);
		System.out.println(Location);
	}
        public static void main(String[] args)
    {
       ATM m=new ATM();//object 
       ATM d=new ATM("SBI");
       m.display();
    }
}