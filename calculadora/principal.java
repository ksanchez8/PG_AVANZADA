package calculadora;

class principal
{
    public static void main(String[] args){
        pantalla.escribir("Hola mundo");
        String variable = teclado.leer("Escribe");
        pantalla.escribir(variable);

    }
}