
public class redditPosts {

	public String Post;
	public String Author;
	public int numComments;
	public int upVotes;
	
	

	redditPosts(String posts, String authors, int Num , int score){
		Post = posts;
		Author = authors;
		numComments = Num;
		upVotes = score;
	}
	
	public String toString() {
		String output = " ";
		
		output += "Author: " + Author + "\n";
		output += "Their Post: "+ Post + "\n";
		output += "Number of Comments:  " + numComments + "\n";
		output += "Number of upvotes:  " + upVotes + "\n";
		

		return output;
		
	}
}
