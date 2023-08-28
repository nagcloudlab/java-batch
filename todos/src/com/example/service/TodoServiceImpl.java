package com.example.service;

import com.example.model.Todo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TodoServiceImpl implements TodoService {

    private static int nextId = 0;
    private List<Todo> todos = new ArrayList<>();

    @Override
    public void addTodo(String title) {
        nextId++;
        Todo todo = new Todo(title);
        todo.setId(nextId);
        this.todos.add(todo);
    }

    @Override
    public void editTodo(int id, String title) {
        for (Todo todo : todos) {
            if (todo.getId() == id) {
                todo.setTitle(title);
                break;
            }
        }
    }

    @Override
    public void completeTodo(int id) {
        for (Todo todo : todos) {
            if (todo.getId() == id) {
                todo.setCompleted(!todo.isCompleted());
                break;
            }
        }
    }

    @Override
    public void deleteTodo(int id) {
        Iterator<Todo> iterator = todos.iterator();
        while (iterator.hasNext()) {
            Todo todo = iterator.next();
            if (todo.getId() == id) {
                iterator.remove();
            }
        }
    }

    @Override
    public void clearCompleted() {
        Iterator<Todo> iterator = todos.iterator();
        while (iterator.hasNext()) {
            Todo todo = iterator.next();
            if (todo.isCompleted()) {
                iterator.remove();
            }
        }
    }

    @Override
    public void completeAll() {
        boolean areAllCompleted = true;
        for (Todo todo : todos) {
            if (!todo.isCompleted()) {
                areAllCompleted = false;
                break;
            }
        }
        for (Todo todo : todos) {
            todo.setCompleted(!areAllCompleted);
        }

    }

    @Override
    public List<Todo> filterTodos(TodoFilter filter) {
        if (filter == TodoFilter.ACTIVE) {
            List<Todo> todos = new ArrayList<>();
            for (Todo todo : this.todos) {
                if (!todo.isCompleted()) {
                    todos.add(todo);
                }
            }
            return todos;
        }
        if (filter == TodoFilter.COMPLETED) {
            List<Todo> todos = new ArrayList<>();
            for (Todo todo : todos) {
                if (todo.isCompleted()) {
                    todos.add(todo);
                }
            }
            return todos;
        }
        return this.todos;
    }
}
