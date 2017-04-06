package com.sdajava.excerciselambdas2;

import java.util.ArrayList;
import java.util.List;

import static com.sdajava.excerciselambdas2.Task.getTasks;

public class Main {

    public static void main(String[] args) {

        List<Task> tasks = getTasks();
        List<String> titles = taskTitles(tasks);
        titles.forEach(System.out::println);
        tasks.forEach(System.out::println);
    }

    public static List<String> taskTitles(List<Task> tasks){
        List<String> readingTitles = new ArrayList<>();
        for (Task task : tasks){
            if(task.getType() == TaskType.READING){
                readingTitles.add(task.getTitle());
            }
        }
        return readingTitles;
    }


}
