package empleados;

public class EmpleadoPorHoras extends Empleado  {
    private int horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoPorHoras(String nombre, double salario, int horasTrabajadas, double tarifaPorHora) {
        super(nombre, salario);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public void imprimirDetalles() {
        super.imprimirDetalles();
        System.out.println("Horas trabajadas: " + horasTrabajadas);
        System.out.println("Tarifa por hora: " + tarifaPorHora);
    }

    public double calcularSalario() {
        return horasTrabajadas * tarifaPorHora;
    }
}
