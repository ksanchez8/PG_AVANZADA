package juego;

public class Personaje {
    private String nombre;
    private int nivel;
    private int puntosDeVida;
    private int puntosDeMana;

    public Personaje(String nombre, int nivel, int puntosDeVida, int puntosDeMana) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosDeVida = puntosDeVida;
        this.puntosDeMana = puntosDeMana;
    }

    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Nivel: " + nivel);
        System.out.println("Puntos de Vida: " + puntosDeVida);
        System.out.println("Puntos de Mana: " + puntosDeMana);
        System.out.println("---------------------");
    }

    




}