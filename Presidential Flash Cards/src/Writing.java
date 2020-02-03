import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writing
	{
		public static void writeCards()
			{
				// The name of the file to open.
		        String fileName = "CreatedCardsDatabase";

		        try {
		            // Assume default encoding.
		            FileWriter fileWriter = new FileWriter(fileName, true);

		            // Always wrap FileWriter in BufferedWriter.
		            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

		            // Note that write() does not automatically
		            // append a newline character.
		            
		            
		            //make front and back static
		            bufferedWriter.write(CreateYourOwnCardTwo.front);
		            bufferedWriter.newLine();
		            bufferedWriter.write(CreateYourOwnCardTwo.back);
		            bufferedWriter.newLine();

		            // Always close files.
		            bufferedWriter.close();
		           
		        	}
		        
		        
		        catch(IOException ex) 
		        	{
		            System.out.println("Error writing to file '" + fileName + "'");
		            // Or we could just do this:
		            // ex.printStackTrace();
		        	}
			}
	}
