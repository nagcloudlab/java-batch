package com.example;

import java.util.List;

import com.example.entity.Todo;
import com.example.repository.JdbcTodoRepository;
import com.example.repository.TodoRepository;

public class Application {

	public static void main(String[] args) {

		TodoRepository todoRepository = new JdbcTodoRepository();
//		Todo todo=new Todo("learn life");
//		todoRepository.save(todo);

		List<Todo> todos = todoRepository.findAll();
		for (Todo todo : todos) {
			System.out.println(todo);
		}
		

//		Todo todo=new Todo();
//		todo.setId(1);
//		todo.setTitle("todo one");
//		todo.setCompleted(false);
//		
//		todoRepository.update(todo);

		todoRepository.delete(3);

	}

}
