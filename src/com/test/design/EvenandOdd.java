package com.test.design;

import java.util.Scanner;

public class EvenandOdd {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your number to test ");
		int num=scanner.nextInt();
		if(num%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("Odd");
		}

	}

}
