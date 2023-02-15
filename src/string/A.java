package string;

public class A {
public static void main(String[] args) {
	String a="pooja";
	String s="gore";
	String d="shital";
	
	System.out.println(a.length());
	System.out.println(s.length());
	System.out.println(a.toUpperCase());
	System.out.println(s.toUpperCase());
	System.out.println(a.charAt(2));
	System.out.println(s.charAt(3));
	System.out.println(a.indexOf('a'));
	System.out.println(a.substring(3));
	System.out.println(a.contains("ja"));
	System.out.println(a.concat(s));// join two string
	System.out.println(a.equals(s));
	System.out.println(a.equalsIgnoreCase(s));
	System.out.println(a.startsWith("po"));
	System.out.println(s.endsWith("re"));
}
}
