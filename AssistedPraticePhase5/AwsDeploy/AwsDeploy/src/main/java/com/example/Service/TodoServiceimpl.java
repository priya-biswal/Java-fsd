package com.example.Service;

import java.util.List;

//import javax.management.AttributeNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Entites.Todo;
//import com.becoder.exception.ResourceNotFoundException;
import com.example.Repo.TodoRepo;

@Service
public class TodoServiceimpl implements TodoService{
	@Autowired
	private TodoRepo todoRepo;

	@Override
	public Todo saveTodo(Todo todo) {
		return todoRepo.save(todo);
	}

	@Override
	public List<Todo> getAllTodo() {
		return todoRepo.findAll();
	}

	@Override
	public Todo getByid(int id) {
		return todoRepo.findById(id).get();
		//.orElseThrow(() -> new AttributeNotFoundException("Todo id not foound with id=" + id));
	}

	@Override
	public void delete(int id) {
		Todo todo = todoRepo.findById(id).get();
		//.orElseThrow(() -> new AttributeNotFoundException("Todo id not foound with id=" + id));
		todoRepo.delete(todo);
	}

	@Override
	public Todo updatTodo(int id, Todo todo) {

		Todo oldTodo = todoRepo.findById(id).get();
		//.orElseThrow(() -> new AttributeNotFoundException("Todo id not foound with id=" + id));
		oldTodo.setTitle(todo.getTitle());
		oldTodo.setDescription(todo.getDescription());
		oldTodo.setStatus(todo.getStatus());
		oldTodo.setUsername(todo.getUsername());
		return todoRepo.save(oldTodo);
	}
	}

		



