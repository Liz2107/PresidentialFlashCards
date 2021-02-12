import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class StudyMachine
	{
		public static void main(String[] args)
			{
				greetUser();
				Scanner userIntegerInput = new Scanner(System.in);
				int studyMethod = userIntegerInput.nextInt();
				if(studyMethod == 1)
					{
						Database.createFlashcards();
						askDisplayList();
						askGameType();
					}
				else if(studyMethod == 2)
					{
						System.out.println("Create your own flashcards");
						//tester version- enable reading and writing to the text file
						CreateYourOwnCardTwo.CreateYourOwnCard();
						//CreateYourOwnCard.CreateYourOwnCard();
					}
				else
					{
						System.out.println("Try Again");
					}
				
				//Reading.readCards();
				//attempt to erase file using bookmarked tab
				/*StringBuffer buffer = new StringBuffer();
				String fileContents = buffer.toString();
				String old = "hi";
				String newStuff = " ";
				fileContents = fileContents(replaceAll(old, newStuff));
				*/
			}
		public static void greetUser()
			{
				System.out.println("Would you like to play the Presidential Game, or would you like to create your own flashcards?");
				System.out.println("1. Play the Presidential Game");
				System.out.println("2. Create your own flashcards");
				
				
			}
		public static void askGameType()
			{
				
				Scanner userIntInput = new Scanner(System.in);
				System.out.println("Do you have what it takes to complete the President's Challenge?");
				System.out.println("What type of challenge would you like to undertake?");
				System.out.println("1. Presidential Party Quiz");
				System.out.println("2. Presidential Years Challenge");
				System.out.println("3. Name that President Test");
				int userInput = userIntInput.nextInt();
				if(userInput == 1)
					{
						System.out.println("You have chosen option 1: The President Party Quiz. This is rather easy, so I'll be disappointed if you get a terrible score.");
						Options.optionOne();
					}
				else if(userInput == 2)
					{
						System.out.println("You have chosen option 2: The Presidential Years Challenge. This is nearly impossible to ace. Good luck.");	
						Options.optionTwo();
					}
				else if(userInput == 3)
					{
						System.out.println("You have chosen option 3: The Name that President Test. Good luck.");
						Options.optionThree();
					}
				else
					{
						System.out.println("Do you even know how to read? Let's try that again, shall we?");
						System.out.println("");
						askGameType();
					}
			}
		public static void askDisplayList()
			{
				System.out.println("Would you like to see the list of possible Presidents? If so, type Y; otherwise, hit Enter.");
				Scanner userStringInput = new Scanner(System.in);
				String userInput = userStringInput.nextLine();
				if(userInput.equals("Y"))
					{
						for(President p : Database.flashcards)
							{
								System.out.println(p.getName());
							}
						
					}
				System.out.println(" ");
			}
	}
