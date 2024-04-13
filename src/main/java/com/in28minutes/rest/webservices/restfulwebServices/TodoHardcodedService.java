package com.in28minutes.rest.webservices.restfulwebServices;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoHardcodedService {
	private List<Todo> todos = null;
	private int idCounter =0;
	
	public List<Todo> findAll(String username) {
		todos = new ArrayList<Todo>();
		idCounter =0;
		todos.add(new Todo(++idCounter, username, new Date(), "learn to Dance", false));
		todos.add(new Todo(++idCounter,username, new Date(), "learn to Drive", false));
		todos.add(new Todo(++idCounter, username, new Date(), "learn to Swim", false));
		todos.add(new Todo(++idCounter, username, new Date(), "learn to Cook", false));
		return todos;
	}
	public Todo deleteById(long id) {
		Todo todo = findById(id);
		if (todo == null) return null;
		if( todos.remove(todo)) {
			return todo;
		};
		return null;
	}
	public Todo findById(long id) {
		
	for(Todo todo: todos) {
		if(todo.getId() == id) {
			return todo;
		}
		
	}
	return null;
		
	}
	

}
