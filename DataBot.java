import java.util.*;

public class DataBot {
	
	public String Greeting;
	public String BotName;
	public String [] posts = new String[6466];
	public int [] numComments = new int[6466];
	public String [] authors = new String[6466];
	public redditPosts RP[]= new redditPosts[6466];
	Scanner fileReader = null; 
	
	DataBot(){
		BotName = "Data analyzer";
		Greeting = " ";
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
	
	// returns the post at a specified index
	public String getPost(int index) {	
		
	return posts[index];
}
	
	// reads the number of comments per post and stores them in array
	public void readNumComments() {
		int count = 0;
		 File filein = new File("numComments.txt");
		 int line;
		 
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
	
	// returns the number of comments of post at specified index
	public int getNumComment(int index) {	
			
	return numComments[index];
	
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
	
	// returns the author of a post at a specified index
	public String getAuthor(int index){
		
		return authors[index];
	}
	
	// creates an array of post objects (Every post has its corresponding author, number of comments, and first 5 comments)
	public void setPostObjects(){

	
		for( int i = 1; i < posts.length; i++) {
			
			RP[i] = new redditPosts(getPost(i),getAuthor(i),getNumComment(i) );
		}
	}

	// returns a post object at a specified index 
	public redditPosts getPostObject(int index) {
	
		
		return RP[index];
	}
	
	public void printOne(int index) {
		
		System.out.print(RP[index].toString());
	}
















}
