package empleados;

public class EmpleadoPorComision extends Empleado {
    private double ventasRealizadas;
    private double comisionPorVenta;

    public EmpleadoPorComision(String nombre, double salario, double ventasRealizadas, double comisionPorVenta) {
        super(nombre, salario);
        this.ventasRealizadas = ventasRealizadas;
        this.comisionPorVenta = comisionPorVenta;
    }

    @Override
    public void imprimirDetalles() {
        super.imprimirDetalles();
        System.out.println("Ventas realizadas: " + ventasRealizadas);
        System.out.println("Comisión por venta: " + comisionPorVenta);
    }

    public double calcularSalario() {
        return super.salario + (ventasRealizadas * comisionPorVenta);
    }
}