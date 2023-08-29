package com.example.repository;

import java.util.List;

import com.example.entity.Todo;

public interface TodoRepository {
	
	void save(Todo todo);
	List<Todo> findAll();
	void update(Todo todo);
	void delete(int id);

}
