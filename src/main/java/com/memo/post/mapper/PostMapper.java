package com.memo.post.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.memo.post.domain.Post;

@Mapper
public interface PostMapper {
	
	public List<Map<String, Object>> selectPostListTest();
	
	public List<Post> selectPostListByUserId(int userId);
	
	public Post insertPost(
			@Param("subject") String subject, 
			@Param("content") String content, 
			@Param("file") String file);
	
}
