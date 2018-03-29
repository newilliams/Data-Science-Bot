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
		DB.readUpVotes();
		DB.setPostObjects();
		

		
		
		
		
		System.out.println(" Sorting the posts with most comment .. enter 1 for ascending or 2 for desending order");
		choice = keyboard.nextInt();

		 if (choice == 1) {
			int num  = 0;
		
			DB.sortedObjectsAscending();
			System.out.println("Enter a number from 0 - 500");
			num = keyboard.nextInt();
			if (num > 500) {
				System.out.println("Please enter a number from 0 - 500");
				num = keyboard.nextInt();		
			}
			DB.printMultiplePostObject(num);
		
		 } else if (choice == 2) {
			
		
		 int num1 = 0;
		DB.sortedObjectsDescending();
		 System.out.println("Enter a number from 0 - 500");
			num1 = keyboard.nextInt();
			if (num1 > 500) {
				System.out.println("Please enter a number from 0 - 500");
				num1 = keyboard.nextInt();		
			}
			DB.printMultiplePostObject(num1);
		
		 
}
	}
}
