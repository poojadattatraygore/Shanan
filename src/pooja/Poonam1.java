package pooja;

public class Poonam1 {//non static method call from same class
	public static void main(String[] args) {
		Poonam1 a=new Poonam1();// create object
		a.m2();
		a.m3();
		
		
	}
	
	public void m2() {
		System.out.println("HELLO WORLD");
		System.out.println("METHOD IS BLOCK OF CODE");
	}
public void m3() {
	System.out.println("variable is small piece of memory");
	System.out.println("hello");
	
}
}
