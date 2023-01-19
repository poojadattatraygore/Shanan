package pooja;

public class Test1 {//non static regular method(call from same class)
	public static void main(String[] args) {
		//create object 
		Test1 a=new Test1();
	a.m1();
		a.m2();
		a.m3();
		a.m4();	
	}
public void m1() {
	System.out.println("hi pooja");
	System.out.println("i am from india");
}
	public void m2() {
		System.out.println("good day");
		System.out.println("have a nice day");	
	}
	
	public void m3() {
		System.out.println("pooja @1234");
		System.out.println("sweet dream");
	}
	
	public void m4() {
		System.out.println("take care");
		System.out.println("bye");
	}
	
	
}
