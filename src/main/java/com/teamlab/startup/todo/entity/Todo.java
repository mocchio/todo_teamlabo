package com.teamlab.startup.todo.entity;

import com.teamlab.startup.todo.form.TodoForm;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

/** Todo Entity */
@Data
@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;
    private LocalDate deadline;
    private boolean status;

    @CreationTimestamp private LocalDateTime createTime;
    @UpdateTimestamp private LocalDateTime updateTime;

    public static Todo of(TodoForm todoForm) {
        Todo todo = new Todo();
        todo.setTitle(todoForm.getTitle());
        todo.setDeadline(todoForm.getDeadline());
        return todo;
    }
}
