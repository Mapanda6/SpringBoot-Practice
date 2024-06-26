package com.in28minutes.rest.webservices.restfulwebServices;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


@CrossOrigin
@RestController
public class TodoResource {
	
	@Autowired
	private TodoHardcodedService todoService;
	
	@GetMapping("/user/{username}/todos")
	public List<Todo> getAllTodos(@PathVariable String username){
		return todoService.findAll(username);
		
	}
	@DeleteMapping("/user/{username}/todos/{id}")
	public List<Todo> deleteTodo(@PathVariable String username, @PathVariable long id){
		List<Todo> todo = todoService.deleteById(id);
		if(todo != null) {
			System.out.println(todo.toString());
		return todo;
		}
		return null;
		
	}
	
	@GetMapping("/user/{username}/todos/{id}")
	public Todo getTodo(@PathVariable String username, @PathVariable long id){
		return todoService.findById( id);
		
	}
	
	@PostMapping("/user/{username}/todos/{id}")
	public ResponseEntity<Void> createTodo(@PathVariable String username, @PathVariable long id, @RequestBody Todo todo){
		Todo createdTodo = todoService.save(todo);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(createdTodo.getId()).toUri();
		//Location
		return  ResponseEntity.created(uri).build();
		
	}
	
	@PutMapping("/user/{username}/todos/{id}")
	public ResponseEntity<Todo> updateTodo(@PathVariable String username, @PathVariable long id, @RequestBody Todo todo){
		return new ResponseEntity<Todo>(todoService.save(todo), HttpStatus.OK);
		
	}
}







