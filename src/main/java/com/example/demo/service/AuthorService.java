package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.AuthorRepo;
import com.example.demo.model.Author;
@Service
public class AuthorService {
	
	@Autowired
	AuthorRepo repo;
	
	public List<Author> fetchAll(){
		return repo.findAll();
	}
	public List<Author> fetchById(String id) {

		return repo.findAll().stream().filter(patient -> id.equalsIgnoreCase(patient.getAuthId())).toList();
	}
	public void add(Author auth) {
		repo.save(auth);
		
	}
	
	public Author update(Author auth) {
		repo.findById(auth.getAuthId()).orElseThrow();
		return repo.save(auth);
	}
}
