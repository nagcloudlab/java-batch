package com.example.service;

import com.example.model.Todo;

import java.util.List;

public interface TodoService {

    void addTodo(String title);

    void editTodo(int id, String title);

    void completeTodo(int id);

    void deleteTodo(int id);

    void clearCompleted();

    void completeAll();

    List<Todo> filterTodos(TodoFilter filter);

}
