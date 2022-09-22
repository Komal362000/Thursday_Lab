/*
Q1: Write a program to accept a number from the user and check if a given number is palindrome or not.
  Komal Mahale




logic
 123 so this is not palindrome
 n>0    n%10  rev=rev*10+r
 n       r      rev
 123             0
12      3       3
1       2       32
0       1       321



*/


package Thusday_Lab;

import java.util.Scanner;

public class Question_1 
{
	public static void main(String[] args) 
	{
    int num,r,rev=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	num=sc.nextInt();
	int number=num; //for store the number came from user
	while(num>0) //we take while because we want stop this loop when number is greater than 0 
	{
		r=num%10;   //r for remainder
		num=num/10;
		rev=rev*10+r;
	}
	if(number==rev) //we use ifelse for check the  number is equal to reverse number or not
	{
		System.out.println(" number is palindrome");
	}else
	{
		System.out.println(" number is Not palindrome");
	}
	
	
}
}