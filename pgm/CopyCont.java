package pgm;

public class CopyCont {
String bankname;
CopyCont()//default
{
	bankname="SBI";
}
CopyCont(CopyCont other)//copy 
{
	this.bankname=other.bankname;
}
void display()//method
{
	System.out.println(bankname);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
CopyCont a=new CopyCont();//object
a.display();
CopyCont b=new CopyCont(a);//copy

	}

}
