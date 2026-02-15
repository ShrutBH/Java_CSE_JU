package pgm;

public class ATMOverloading 
{
String BankName;
ATMOverloading()//default
{
	BankName="BOI";
}
ATMOverloading(String a)//papr
{
	System.out.println(a);
}
ATMOverloading(String b,int c)//para
{
	System.out.println(b);
	System.out.println(c);
}
void display()
{
	System.out.println(BankName);
}
public static void main(String[] args)
{
	ATMOverloading ob=new ATMOverloading("ICICI");
	ATMOverloading d=new ATMOverloading("ABC",1000);
	ob.display();
}
}
