package com.example.thymedive.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.thymedive.model.Post;
import com.example.thymedive.model.User;

@Service
public class PostServiceStub {
	private List<Post> posts = new ArrayList<Post>(){{ 
		add(new Post(1L, "First Post", "<p> line #1.</p><p>line #2</p>", null));
		add(new Post(2L, "Second Post", "Second post content:<ul><li> line #1.</li><li>line #2</li><ul>", new User(10L, "sdass", "Subra Dass")));
		add(new Post(3L, "post#3", "<p>The number 3 is better </p>", new User(15L, "merry", null)));
        add(new Post(4L, "Forth Post", "<p>Not interesting post</p>", null));
        add(new Post(5L, "Post Number 5", "<p>Just posting</p>", null));
        add(new Post(6L, "Sixth Post", "<p>Another interesting post</p>", null));
		
	}};


	public List<Post> findAll() {
        return this.posts;
    }
	
	public Post findById(Long id) {
		System.out.println("findById() . . . called");
        return this.posts.get(id.intValue());
    }
	
	
}
