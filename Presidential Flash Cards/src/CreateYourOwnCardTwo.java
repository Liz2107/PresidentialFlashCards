import java.util.ArrayList;
import java.util.Scanner;

public class CreateYourOwnCardTwo
	{
		static ArrayList<Card> createdCards = new ArrayList<Card>();
		static String newCard;
		static String front;
		static String back;
		
		public static void ideas()
			{/*
			list of ideas:
			question = file ---------- ()
			flashcard.add(new Card(question, answer);
			
			take user input, put in text file with write program- want to use variables like question and answer(put directly into writer line)
			then when taking test, use stuff in text file, grab it with the read file- need to grab it in random order
			figure out how to grab specific lines maybe? maybe also random to shuffle them up? need a shuffle program
			maybe should create a duplicate file/project to test this on in case I don't finish
			*/}
		public static void makeCard()
			{
				System.out.println("What would you like the front of the card (term) to say?");
				Scanner userStringInput = new Scanner(System.in);
				front = userStringInput.nextLine();
				
				System.out.println("What would you like the back of the card (definition) to say?");
				Scanner userInput = new Scanner(System.in);
				back = userInput.nextLine();
				
				createdCards.add(new Card(front, back));
				Writing.writeCards();
				System.out.println("Would you like another card? Type Y or N.");
				Scanner answer = new Scanner(System.in);
				newCard = answer.nextLine();
			}
		public static void CreateYourOwnCard()
			{
				boolean creatingCards = true;
				while(creatingCards)
					{
						makeCard();
						if(newCard.equals("Y"))
							{
								makeCard();
							}
						else
							{	
								System.out.println("Would you like to study your cards?");
								System.out.println("1. Yes");
								System.out.println("2. No ");
								Scanner studyAgain = new Scanner(System.in);
								int study = studyAgain.nextInt();
								if(study == 1)
									{	
										System.out.println("You will be given a definition. Type the term below.");
										for(int i = 0; i < createdCards.size(); i++)
											{
												System.out.println(createdCards.get(i).getBack());
												Scanner t = new Scanner(System.in);
												String term = t.nextLine();
												//if it matches...
												if(term.equals(createdCards.get(i).getFront()))
													{
														System.out.println("Correct!");		
													}
												else
													{
														System.out.println("Incorrect. The actual term is " + createdCards.get(i).getFront());
													}
											}
										System.out.println("You studied everything! Nice job!");
										creatingCards = false;
									}
								else
									{
										System.out.println("Well that was a waste of time. Have a good day.");
										System.out.println("Remember, you can access your cards in the txt file on this program.");
										creatingCards = false;
									}
							}
					}
			}
	}
