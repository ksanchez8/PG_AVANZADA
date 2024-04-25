/**
 * Creeu una classe anomenada ClasseA d’acord a la següent especificació. Els dos mètodes set… serveixen per llegir els valors emmagatzemats a cada atribut.


Afegiu tres constructors:

    public ClasseA(), que assigna els valors 5 i 10 als dos atributs, respectivament.
    public ClasseA(int vp), que assigna “vp” a “valorPrimari” i el valor 10 a “valorSecundari”.
    public ClasseA(int vp, int vs), que assigna “vp” i “vs” als dos atributs, respectivament.

Proveu que heu fet la classe correctament afegint el següent mètode main al codi i executant la classe.

    public static final void main (String[] args) {
        ClasseA a = new ClasseA();
        ClasseA b = new ClasseA(20);
        ClasseA c = new ClasseA(20, 40);
        System.out.println("L'objecte _a:_ conté: " + a.getPrimari() + ", " + a.getSecundari());
        System.out.println("L'objecte _b:_ conté: " + b.getPrimari() + ", " + b.getSecundari());
        System.out.println("L'objecte _c:_ conté: " + c.getPrimari() + ", " + c.getSecundari());
    }
 */

public class ClasseA {
    private int valorPrimari;
    private int valorSecundari;

    public ClasseA() {
        this.valorPrimari = 5;
        this.valorSecundari = 10;
    }

    public ClasseA(int vp) {
        this.valorPrimari = vp;
        this.valorSecundari = 10;
    }
 
    public ClasseA(int vp, int vs) {
        this.valorPrimari = vp;
        this.valorSecundari = vs;
    }

    public int getPrimari() {
        return this.valorPrimari;
    }

}

