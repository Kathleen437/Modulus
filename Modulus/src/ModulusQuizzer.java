import java.util.Scanner;

public class ModulusQuizzer
	{
		private static int answerToMod;
		private static int userAnswerToMod;
		private static int userNumber;
		private static int numRight=0;
		private static int mod1= (int) (Math.random()*20);
		private static int mod2= (int) (Math.random()*20);
		private static boolean gamecontinues=true;
		private static int majority;

		public static void main(String[] args)
			{
				explain();
				askNumQuestions();
				while(gamecontinues)
					{
						for(int i=0; i<userNumber; i++)
							{
								countNumRight();
								makeQuestion();
								getUserAnswer();
								checkAnswer();
								
								
							}
						exiting();
					}

			}
		
		public static void explain()
		{
			System.out.println("Learning Modulus");
			System.out.println();
			System.out.println("Modulus is like finding the remainder of a number.  e.g. 15 % 4 = 3");
			Scanner userOK = new Scanner(System.in);
			String OKAY = userOK.nextLine();
		}
			
		public static void askNumQuestions()
			{
				System.out.println("How many questions would you like?");
				Scanner userInput = new Scanner(System.in);
				userNumber = userInput.nextInt();
			}
		
		public static void exiting()
		{
			System.out.println("Fun Times we had.  Would you like to continue?");
			Scanner userPlay = new Scanner(System.in);
			String YON = userPlay.nextLine();
			YON.toLowerCase();
			if (YON.equals("no"))
				{
					gamecontinues=false;
					System.out.println("Okay then. Thanks for the visit.");
				}
			else if(YON.equals("yes"))
				{
					askNumQuestions();
				}
			
		}
			
		static void makeQuestion()
			{
				mod1= (int) (Math.random()*20+1);
				mod2= (int) (Math.random()*20+1);
				if(mod1>mod2)
					{
						answerToMod = mod1 % mod2;
						System.out.println(mod1+" % "+mod2);
					}
				else
					{
						makeQuestion();
					}
			}
		
		static void getUserAnswer()
		{
			System.out.println("Please input your answer.");
			Scanner userAnswer = new Scanner(System.in);
			userAnswerToMod = userAnswer.nextInt();
		}
		
		static void checkAnswer()
		{
			if(userAnswerToMod==answerToMod)
				{
					System.out.println("Good Job.");
					numRight++;
					System.out.println("Score "+ numRight);
					
				}
			else if(!(userAnswerToMod==answerToMod))
				{
					System.out.println("Wrong.  Moving on...");
					System.out.println("Score "+ numRight);
				}
		}
		
		static void countNumRight()
		{
			
			majority= userNumber-(userNumber/2);
			if((userNumber)==numRight)
				{
					System.exit(0);
				}
			if(numRight>=majority+(majority/2))
				{
					smallerNum();
				}
			else if(numRight>=majority-1)
				{
					{
						sameNum();
					}
				}
			
		}
		
		static void smallerNum()
		{
			int mod5= (int) (Math.random()*20+1);
			int mod6= (int) (Math.random()*20+1);
			if(mod5<mod6)
				{
					answerToMod = mod5 % mod6;
					System.out.println(mod5+" % "+mod6);
					getUserAnswer();
					checkAnswerOfSame();
					countNumRight();
				}
			else
				{
					smallerNum();
				}
		}
		
		static void sameNum()
		{
			int mod3= (int) (Math.random()*20+1);
			int mod4= (int) (Math.random()*20+1);
			if(mod3==mod4)
				{
					answerToMod = mod3 % mod4;
					System.out.println(mod3+" % "+mod4);
					getUserAnswer();
					checkAnswerOfSame();
					countNumRight();
				}
			else
				{
					sameNum();
				}
		}
		static void checkAnswerOfSame()
		{
			if(userAnswerToMod==answerToMod)
				{
					System.out.println("Good Job.");
					numRight++;
					System.out.println("Score "+ numRight);
					
					
				}
			else if(!(userAnswerToMod==answerToMod))
				{
					System.out.println("Wrong.  Moving on...");
					System.out.println("Score "+ numRight);
				}
		}
	}
