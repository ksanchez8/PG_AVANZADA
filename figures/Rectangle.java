package figures;


public class Rectangle extends Figura2D {
    private double amplada;
    private double altura;
    
    public Rectangle(String nom, double amplada, double altura) {
        super(nom);
        this.amplada = amplada;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return amplada * altura;
    }
    
    @Override
    public double calcularPerimetre() {
        return 2 * (amplada + altura);
    }
}