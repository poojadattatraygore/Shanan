package conditional_statement;

public class If_else_ladder {
public static void main(String[] args) {
	int mark =4;
	if(mark>=90) {
		System.out.println(" pass with 1st class");
	}
	else if(mark>=65){
		System.out.println("pass with distinction");
	}
	else if(mark>=50) {
		System.out.println("pass with 2nd class");
	}
	else if(mark>=40) {
		System.out.println("pass");
	}
	else if(mark>=35) {
		System.out.println(" pass 3rd class"); 
	}
	else {
		System.out.println("successfully fail");
	}
}
}
