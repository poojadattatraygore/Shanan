package pooja;

public class Work {
	//global variable
	int k=7;
	static int e=34;
	
public static void main(String[] args) {
	int t=87;// local variable 
	System.out.println(t);
	
	System.out.println("Pooja Dattatray Gore");
	System.out.println("good morning");
	System.out.println("hello");
	
	// create object
	Work f=new Work();
	f.m2();
	System.out.println(e);
	System.out.println(f.k);
	m1();
}
//regular method
public static void m1() {
	System.out.println("variables");
	System.out.println("methods");
}
public void m2() {// non static regular method
	System.out.println("hiiii");
	System.out.println("1234");
	
}



}
