package com.tts.TechBlog.blogpost.repo;

import com.tts.TechBlog.blogpost.model.BlogPost;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BlogPostRepository extends CrudRepository<BlogPost, Long> {

//    @Query("SELECT s FROM BlogPost s WHERE s.BlogEntry LIKE %?1% OR s.Title LIKE %?1% OR s.Author LIKE %?1%")
//    public List<BlogPost> searchByKeyword(String keyword);
}
