package com.teamlab.startup.todo.repository;

import com.teamlab.startup.todo.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/** Todo repository */
@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
    /**
     * タイトルにキーワードを含むTodo情報を取得する
     *
     * @param title キーワード
     * @return Todo情報
     */
    List<Todo> findByTitleOrderByCreateTime(String title);
}
