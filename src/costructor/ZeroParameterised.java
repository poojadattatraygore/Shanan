package costructor;

public class ZeroParameterised {//no main method
String projectName;
int noofproject;
public void m1() {
	for( int i=1;i<=noofproject; i++) {
		System.out.println("hi world");

	}
	
}
public static void main(String[] args) {
	

// create object
	 ZeroParameterised a=new  ZeroParameterised();
	 a.projectName="pooja";
	 a.noofproject=2;
	 a.m1();
}
}
