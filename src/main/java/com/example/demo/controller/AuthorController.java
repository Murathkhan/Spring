package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Author;
import com.example.demo.service.AuthorService;

@RestController
public class AuthorController {
	
	@Autowired
	AuthorService serve;
	
	@GetMapping("/Author")
	public List<Author> fetchPatients() {
		List<Author> auth = serve.fetchAll();
		return auth;
	}
	@GetMapping("/Author/{id}")
	public List<Author> fetchAuthorByid(@PathVariable String id) {
		List<Author> auth = serve.fetchById(id);
		return auth;
	}

}
