package Basics;

public class L_UnderstandingLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * WHILE-Loop
		 * To do repeated tasks, we use while loop.
		 */
		int i = 0;
		while(i<=10){
			System.out.println(i);
			i++; // Incrementing i value by 1. 
		}
		
		/*
		 * FOR-loop:
		 * Initialization, condition, and incrementing
		 * 
		 */
		for(int j=0; j<=10; j++){
			System.out.println(j);
		}
		/*
		 * Print math table.
		 */
		int table = 9;
		int a =1;
		while(a<=10){
			System.out.println("5 x "+a+" = "+table*a);
			a++;
		}
		System.out.println("********************");
		for(int b=1; b<=10; b++){
			System.out.println("9 x "+b+" = "+table*b);
		}
	}

}
