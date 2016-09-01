package Basics;

public class K_UnderstandingConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Uses:
		 * "if-else" condition: If a condition is met do something; else do something else.
		 */
		/*
		 * age<18: Not major;
		 * age>=18 and age<=30: Youth
		 * age>=30 and age<=40: middle age
		 * age>=41: old
		 */
		
		int age = 170;
		if(age<=18)
		{
			System.out.println("You are not a major.");
		}
		else if(age>18 && age<=30)
		{
			System.out.println("You are in your youthful years." );
		}
		else if(age>30 && age<=40)
		{
			System.out.println("You are in your middle age.");
		}
		else if(age>40 && age<=120)
		{
			System.out.println("You are older.");
		}
		else 
		{
			System.out.println("Invalid age. Enter(0-120 years).");
		}
		
		/*
		 * 
		 * Student Grades
		 */
		int marks = 79;
		if(marks >= 0 &&marks<=100){
			if(marks<60)
			{
				System.out.println("Your grade: F");
			}
			else if(marks>=60 && marks <=69)
			{
				System.out.println("Your grade: D");
			}
			else if(marks>=70 && marks <=79)
			{
				System.out.println("Your grade: C");
			}
			else if(marks>=80 && marks <=89){
				System.out.println("Your grade: B");
			}
			else if(marks>=90){
				System.out.println("Your grade: A");
			}
		}
		else
		{
			System.out.println("Please enter a valid marks(0-100).");
		}
	}

}
