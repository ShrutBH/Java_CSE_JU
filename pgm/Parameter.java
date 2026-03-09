package pgm;

public class Parameter {
	String bankname;
	int balance;
	Parameter()
	{
		String a=bankname;
		int b=balance;
		bankname="SBI";
	}
	
Parameter(String a)
{
	System.out.println(a);
}
Parameter(String a,int b)
{
	System.out.println(a);
	System.out.println(b);
}
void display()
{
	System.out.println(bankname);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parameter p1=new Parameter();
				Parameter p2=new Parameter("BOI");
		Parameter p3=new Parameter("ICICI",1000);
		p1.display();

	}

}
