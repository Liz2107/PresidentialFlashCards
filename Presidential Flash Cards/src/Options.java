import java.util.ArrayList;
import java.util.Scanner;

public class Options
	{
		public static void optionOne()
			{
				int score = 0;
				for(int i = 0; i < Database.flashcards.size(); i ++)
					{
						System.out.println("What party was " + Database.flashcards.get(i).getName()+ " affiliated with? Type your answer on the next line.");
						Scanner userStringInput = new Scanner(System.in);
						String inputtedParty = userStringInput.nextLine();
						if(inputtedParty.equals(Database.flashcards.get(i).getParty()))
							{
								System.out.println("Nice Job!");
								score++;
								Database.flashcards.remove(Database.flashcards.get(i));
							}
						else
							{
								System.out.println("Not Quite... You'll get it next time!");
								System.out.println(Database.flashcards.get(i).getName() + " is actually a " + Database.flashcards.get(i).getParty() + ".");
								System.out.println("If you are finshed studying that President, type Y. Otherwise, hit Enter, and you will study it again.");
								Scanner userSInput = new Scanner(System.in);
								String studyAgain = userSInput.nextLine();
								if(studyAgain.equals("Y"))
									{
										Database.flashcards.remove(Database.flashcards.get(i));
										score++;
									}
							}
						
					}
				System.out.println("Congrats! You really must need a good grade on that test if you got to this point!");
				System.out.println("Your score was " + score + " out of 45!");
	
			}
		public static void optionTwo()
			{
				int score = 0;
				for(int i = 0; i < Database.flashcards.size(); i ++)
					{
						System.out.println("What years did " + Database.flashcards.get(i).getName()+ " serve? Type your answer on the next line.");
						Scanner userStringInput = new Scanner(System.in);
						String inputtedParty = userStringInput.nextLine();
						if(inputtedParty.equals(Database.flashcards.get(i).getYearsServed()))
							{
								System.out.println("Nice Job!");
								Database.flashcards.remove(Database.flashcards.get(i));
								score++;
							}
						else
							{
								System.out.println("Not Quite... You'll get it next time!");
								System.out.println(Database.flashcards.get(i).getName() + " served during the years " + Database.flashcards.get(i).getYearsServed() + ".");
								System.out.println("If you would like to override your answer as correct, type Y. Otherwise, hit Enter, and you will study it again.");
								Scanner userSInput = new Scanner(System.in);
								String studyAgain = userSInput.nextLine();
								if(studyAgain.equals("Y"))
									{
										Database.flashcards.remove(Database.flashcards.get(i));
										score++;
									}
							}
					}
				System.out.println("Congrats! You are a super genius!");
				System.out.println("Your score was " + score + " out of 45!");
			}
		public static void optionThree()
			{
				int score = 0;
				for(int i = 0; i < Database.flashcards.size(); i ++)
					{
						System.out.println("Who was President number " + Database.flashcards.get(i).getPresidentialNumber() + " of the United States? Type your answer on the next line.");
						Scanner userStringInput = new Scanner(System.in);
						String inputtedParty = userStringInput.nextLine();
						if(inputtedParty.equals(Database.flashcards.get(i).getName()))
							{
								System.out.println("Nice Job!");
								Database.flashcards.remove(Database.flashcards.get(i));
								score++;
							}
						else
							{
								System.out.println("Not Quite... You'll get it next time!");
								System.out.println(Database.flashcards.get(i).getName() + " was actually President number " + Database.flashcards.get(i).getPresidentialNumber() + ".");
								System.out.println("If you would like to override your answer as correct, type Y. Otherwise, hit Enter, and you will study it again.");
								Scanner userSInput = new Scanner(System.in);
								String studyAgain = userSInput.nextLine();
								if(studyAgain.equals("Y"))
									{
										score++;
										Database.flashcards.remove(Database.flashcards.get(i));
									}
							}
					}
				System.out.println("Congrats! Your knowledge is really impressive.");
				System.out.println("Your score was " + score + " out of 45!");
			}
	}
