package empleados;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de cada tipo de empleado
        EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("Juan", 0, 40, 10.5);
        EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("Pedro", 3000);
        EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision("Ana", 2000, 10000, 0.05);

        // Calcular y mostrar los salarios de cada empleado
        System.out.println("Detalles del empleado por horas:");
        empleadoPorHoras.imprimirDetalles();
        System.out.println("Salario: " + empleadoPorHoras.calcularSalario());

        System.out.println();

        System.out.println("Detalles del empleado asalariado:");
        empleadoAsalariado.imprimirDetalles();
        System.out.println("Salario: " + empleadoAsalariado.calcularSalario());

        System.out.println();

        System.out.println("Detalles del empleado por comisión:");
        empleadoPorComision.imprimirDetalles();
        System.out.println("Salario: " + empleadoPorComision.calcularSalario());
    }
}