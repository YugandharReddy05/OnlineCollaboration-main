package com.coll.OnlineCollaboration.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coll.OnlineCollaboration.dao.IBlogCommentsDao;
import com.coll.OnlineCollaboration.model.BlogComments;
import com.coll.OnlineCollaboration.service.IBlogCommentsService;

@Service
@Transactional
public class BlogCommentsServiceImpl implements IBlogCommentsService{

	@Autowired
	IBlogCommentsService blogCommentsService;
	
	@Override
	public List<BlogComments> getAllBlogComments() {
		return blogCommentsService.getAllBlogComments();
	}

	@Override
	public BlogComments getBlogCommentsById(int blogCommentId) {
		return blogCommentsService.getBlogCommentsById(blogCommentId);
	}

	@Override
	public boolean addBlogComments(BlogComments blogComments) {
		return blogCommentsService.addBlogComments(blogComments);
	}

	@Override
	public boolean updateBlogComments(BlogComments blogComments) {
		return blogCommentsService.updateBlogComments(blogComments);
	}

	@Override
	public boolean deleteBlogComments(BlogComments blogComments) {
		return blogCommentsService.deleteBlogComments(blogComments);
	}

	
}
