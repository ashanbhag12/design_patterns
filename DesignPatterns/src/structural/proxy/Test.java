package structural.proxy;


public class Test {
	
	public static void main(String[] args) {
		
		CommentService service = (CommentService) CommentServiceProxy.newInstance(new CommentServiceImpl());
		service.postComment("Test comment");
		service.getComments();
	}
}
