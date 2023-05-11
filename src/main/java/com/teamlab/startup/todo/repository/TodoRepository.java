package com.teamlab.startup.todo.repository;

import com.teamlab.startup.todo.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/** Todo repository */
@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
}
