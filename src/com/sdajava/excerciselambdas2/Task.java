package com.sdajava.excerciselambdas2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by RENT on 2017-04-06.
 */
public class Task {
    private String title;
    private String id;
    private TaskType type;

    public Task(String id, String title, TaskType type) {
        this.id = id;
        this.title = title;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public TaskType getType() {
        return type;
    }

    public void setType(TaskType type) {
        this.type = type;
    }
    public static List<Task> getTasks() {
        Task task1 = new Task("111", "A", TaskType.READING);
        Task task2 = new Task("222", "B", TaskType.NOTREADING);
        Task task3 = new Task("333", "C", TaskType.READING);
        Task task4 = new Task("444", "D", TaskType.NOTREADING);

        return Stream.of(task1, task2, task3, task4).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "Task: " +
                "id = " + id +
                ", title = " + title +
                ", type = " + type;
    }
}
