package empleados;

public class EmpleadoAsalariado extends Empleado {
    // Otros atributos y constructor

    @Override
    public double calcularSalario() {
        return salario; // Retorna el salario fijo
    }

    @Override
    public void imprimirDetalles() {
        super.imprimirDetalles();
        System.out.println("Salario: " + calcularSalario());
    }
}