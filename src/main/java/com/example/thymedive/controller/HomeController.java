package com.example.thymedive.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.thymedive.model.Post;
import com.example.thymedive.services.PostServiceStub;

@Controller
public class HomeController {
	
	@Autowired
	PostServiceStub postServiceStub;
	
	@RequestMapping("/")
	public String index(Model model) {
		System.out.println("root controller ...");
		model.addAttribute("allposts", postServiceStub.findAll());
		return "index";
	}

	
	@RequestMapping("/posts")
	public String getposts(Model model) {
		System.out.println("posts controller ...");
		// just thyme portion no backend
		List<Post> latest5Posts = postServiceStub.findAll();
		
		/* debug
		for (Post p : latest5Posts){
			System.out.println(p.toString());
		}
		*/
		model.addAttribute("allposts", latest5Posts);
				
		
		return "postlist";
	}
	
	@RequestMapping("/posts/view/{id}")
	public String singlePost(@PathVariable("id") Long id, Model model){
		Post post = postServiceStub.findById(--id);
		System.out.println("id=" + id + " post=" + post);
		model.addAttribute("thepost", post);
		return "onepost/oneview";
	}
}
