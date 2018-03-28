
public class redditPosts {

	public String Post;
	public String Author;
	public int numComments;
	
	

	redditPosts(String posts, String authors, int Num){
		Post = posts;
		Author = authors;
		numComments = Num;
	}
	
	public String toString() {
		String output = " ";
		
		output += "Author: " + Author + "\n";
		output += "Their Post: "+ Post + "\n";
		output += "Number of Comments:  " + numComments + "\n";

		

		return output;
		
	}
}
