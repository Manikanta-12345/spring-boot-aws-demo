package com.myapps;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/vi/todo")
public class TodoController {

    static List<String> todoList;

    @GetMapping
    public List<String> getTodoList(){
        return  todoList == null ? new ArrayList<String>() : todoList;
    }
    @PostMapping(value = "/addtodo",consumes = MediaType.TEXT_PLAIN_VALUE)
    public String addTodo(@RequestBody String todo){
        if(todoList == null){
            todoList = new ArrayList<>();
        }
        todoList.add(todo);
        return todo;
    }

    @DeleteMapping(value = "/deletetodo",consumes = MediaType.TEXT_PLAIN_VALUE)
    public String deleteTodo(@RequestBody String todo){
        if(todoList == null){
            return "No todo with this name "+todo;
        }
        List<String> todoListNew = todoList.stream().filter(todoName->!todoName.equalsIgnoreCase(todo)).collect(Collectors.toList());
        this.todoList = todoListNew;
        return todo;
    }
}
