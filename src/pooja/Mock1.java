package pooja;

public class Mock1 {// different class
	// global variable
	
	int b=12;
	static int g=234;
	
	
	
public static void main(String[]args) {
	
	// create object
	Mock2 a=new Mock2();
	a.k1();
	a.k2();
	
	Mock3.j1();
		Mock3.j2();
		// local variable
		 
		 int w=10;
		 System.out.println(w);
		 
		 System.out.println(g);
		 
		Mock1 h=new Mock1();
		System.out.println(h.b);
		
	}
}

