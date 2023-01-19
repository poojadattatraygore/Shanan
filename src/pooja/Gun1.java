package pooja;

public class Gun1 {// BLC
	String gunName;
	int noofBullets;
	//constructor
	public Gun1 (String gunName,int noofBullets) {
		this.gunName=gunName;
		this.noofBullets=noofBullets;
		
	}
//non static method
	public void shoot() {
		for(int i=1;i<=noofBullets;i++) {
			System.out.println("deshkaw");
			
		}
	}
	
	
}
