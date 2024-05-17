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
        } catch (IOException e) {
            System.out.println("Error al cargar las tareas desde el archivo.");
        }
    }

    private void saveTasksToFile() {
        try (FileWriter writer = new FileWriter(filename)) {
            for (Task task : tasks.values()) {
                writer.write(task.toFileString() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error al guardar las tareas en el archivo.");
        }
    }

    public void addTask(String name, String description, String deadline, String status) {
        Task task = new Task(name, description, deadline, status);
        lists.get(status).add(task);
        tasks.put(task.getId(), task);
        saveTasksToFile(); 
    }

    public void modifyTask(int taskId, String newName, String newDescription, String newDeadline, String newStatus) {
        Task task = tasks.get(taskId);
        if (task != null) {
        
            task.setName(newName);
            task.setDescription(newDescription);
            task.setDeadline(newDeadline);
            task.setStatus(newStatus);
            saveTasksToFile(); 
        } else {
            System.out.println("Tarea no encontrada.");
        }
    }

    public void deleteTask(int taskId) {
        Task task = tasks.remove(taskId);
        if (task != null) {
            lists.get(task.getStatus()).remove(task);
            saveTasksToFile(); 
        } else {
            System.out.println("Tarea no encontrada.");
        }
    }

    public void printAllTasks() {
        tasks.forEach((key, task) -> {
            System.out.println(task);
        });
    }

    public void printTasksByStatus(String status) {
        System.out.println("Tareas con estado: " + status);
        for (Task task : lists.get(status)) {
            System.out.println(task);
        }
    }
}



