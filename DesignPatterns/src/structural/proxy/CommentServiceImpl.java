package structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class CommentServiceImpl implements  CommentService{
	
	private List<String> comments = new ArrayList<>();

	@Override
	public String getComments() {
		
		return comments.toString();
		
	}

	@Override
	public void postComment(String comment) {
		
		comments.add(comment);
		
	}
	
}
