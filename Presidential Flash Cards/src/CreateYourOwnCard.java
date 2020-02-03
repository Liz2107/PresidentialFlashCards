import java.util.ArrayList;
import java.util.Scanner;

public class CreateYourOwnCard
	{
		static ArrayList<Card> createdCards = new ArrayList<Card>();
		static String newCard;
		
		public static void makeCard()
			{
				System.out.println("What would you like the front of the card (term) to say?");
				Scanner userStringInput = new Scanner(System.in);
				String front = userStringInput.nextLine();
				System.out.println("What would you like the back of the card (definition) to say?");
				Scanner userInput = new Scanner(System.in);
				String back = userInput.nextLine();
				createdCards.add(new Card(front, back));
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
								System.out.println("2. No (Cards will not be saved)");
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
										System.out.println("Well that was a waste of time! Have a good day!");
										creatingCards = false;
									}
							}
					}
			}
	}
