/**
 * Descripció:

En aquest exercici de classe, tindràs l'oportunitat de posar a prova les teves habilitats de programació en Java mitjançant la implementació d'un arbre binari. Un arbre binari és una estructura de dades jeràrquica en què cada node té com a màxim dos fills, coneguts com a fill esquerre i fill dret. L'objectiu és que creïs una estructura d'arbre binari eficient i funcional utilitzant els principis de l'orientació a objectes.

Instruccions:

1. Crea una nova classe en Java per a la implementació de l'arbre binari.
2. Implementa constructors per a la creació de l'arbre binari.
3. Volem que les instancies d’arbre sapiguen quantes instancies coexisteixen a la vegada.
4. Volem poder fer servir dos tipus d’arbres, un d’enters i un altre de caracters.
5. No volem que hi hagi cap tipus d’ordenació, simplement volem que estigui balancejat, aixó vol dir que cada branca tingui la mateixa profunditat.
6. Crear una classe Principal que s’encarregui de fer les següents tasques:
A. Crear 2 Arbres d’enters de fondaria 5.
B. Mostrar quantes instancies existeixen d‘arbres.
C. Crear 2 Arbres de caràcters de fondaria 3.
D. Mostrar quantes instancies existeixen d’arbres.
E. Forçar al Garbage Collector.
F. Recorrer el primer arbre d’enters i mostrant els valors per pantalla, fent servir unica i exclusivament les branques dretes.
G. Recorrer el segon arbre d’enters i mostrant els valors per pantalla, fent servir unica i exclusivament les branques esquerres.
H. Tornar a mostrar quantes instancies existeixen.
I. Tornar a forçar al Garbage Collector.
J. Tornar a mostrar quantes instancies existeixen.
7. Opcional: Podries fer alguna forma de saber per pantalla que ha sigut eliminat per el Garbage Collector? Fes-ho.

Pistes:

    Recomanem començar amb la creació d'una classe per a representar els nodes de l'arbre binari. Cada node ha de tenir un valor i referències als seus fills esquerra i dret, i un enter en el que indiquem quina és la profunditat màxima dels seus fills.
    Utilitza constructors per a la inicialització dels nodes de l'arbre i mètodes addicionals per a la inserció, eliminació o recorregut de l'arbre.
    Sabrem que no hi ha cap fill cap un costat o un altre perquè aquest fill és igual a NULL.
    Les dades dels arbres no s’han de demanar a l’usuari, que ja estiguin al programa Principal.
    Un arbre té un node principal i d'aquí penjen els fills. Com atributs té el node (arrel) i la fondaria total.
 * 
 */

class TreeNode {
    int valor;
    TreeNode esquerra;
    TreeNode dreta;

    public TreeNode(int valor) {
        this.valor = valor;
        this.esquerra = null;
        this.dreta = null;
    }
}

class ArbreBinari {
    TreeNode arrel;
    int profunditat;

    public ArbreBinari(int profunditat) {
        this.profunditat = profunditat;
        this.arrel = null;
    }

    public void inserir(int valor) {
        if (arrel == null) {
            arrel = new TreeNode(valor);
            return;
        }
    inserirRecursivament(arrel, valor);
    }

    private void inserirRecursivament(TreeNode node, int valor) {
        if (node.esquerra == null) { 
            node.esquerra = new TreeNode(valor)

        } 
        
        else if (node.dreta == null) {
            node.dreta = new TreeNode(valor);
        }

        else {
            inserirRecursivament(node.esquerra, valor);
        }
    }

        public void recorrerBranquesDretes() {
        recorrerBranquesDretesRecursivament(arrel);
    }

     private void recorrerBranquesDretesRecursivament(TreeNode node) {

        
     }






}