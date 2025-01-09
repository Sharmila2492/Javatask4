package task4;

import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		Scanner myObj= new Scanner(System.in);
		System.out.println("Enter the age:");
		int age =myObj.nextInt();
		if(age>60)
		{
			System.out.println("I am a senior citizen");
		}
		else 
		{
			System.out.println("I am still young");
		}
		

	}
   
}
/*Output:
Enter the age:
70
I am a senior citizen*/

