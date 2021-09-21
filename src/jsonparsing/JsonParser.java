package jsonparsing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import com.example.Comment;
import com.example.Comment_;
import com.example.Example;
import com.example.Fields;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonParser {
	
	 public static void main(String[] args) {
			try {
				byte[] jsonData = Files.readAllBytes(Paths.get("C:\\myworkspace\\CommentsParsing\\src\\responsejson\\comments.json"));
				ObjectMapper mapper = new ObjectMapper();
				Example example = mapper.readValue(jsonData, Example.class);
				Fields fields = example.getFields();
				Comment comment = fields.getComment();
				List<Comment_> comments = comment.getComments();
				
				for(Comment_ comm: comments) {
					String myComment = comm.getBody();
					if(myComment.equalsIgnoreCase("updating the comments for issue")) {
						System.out.println(myComment);
						System.out.println("test case is passed");
						break;
					}else {
						System.err.println("test case is failed");
					}
					
				}
				
				
				
			
			
			
			
			
			
			} catch (IOException e) {
				e.printStackTrace();
			}

	}

}
