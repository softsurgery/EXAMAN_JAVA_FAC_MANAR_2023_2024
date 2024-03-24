public class Personne {
    private String nom;
    private String prenom;

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void modifierDetails(String nouveauNom){
        this.nom = nouveauNom;
    } 

    public void afficherDetails(){
        System.out.println(nom + " " + prenom);
    }

    @Override
    public String toString() {
        return "Personne [nom=" + nom + ", prenom=" + prenom + "]";
    }

}