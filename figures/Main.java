package figures;

public class Main {
    public static void main(String[] args) {
        Figura2D cercle = new Cercle("Cercle", 5.0);
        Figura2D rectangle = new Rectangle("Rectangle", 4.0, 6.0);

        System.out.println("Figura: " + cercle.getNom());
        System.out.println("Àrea: " + cercle.calcularArea());
        System.out.println("Perímetre: " + cercle.calcularPerimetre());

        System.out.println();

        System.out.println("Figura: " + rectangle.getNom());
        System.out.println("Àrea: " + rectangle.calcularArea());
        System.out.println("Perímetre: " + rectangle.calcularPerimetre());
    }
    
}
