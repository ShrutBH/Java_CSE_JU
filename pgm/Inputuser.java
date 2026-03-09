package pgm;
import java.util.Scanner;





public class Inputuser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);//declaring the input
System.out.println("Enter your name");

String name=sc.nextLine(); //used to read the string
System.out.println("Welcome"+name);
System.out.println("Enter the Age");
int age=sc.nextInt();
System.out.println("Age is"+age);
	}

}
