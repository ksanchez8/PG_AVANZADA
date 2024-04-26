/**
 * Objectiu: L'objectiu d'aquest projecte és implementar el joc clàssic Pac-Man a Java utilitzant programació orientada a objectes. Aquest projecte permet als alumnes practicar conceptes de disseny de classes, maneig d'esdeveniments i lògica de programació.

Història del joc:
Pac-Man és un joc clàssic d'arcade en què el jugador controla un personatge groc anomenat Pac-Man, que s'ha de moure per un laberint recol·lectant boles mentre evita ser capturat per quatre fantasmes (Pinky, Inky, Blinky i Clyde). El laberint és ple de boles normals que Pac-Man pot recol·lectar per guanyar punts, així com boles especials que atorguen temporals per menjar fantasmes. A més, apareixen fruites periòdicament al laberint, que atorguen punts addicionals quan Pac-Man les recol·lecta.

Requisits del joc:

1.- Implementar les classes necessàries per representar els objectes del joc Pac-Man, incloent-hi:

- PacMan: Representa el personatge principal del joc.
        - Mètodes:
            - move(int newPosX, int newPosY): Mou Pac-Man a una nova posició al laberint.
            - pickupBola(): Recol·lecta una bola normal i augmenta la puntuació.
            - pickupBolaEspecial(): Recol·lecta una bola especial i atorga poder temporal a Pac-Man.
            - pickupFruita(): Recollita una fruita i augmenta la puntuació.
            - loseLife(): Disminueix una vida quan Pac-Man és capturat per un fantasma.
            - detectColisionFantasma(Fantasma fantasma): Verifica si Pac-Man col·lisiona amb un fantasma.
- Fantasma: Representa cadascun dels fantasmes (Pinky, Inky, Blinky i Clyde).
        - Mètodes:
            - move(int newPosX, int newPosY): Mou el fantasma a una nova posició al laberint.
            - Altres mètodes per canviar de direcció i gestionar el comportament del fantasma.
- Bola: Representa les boles normals que Pac-Man ha de recol·lectar.
- BolaEspecial: Representa les boles especials que atorguen poders temporals a Pac-Man.
- Fruita: Representa les fruites que apareixen periòdicament al laberint.
- Laberint: Representa l'estructura del laberint, incloent-hi els passadissos i les parets.
- Passadissos: Proporciona mètodes per verificar si una determinada posició és un passadís o una paret al laberint.
- CasaFantasmes: Representa la casa dels fantasmes, on aquests es reinicien després de ser menjats per Pac-Man.

2.- Implementar la lògica del joc, incloent el moviment de Pac-Man i els fantasmes, la recol·lecció de boles i boles especials, i la detecció de col·lisions.

3.- No cal incloure la part gràfica ni la captura d'esdeveniments de teclat en aquesta etapa del projecte.

Lliurables:

    Codi font complet del joc Pac-Man a Java.
    Diagrama de classes creada pels alumnes que mostri l'estructura i les relacions entre les classes del joc.
    Tot dins de GitHub amb l'últim codi.

Consideracions addicionals:
Es recomana seguir bones pràctiques de programació, com ara l'ús d'encapsulament.
El codi ha d'estar ben comentat i seguir convencions de nomenclatura clares.
Exploreu i experimenteu amb la implementació del joc, afegint-hi característiques addicionals si ho desitgeu.
 * 
 */

public class PacMan {
    private int posX;
    private int posY;
    private int vidas;
    private int puntuacions;
    private boolean poderTemporal;

    public PacMan (int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
        this.vidas = 3;
        this.puntuacion = 0;
        this.poderTemporal = false;
    }

    public void move(int newPosX, int newPosY) {
        //Moviment de PacMan
    }

    public void pickupBola(){
        //Recogida de bola normal
    }

    public void pickupBolaEspecial() {
        // Recogida de bola especial
    }

    public void pickupFruita() {
        // Recogida de fruta
    }
}