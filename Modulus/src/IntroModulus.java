import java.util.Scanner;

public class IntroModulus
	{

		public static void main(String[] args)
			{
				checkEvenOrOdd();
				checkLeapYear();
				printEveryThird();
				playFizzBuzz();

			}

		public static void checkEvenOrOdd()
		{
			Scanner userNum = new Scanner(System.in);
			System.out.println("Pick a number...i will tell you if it's even or odd.");
			int num = userNum.nextInt();
			if(num%2==0)
				{
					System.out.println("Even");
				}
			if(num%2==1)
				{
					System.out.println("Odd");
				}
			System.out.println();
		}
		
		public static void checkLeapYear()
		{
			Scanner userYear = new Scanner(System.in);
			System.out.println("Choose a year...I will tell you if it's a leap year.");
			int year = userYear.nextInt();
			if(year%4==0)
				{
					System.out.println("It's a leap year.");
				}
			if(!(year%4==0))
				{
					System.out.println("It's not a leap year.");
				}
			System.out.println();
		}
		
		public static void printEveryThird()
		{
			int [] third= {2,5,-7,1,3,12,19,-16,4,20};
			for (int i=0; i<third.length; i++)
				{
					if(i%3==0)
					System.out.println(third[i]);
				}
			System.out.println();
			}
		
		public static void playFizzBuzz()
		{
			for (int i=1; i<=100; i++)
				{
					System.out.println("Printout of FIZZBUZZ");
						{
							if(i%5==0&&i%3==0)
								{
								System.out.println("FizzBuzz");
								}
							else if(i%5==0)
								{
									System.out.println("Buzz");
								}
							else if(i%3==0)
								{
									System.out.println("Fizz");
								}
							else
								{
									System.out.println(i);	
								}
						}
					
				}
				
		}
	}
