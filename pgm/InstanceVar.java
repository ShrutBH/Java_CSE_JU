package pgm;

public class InstanceVar {
	static int rollNo;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceVar GenA=new InstanceVar();
		InstanceVar GenB=new InstanceVar();
		GenA.rollNo=10;
		GenB.rollNo=20;
		System.out.println("Section A RollNo is"+GenA.rollNo);
	System.out.println("Section B RollNo is"+GenB.rollNo);	
	}

}
