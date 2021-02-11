import java.util.ArrayList;
import java.util.Collections;

public class Database
	{
		static ArrayList<President> flashcards = new ArrayList<President>();
		public static void createFlashcards()
			{
				flashcards.add(new President("George Washington", 1, "1789-97", "Federalist"));
				flashcards.add(new President("John Adams", 2, "1797-1801", "Federalist"));
				flashcards.add(new President("Thomas Jefferson", 3, "1801-09", "Democratic-Republican"));
				flashcards.add(new President("James Madison", 4, "1809-17", "Democratic-Republican"));
				flashcards.add(new President("James Monroe", 5, "1817-25", "Democratic-Republican"));
				flashcards.add(new President("John Quincy Adams", 6, "1825-29", "Democratic-Republican"));
				flashcards.add(new President("Andrew Jackson", 7, "1829-37", "Democrat"));
				flashcards.add(new President("Martin Van Buren", 8, "1837-41", "Democrat"));
				flashcards.add(new President("William H. Harrison", 9, "1841", "Whig"));
				flashcards.add(new President("John Tyler", 10, "1841-45", "Whig"));
				flashcards.add(new President("James K. Polk", 11, "1845-49", "Democrat"));
				flashcards.add(new President("Zachary Taylor", 12, "1849-1850", "Whig"));
				flashcards.add(new President("Millard Fillmore", 13, "1850-53", "Whig"));
				flashcards.add(new President("Franklin Pierce", 14, "1853-57", "Democrat"));
				flashcards.add(new President("James Buchanan", 15, "1857-61", "Democrat"));
				flashcards.add(new President("Abraham Lincoln", 16, "1861-65", "Republican"));
				flashcards.add(new President("Andrew Johnson", 17, "1865-69", "Democrat"));
				flashcards.add(new President("Ulysses S. Grant", 18, "1869-77", "Republican"));
				flashcards.add(new President("Rutherford B. Hayes", 19, "1877-81", "Republican"));
				flashcards.add(new President("James A. Garfield", 20, "1881", "Republican"));
				flashcards.add(new President("Chester A. Arthur", 21, "18181-85", "Republican"));
				flashcards.add(new President("Grover Cleveland", 22, "1885-89", "Democrat"));
				flashcards.add(new President("Benjamin Harrison", 23, "1889-93", "Republican"));
				flashcards.add(new President("Grover Cleveland", 24, "1893-97", "Democrat"));
				flashcards.add(new President("William McKinley", 25, "1897-1901", "Republican"));
				flashcards.add(new President("Theodore Roosevelt", 26, "1901-09", "Republican"));
				flashcards.add(new President("William Howard Taft", 27, "1909-13", "Republican"));
				flashcards.add(new President("Woodrow Wilson", 28, "1913-21", "Democrat"));
				flashcards.add(new President("Warren G. Harding", 29, "1921-23", "Republican"));
				flashcards.add(new President("Calvin Coolidge", 30, "1923-29", "Republican"));
				flashcards.add(new President("Herbert Hoover", 31, "1929-33", "Republican"));
				flashcards.add(new President("Franklin Roosevelt", 32, "1933-45", "Democrat"));
				flashcards.add(new President("Harry S. Truman", 33, "1945-53", "Democrat"));
				flashcards.add(new President("Dwight Eisenhower", 34, "1953-61", "Republican"));
				flashcards.add(new President("John F. Kennedy", 35, "1961-63", "Democrat"));
				flashcards.add(new President("Lyndon B. Johnson", 36, "1963-69", "Democrat"));
				flashcards.add(new President("Richard M. Nixon", 37, "1969-74", "Republican"));
				flashcards.add(new President("Gerald R. Ford", 38, "1974-77", "Republican"));
				flashcards.add(new President("Jimmy Carter", 39, "1977-81", "Democrat"));
				flashcards.add(new President("Ronald Reagan", 40, "1981-89", "Republican"));
				flashcards.add(new President("George H.W. Bush", 41, "1989-93", "Republican"));
				flashcards.add(new President("Bill Clinton", 42, "1993-2001", "Democrat"));
				flashcards.add(new President("George W. Bush", 43, "2001-2009", "Republican"));
				flashcards.add(new President("Barack Obama", 44, "2009-2017", "Democrat"));
				flashcards.add(new President("Donald Trump", 45, "2017-", "Republican"));
				Collections.shuffle(flashcards);

			}
	}
