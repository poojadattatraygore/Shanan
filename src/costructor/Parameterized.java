package costructor;

public class Parameterized {
String colourname;
int red;
public Parameterized(String colourname,int red) {
	this.colourname=colourname;
	this.red=red;
	
}

public void show() {
	for(int i=1;i<=4;i++) {
		System.out.println("sky is red like rose");
		System.out.println("sky is like freedom");
	}
	
}
public static void main(String[] args) {
	// create object
	Parameterized s1=new Parameterized("red",4);
	//call
	s1.show();
}

}
