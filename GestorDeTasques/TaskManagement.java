package taskmanegement;

import java.util.HashMap;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

class TaskManagement {
    private HashMap<String, ArrayList<Task>> lists;
    private HashMap<Integer, Task> tasks;
    private String filename;

    public TaskManagement(String filename) {
        this.filename = filename;
        lists = new HashMap<>();
        tasks = new HashMap<>();
        loadTasksFromFile(); // Cargamos las tareas del archivo al iniciar el programa
    }

    
    private void loadTasksFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[0];
                String description = parts[1];
                String deadline = parts[2];
                String status = parts[3];
                Task task = new Task(name, description, deadline, status);
                tasks.put(task.getId(), task);
                lists.get(status).add(task);
            }
        } 
    }