package com.teamlab.startup.todo.service;

import com.teamlab.startup.todo.entity.Todo;
import com.teamlab.startup.todo.form.TodoForm;
import com.teamlab.startup.todo.repository.TodoRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/** Todo Service */
@Service
@Transactional
@RequiredArgsConstructor
public class TodoService {
    private final TodoRepository todoRepository;

    /**
     * Todo情報を全件取得する
     *
     * @return Todo情報
     */
    public List<Todo> searchAllTodo() {
        return todoRepository.findAll();
    }

    /**
     * Todo情報を保存する
     *
     * @param todoForm
     */
    public void saveTodo(TodoForm todoForm) {
        todoRepository.save(Todo.of(todoForm));
    }

    /**
     * タイトルにキーワードを含むTodo情報を取得する
     *
     * @param title キーワード
     * @return Todo情報
     */
    public List<Todo> searchTodoByTitle(String title) {
        return todoRepository.findByTitleOrderByCreateTime(title);
    }
}
