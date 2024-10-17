package com.example.JPA_practice.repository;

import com.example.JPA_practice.model.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long> {

}
