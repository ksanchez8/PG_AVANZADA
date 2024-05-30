package empleados;

public class EmpleadoAsalariado extends Empleado {

    public EmpleadoAsalariado(String nombre, double salario) {
        super(nombre, salario);
    }


    public double calcularSalario() {
        return salario; // Retorna el salario fijo
    }


    public void imprimirDetalles() {
        super.imprimirDetalles();
        System.out.println("Salario: " + calcularSalario());
    }
}