package com.teamlab.startup.todo.service;

import com.teamlab.startup.todo.entity.Todo;
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
}
