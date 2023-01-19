package costructor;

public class ZP1 {// USER LOGIC CLASS
	
	String flower;
	int nameofflower;
	public void show() {
		for(int i=1;i<= nameofflower;i++) {
			System.out.println("jerbera");
			System.out.println("lawender");
		}
	}
	
	
	
	
	public static void main(String[] args) {
		// create object
		ZP1 a=new ZP1() ;
		a.flower="rose";
		a.nameofflower=7;
		
	
		a.show();
			
		}
	}


