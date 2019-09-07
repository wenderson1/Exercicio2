package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import Entities.Comment;
import Entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow! this is awesome!!");
		Post p1 = new Post(sdf.parse("21/06/2018 13:05"),
				"Traveling to New Zeaaland" , "I'm going to visi this wonderful country!",12);
		
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1);
		
		Comment c3 = new Comment("Good night!");
		Comment c4 = new Comment("May the Force be with you");
		Post p2 = new Post(sdf.parse("28/07/2018 23:14"),
				"Good night guys" , "See you tomorrow",5);
		
		p1.addComment(c3);
		p1.addComment(c4);
		
		System.out.println(p2);

	}

}
