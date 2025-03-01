package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Author;
import com.example.demo.service.AuthorService;

@RestController
@RequestMapping("/Author")
public class AuthorController {
	
	@Autowired
	AuthorService serve;
	
	@GetMapping("/Authors")
	public List<Author> fetchPatients() {
		List<Author> auth = serve.fetchAll();
		return auth;
	}
	@GetMapping("/findAuthor/{id}")
	public List<Author> fetchAuthorByid(@PathVariable String id) {
		List<Author> auth = serve.fetchById(id);
		return auth;
	}
	
	@PostMapping("/AddAuthor")
	public void addAuthor(Author auth) {
		serve.add(auth);
	}
	@PutMapping("/UpdateAuthor")
	public Author updateAuthor(@RequestBody Author author) {
		return serve.update(author);
	}

}
