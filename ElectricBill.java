package GenA;

import java.util.Scanner;

public class ElectricBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of units");
int unit=sc.nextInt();
float bill;
if(unit<=100) 
{ // first condition
	bill= unit*5;
}
else if(unit<=200)// second Condition (from 101 - 200) Rs.7
{
	bill=(100*5)+(unit-100)*7;
}
else
{
	bill=(100*5)+(100*7)+(unit-200)*10;//third condition
}
System.out.println("The Total Electricity Bill is"+bill);
	}

}
