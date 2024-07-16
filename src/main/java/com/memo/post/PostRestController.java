package com.memo.post;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.memo.post.bo.PostBO;
import com.memo.post.domain.Post;

@RequestMapping("/post")
@RestController
public class PostRestController {
	@Autowired
	private PostBO postBO;
	
	// 글 쓴 후 저장 하는 API
	@PostMapping("/create")
	public Map<String, Object> postCreate(
			@RequestParam("subject") String subject,
			@RequestParam(value = "content", required = false) String content,
			@RequestParam(value = "file", required = false) String file) {
		
		// DB insert
		Post post = postBO.addPost(subject, content, file);
		
		// 응답값
		Map<String, Object> result = new HashMap<>();
		result.put("code", 200);
		result.put("result", "성공");
		
		
		
		return result;
	}
	
	
	
}
