import java.util.Scanner;
class Calculator
{
	public static void main(String[] args) 
	{
		Boolean flag=true;
		while(flag)
		{
			Scanner sc=new Scanner(System.in);
		    System.out.println("Addtion");
	        System.out.println("Subtraction");
		    System.out.println("Division");
		    System.out.println("Multiplication");
            System.out.println("Enter the case no");
			int opt=sc.nextInt();
		switch (opt)
		{
		case 1 :
			{
			System.out.println("Enter the 1st the number");
		    int a=sc.nextInt();
		    System.out.println("Enter the 2nd the number");
			int b=sc.nextInt();
			int result=a+b;
			System.out.println("Result is : "+result);
			}
			break;
		case 2 :
			{
			 System.out.println("Enter the 1st the number");
		     int a=sc.nextInt();
		     System.out.println("Enter the 2nd the number");
			 int b=sc.nextInt();
			 int result=a-b;
			 System.out.println("Result is : "+result);
			}
			break;
		case 3 :
			{
			 System.out.println("Enter the 1st the number");
		     double a=sc.nextDouble();
		     System.out.println("Enter the 2nd the number");
			 double b=sc.nextDouble();
			 double result=a/b;
			 System.out.println("Result is : "+result);
			}
			break;
		case 4 :
			{
			 System.out.println("Enter the 1st the number");
		     double a=sc.nextDouble();
		     System.out.println("Enter the 2nd the number");
			 double b=sc.nextDouble();
			 double result=a*b;
			 System.out.println("Result is : "+result);
			}
			break;
		case 5 :
			{
			  flag=false;
			  System.out.println("Thank you");
			}
			break;
			default:
			{
				System.out.println("Invalid option");
			}
		}
		}
	}
}

