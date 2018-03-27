
public class DataBotTester {

	
	public static void main ( String args[] ) {
		
		DataBot DB = new DataBot();
		DB.readPosts();
		DB.readNumComments();
		DB.readAuthors();
		DB.setPostObjects();
		DB.printOne(5);
		
		
		
	}
}
