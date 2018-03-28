import java.util.*;
import java.io.*;

public class DataBot {
	
	public String Greeting;
	public String BotName;
	public String [] posts = new String[6466];
	public int [] numComments = new int[6466];
	public String [] authors = new String[6466];
	public redditPosts RP[]= new redditPosts[6466];
	public String Comments1[] = new String[6466];
	public String Comments2[] = new String[6466];
	public String Comments3[] = new String[6466];
	
	Scanner fileReader = null; 
	
	DataBot(){
		BotName = "Data analyzer";
		Greeting = "Hello! i am a bot, my name is " + BotName + "\n";
		Greeting += "I was designed to conduct a surface level analaysis on a reddit dataset from a subreddit called TheDonald " + "\n";
				
	}

	
	// reads the reddit posts and stores them in array
	public void readPosts (){ 
	 
		int count = 0;
	 File filein = new File("redditPosts.txt");
	 String line;
	 
	 try {
		 fileReader = new Scanner(filein);
	 }
	 
	 catch (FileNotFoundException e){
			System.out.println("cannot open file for reading");
			System.exit(0);
		}
	 
	 while( fileReader.hasNext() ) {
	line = fileReader.nextLine();
	 posts[count] = line;
	 count++;
	 } 
	 
	}	 
	

	// reads the number of comments per post and stores them in array
	public void readNumComments() {
		int count = 0;
		 File filein = new File("numComments.txt");
		 int line = 0;
		 
		 try {
			 fileReader = new Scanner(filein);
		 }
		 
		 catch (FileNotFoundException e){
				System.out.println("cannot open file for reading");
				System.exit(0);
			}
		 
		 while( fileReader.hasNext() ) {
		line = fileReader.nextInt();
		 numComments[count] = line;
		 count++;
		 } 
		
	}
	
	

	// reads the author of each post and stores them in array
	public void readAuthors() {
		int count = 0;
		 File filein = new File("redditAuthors.txt");
		 String line;
		 
		 try {
			 fileReader = new Scanner(filein);
		 }
		 
		 catch (FileNotFoundException e){
				System.out.println("cannot open file for reading");
				System.exit(0);
			}
		 
		 while( fileReader.hasNext() ) {
		line = fileReader.nextLine();
		 authors[count] = line;
		 count++;
		 } 

	}
	
	
	
	// creates an array of post objects (Every post has its corresponding author, number of comments, and first 3 comments)
	public void setPostObjects(){

	
		for( int i = 1; i < posts.length-1; i++) {
			
			RP[i] = new redditPosts(posts[i] , authors[i], numComments[i] );
		}
	}

	// returns a post object at a specified index 
	public redditPosts getPostObject(int index) {
	
		
		return RP[index];
	}
	
	// prints a specific number of post objects
	public void printMultiplePostObject(int index) {
		
		for (int i = 0; i <index; i++) {
			System.out.println(RP[i].toString());
			
		}
		
		
	}

	// returns the post with the largest amount of comments
	public redditPosts LargestNumOfComments() {
		redditPosts largest = RP[0];
		System.out.println("The post with the largest amount of comments: ");
		System.out.println(RP[0].toString()); 
		return largest;
	}
	
	// Sorts the array of post objects from largest to smallest
	public void sortedObjects(){
	
	
	int temp = 0;
	redditPosts temporary = null;
	
	for( int x = 0; x < numComments.length-1 ; x++) 
	{
		for ( int y =0; y < numComments.length-2; y++) 
		{
			if(numComments[y]<numComments[y+1])
			{
			
			temp = numComments[y];
			temporary = RP[y];
			
			numComments[y] = numComments[y+1];
			RP[y] = RP[y+1];
			
						
			numComments[y+1] = temp;
			RP[y+1] = temporary;
}
	}
		}
	
	
	
}
	

	
	
	
}
