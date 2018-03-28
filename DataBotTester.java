import java.util.*;
public class DataBotTester {

	
	public static void main ( String args[] ) {
		int length = 6466;
		int choice;
		 int choice2;
		Scanner keyboard = new Scanner(System.in);
		
		DataBot DB = new DataBot();
		System.out.println(DB.Greeting);


		
		System.out.println("Reading and preparing dataset for analysis \n");
		DB.readPosts();
		DB.readNumComments();
		DB.readAuthors();
		DB.setPostObjects();
		DB.sortedObjects();
		
		
		
		System.out.println(" would you like to see the number of posts with most comments .. enter 1 for yes 2 for no");
		choice = keyboard.nextInt();	

		 if (choice == 1) {
			int num =0;
			System.out.println("Enter a number upto 500");
			num = keyboard.nextInt();
			DB.printMultiplePostObject(num);
		}
			 
		 
}
}
