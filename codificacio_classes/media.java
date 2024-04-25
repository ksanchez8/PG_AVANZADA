package media;

public class Media {
    private String nom; 
    private String autor;
    private int duradaSegons;

    public Media() {
    }

    public Media(String nom, String autor, int duradaSegons) {
        this.nom = nom;
        this.autor = autor;
        this.duradaSegons = duradaSegons;
    }

    public String getNom() {
        return nom;
    }

    public String getAutor() {
        return autor;
    }

    public int getDurada() {
        return duradaSegons;
    }

    
    public void setNom(String n) {
        nom = n;
    }

    public void setAutor(String a) {
        autor = a;
    }

    public void setDurada(int d) {
        duradaSegons = d;
    }
}
