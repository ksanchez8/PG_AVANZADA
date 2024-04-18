package calculadora;

import java.util.Scanner;

class teclado
{
    public static String leer(String texto){
        Scanner input = new Scanner(System.in);
        pantalla.escribir(texto);

        String result = input.nextLine();

        return result;
    }

}