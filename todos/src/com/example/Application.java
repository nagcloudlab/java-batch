package com.example;

import com.example.model.Todo;
import com.example.service.TodoFilter;
import com.example.service.TodoService;
import com.example.service.TodoServiceImpl;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        TodoService todoService = new TodoServiceImpl();
        todoService.addTodo("todo-1");
        todoService.addTodo("todo-2");
        todoService.addTodo("todo-3");

        todoService.completeTodo(2);
        todoService.deleteTodo(2);

        List<Todo> todos =
                todoService.filterTodos(TodoFilter.ALL);
        displayTodos(todos);

    }

    private static void displayTodos(List<Todo> todos) {
        for (Todo todo : todos) {
            System.out.println(todo);
        }
    }
}
