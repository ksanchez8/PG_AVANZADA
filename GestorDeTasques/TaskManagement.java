import java.util.HashMap;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

class TaskManagement {
    private HashMap<String, ArrayList<Task>> lists;
    private HashMap<Integer, Task> tasks;
    private String filename;

    //Creación de constructor de TaskManagement
    public TaskManagement(String filename) {
        this.filename = filename;
        lists = new HashMap<>();
        tasks = new HashMap<>();
        loadTasksFromFile(); // Cargamos las tareas del archivo al iniciar el programa
    }

    //Metodo para cargar tareas desde un archivo
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
                // Verifica si la lista correspondiente al estado de la tarea ya existe en el HashMap
                if (!lists.containsKey(status)) {
                    lists.put(status, new ArrayList<>()); // Si no existe, inicialízala
                }
                // Agrega la tarea a la lista correspondiente al estado
                lists.get(status).add(task);
            }
        } catch (IOException e) {
            System.out.println("Error al cargar las tareas desde el archivo.");
        }
    }
    
    //Método para guardar tareas en un archivo
    private void saveTasksToFile() {
        try (FileWriter writer = new FileWriter(filename)) {
            for (Task task : tasks.values()) {
                writer.write(task.toFileString() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error al guardar las tareas en el archivo.");
        }
    }

    //Método para añadir tarea
    public void addTask(String name, String description, String deadline, String status) {
        Task task = new Task(name, description, deadline, status);
        // Verifica si la lista correspondiente al estado de la tarea ya existe
        if (!lists.containsKey(status)) {
            lists.put(status, new ArrayList<>()); // Si no existe, inicialízala
        }
        // Agrega la tarea a la lista
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
        // Verifica si la lista correspondiente al estado existe en el HashMap
        if (lists.containsKey(status)) {
            // Si la lista existe, itera sobre ella e imprime cada tarea
            for (Task task : lists.get(status)) {
                System.out.println(task);
            }
        } else {
            System.out.println("No hay tareas con el estado: " + status);
        }
    }
}

class Task {
    private static int numInstances = 0;
    private int id;
    private String name;
    private String description;
    private String deadline;
    private String status;

    public Task(String name, String description, String deadline, String status) {
        this.id = ++numInstances;
        this.name = name;
        this.description = description;
        this.deadline = deadline;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getDeadline() {
        return deadline;
    }

    public String getStatus() {
        return status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String toFileString() {
        return name + "," + description + "," + deadline + "," + status;
    }

    public String toString() {
        return "Id: " + id + ", Name: " + name + ", Description: " + description + ", Deadline: " + deadline + ", Status: " + status;
    }
}

class Main {
    public static void main(String[] args) {
        String filename = "tasks.txt"; // Nombre del archivo para guardar las tareas
        TaskManagement manager = new TaskManagement(filename);
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Añadir tarea");
            System.out.println("2. Modificar tarea");
            System.out.println("3. Eliminar tarea");
            System.out.println("4. Imprimir todas las tareas");
            System.out.println("5. Imprimir tareas por estado");
            System.out.println("6. Salir");
            System.out.print("Opción: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Ingrese el nombre de la tarea:");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    System.out.println("Ingrese la descripción de la tarea:");
                    String description = scanner.nextLine();
                    System.out.println("Ingrese la fecha límite de la tarea (YYYY-MM-DD):");
                    String deadline = scanner.nextLine();
                    System.out.println("Ingrese el estado de la tarea (Pendiente, En curso, Completada):");
                    String status = scanner.nextLine();
                    manager.addTask(name, description, deadline, status);
                    break;
                case 2:
                    System.out.println("Ingrese el ID de la tarea que desea modificar:");
                    int taskIdModify = scanner.nextInt();
                    System.out.println("Ingrese el nuevo nombre de la tarea:");
                    scanner.nextLine(); 
                    String newName = scanner.nextLine();
                    System.out.println("Ingrese la nueva descripción de la tarea:");
                    String newDescription = scanner.nextLine();
                    System.out.println("Ingrese la nueva fecha límite de la tarea (YYYY-MM-DD):");
                    String newDeadline = scanner.nextLine();
                    System.out.println("Ingrese el nuevo estado de la tarea (Pendiente, En curso, Completada):");
                    String newStatus = scanner.nextLine();
                    manager.modifyTask(taskIdModify, newName, newDescription, newDeadline, newStatus);
                    break;
                case 3:
                    System.out.println("Ingrese el ID de la tarea que desea eliminar:");
                    int taskIdDelete = scanner.nextInt();
                    manager.deleteTask(taskIdDelete);
                    break;
                case 4:
                    manager.printAllTasks();
                    break;
                case 5:
                    System.out.println("Ingrese el estado de las tareas que desea imprimir:");
                    scanner.nextLine();
                    String taskStatus = scanner.nextLine();
                    manager.printTasksByStatus(taskStatus);
                    break;
                    case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }
}