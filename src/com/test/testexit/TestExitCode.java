package com.test.testexit;

import java.util.Scanner;

public class TestExitCode {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your choice");
		int choice=scanner.nextInt();
		if(choice==1)
		{
			TestEven testEven=new TestEven();
			testEven.testEvenOdd();
		}
		else if(choice==2)
		{
			PrimeTest primeTest=new PrimeTest();
			primeTest.testPrime();
		}
	}

}
class TestEven
{
	
	public void testEvenOdd() {
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
class PrimeTest
{

	public void testPrime()
	{
		int i,m=0,flag=0;      
		  int n=3;//it is the number to be checked    
		  m=n/2;      
		  if(n==0||n==1){  
		   System.out.println(n+" is not prime number");      
		  }else{  
		   for(i=2;i<=m;i++){      
		    if(n%i==0){      
		     System.out.println(n+" is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  { System.out.println(n+" is prime number"); }  
		  }//end of else  
	}
}