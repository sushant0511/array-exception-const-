import java.util.Scanner;

public class MenuBasedTest {

	public static void main(String[] args) {

			PrimeExample primeExample=new PrimeExample();
			FactorialE factorialE=new FactorialE();
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter your choice");
			System.out.println("1-->Prime");
			System.out.println("2-->fact");
			System.out.println("3-->exit");
			System.out.println("Enter your choice");
			int choice=scanner.nextInt();
			if(choice==1)
			{
			primeExample.testPrime();
			MenuBasedTest.main(args);
			}
			else if(choice==2)
			{
				factorialE.testFact();	
				MenuBasedTest.main(args);
			}
			else if(choice==3)
			{
			System.exit(1);	
			}
			
			else
			{
				MenuBasedTest.main(args);
			}
		
	}

}

class PrimeExample{    
	 public void testPrime(){    
	  int i,m=0,flag=0;   
	  Scanner scanner=new Scanner(System.in);
	  System.out.println("Enter Number to test Prime");
	  int n=scanner.nextInt();//it is the number to be checked    
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
class FactorialE{  
	 public void testFact(){  
	  int i,fact=1;  
	  Scanner scanner=new Scanner(System.in);
	  System.out.println("Enter Number to test factorial");
	  
	  int number=scanner.nextInt()
			  ;//It is the number to calculate factorial    
	  for(i=1;i<=number;i++){    
	      fact=fact*i;    
	  }    
	  System.out.println("Factorial of "+number+" is: "+fact);    
	 }  
	}