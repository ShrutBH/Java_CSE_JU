package pgm;
//Multiple Object Reference
public class MultipleObj {
int i=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleObj m1=new MultipleObj();
		//MultipleObj m2=new MultipleObj();
		MultipleObj m2=m1;
		System.out.println(m2.i);
	}

}
