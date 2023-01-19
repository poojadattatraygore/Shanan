package pooja;

public class Komal {//static global variable 
	static int a=54;
	static int b=8;
	static float c=23.8f;
	int f=98;//NON static global variable
	int r=34;
	byte d=23;
	public static void main(String[] args) {//main method open
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
		Komal w= new Komal ();
		System.out.println(w.f);
System.out.println(w.r);
		System.out.println(w.d);
		
	}//main method close

}//static global variable inside the class body
