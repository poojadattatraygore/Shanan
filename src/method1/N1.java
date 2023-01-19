package method1;

public class N1 {//non static call from same class
public static void main(String[] args) {
	//create object
	
	N1 a=new N1();
	a.m1();
	a.m2();
}


public void m1() {
	System.out.println("how r u");
}
public void m2() {
	System.out.println("i am fine");
}

}
