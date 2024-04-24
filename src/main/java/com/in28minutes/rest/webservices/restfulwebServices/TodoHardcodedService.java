package com.in28minutes.rest.webservices.restfulwebServices;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoHardcodedService {
	private static List<Todo> todos = new ArrayList<Todo>();
	private static int idCounter =0;
	static {
		todos.add(new Todo(++idCounter, "Manisha", new Date(), "learn to Dance", false));
		todos.add(new Todo(++idCounter,"Manisha", new Date(), "learn to Drive", false));
		todos.add(new Todo(++idCounter, "Manisha", new Date(), "learn to Swim", false));
		todos.add(new Todo(++idCounter, "Manisha", new Date(), "learn to Cook", false));
	}
	
	public List<Todo> findAll(String username) {
		
		return todos;
	}
	public List<Todo> deleteById(long id) {
		Todo todo = findById(id);
		if (todo == null) return null;
		if( todos.remove(todo)) {
			return todos;
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
	
	public Todo save(Todo todo) {
		if(todo.getId()==-1 || todo.getId()==0) {
			todo.setId(++idCounter);
			todos.add(todo);
			
		}else {
			deleteById(todo.getId());
			todos.add(todo);
		}
		return todo;
		
	}
	

}
