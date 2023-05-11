package com.teamlab.startup.todo.controller;

import com.teamlab.startup.todo.form.TodoForm;
import com.teamlab.startup.todo.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/** Todo Contoller */
@Controller
@RequiredArgsConstructor
public class TodoController {

    private final TodoService todoService;
    /**
     * トップ画面を表示
     * @param model Model
     * @return 画面表示用HTMLパス
     */
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("todoList", todoService.searchAllTodo());
        return "index";
    }

    /**
     * TODO登録処理
     * @param todoForm 入力値
     * @return 画面表示用URL
     */
    @PostMapping("/register")
    public String register(TodoForm todoForm) {
        todoService.saveTodo(todoForm);
        return "redirect:/";
    }
}
