package com.example.JPA_practice.service;

import com.example.JPA_practice.model.Task;

import java.util.List;
import java.util.Optional;

public interface TaskService {
    List<Task> findAll();
    Optional<Task> findById(Long id);
    Task save(Task task);
    Task update(Long id, Task task);
    void delete(Long id);
}
