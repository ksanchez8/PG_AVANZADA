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