package Basics;

public class B_Hello {
	/*
	 * All methods must have unique names
	 * You cannot have a methods in a method
	 * // Always method names should be different
	 * To avoid confusion from which method to start from,
	 * //we use main method. (public static void main(String args[])
	 */
	public static void sayHello(){
		System.out.println("Hello");
	}
	public static void sayHello1(){
		System.out.println("Hello1");

		} 
	public static void main(String args[]){
		System.out.println("Hello World");
		sayHello();
		sayHello1();
	
	}

}
