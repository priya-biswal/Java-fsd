package com.example.Service;

import java.util.List;
import com.example.Entites.Todo;

public interface TodoService {
	
public Todo saveTodo(Todo todo);

public List<Todo> getAllTodo();
public Todo getByid(int id);
public void delete(int id);
public Todo updatTodo(int id,Todo todo);
//public Object updateTodo(int id, Todo todo);
//Todo updateTodo(int id, Todo todo);
}
