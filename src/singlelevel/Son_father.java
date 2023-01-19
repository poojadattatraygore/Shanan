package singlelevel;

import Hirarchicle.Son1;
import constructor1.Parameterized;


public class Son_father {
public static void main(String[] args) {
	//create object
	
	Son s=new Son();
	s.bike();
	s.car();
	s.home();
	s.money();
	s.moblie();
	s.money1();
	
	
	Son1 b=new Son1();
	b.secBike();
	
Parameterized e=new Parameterized("tom",3);
e.call();

}
}
