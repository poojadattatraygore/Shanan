package pooja;

public class Work123 {
//global variable
	int d=345;
	static int s=89;
	
	

	public static void main (String[]args) {
		//local variable
		int i;
		i=12;
		i=90;
		int a=34;
		System.out.println(i);
		System.out.println(a);
		
		//create object for non static global variable
		Work123 r=new Work123();
		System.out.println(r.d);
		System.out.println(s);
	}
}
