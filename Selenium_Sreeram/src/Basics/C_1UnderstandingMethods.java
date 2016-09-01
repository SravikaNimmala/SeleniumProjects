package Basics;

public class C_1UnderstandingMethods {
	/*
	 * Creating Methods
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myFirstMethod();
		withParameters(200,300);
		sayHi("JaCk");
		System.out.println(Multiply(89,67));
 
	}
	public static void myFirstMethod(){
		int a = 100;
		int b = 500;
		System.out.println(a-b);
		
	}
	
	public static void withParameters(int a, int b){
		System.out.println(a+b);
	}
	
	public static void sayHi(String name){
		System.out.println("Hello "+name);
		
	}
	public static int Multiply(int c, int d){
		int m = c*d;
		return m;
	}
}
