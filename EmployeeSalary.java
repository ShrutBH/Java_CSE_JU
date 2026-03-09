package GenA;

import java.util.Scanner;

public class EmployeeSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Basic Salary");
double basic=sc.nextDouble();
//check if salary is negative
if(basic<0)
{
	System.out.println("Salary is incorrect");
}
else
{
	double bonus=0;
	if(basic>50000)
	{
		bonus=basic*0.20;
	}
	else if(basic>=30000 && basic<=50000)
	{
		bonus=basic*0.10;
	}
	else
	{
		bonus=0;
	}
	double totalsalary=basic+bonus;
	System.out.println ("Bonus Rs."+bonus);
	System.out.println("Total Salary is Rs."+totalsalary);
}
	}

}
