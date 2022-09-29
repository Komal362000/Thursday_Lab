/* Lab QUE1: Write a program to accept a number from user and then prints the sum of the even and odd integers.
 */

package Thusday_Lab;

import java.util.Scanner;

public class Qestion1_29 {

	public static void main(String[] args) 
	{
		int number,odd=0,even=0;
		char ans;
		Scanner sc=new Scanner(System.in);
	
		do
		{
			System.out.println("Enter number");
			number=sc.nextInt();
			if(number %2==0)
			{
				even=even+number;
			}else
				odd=odd+number;
		
		System.out.println("Do you want to Continue this process y/n");
		ans=sc.next().charAt(0);
	}
	while(ans=='Y'||ans=='y');

		
		System.out.println("Sumb off odd number is = "+even);
		System.out.println("sumb of even number is = "+odd);
	}

}
