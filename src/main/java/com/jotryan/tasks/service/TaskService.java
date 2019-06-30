package com.jotryan.tasks.service;


import com.jotryan.tasks.domain.Task;

public interface TaskService {

    Iterable<Task> list();

    Task save(Task task);
}
