public class Employe extends Personne{
    private float salaire;

    public Employe(String nom, String prenom, float salaire) {
        super(nom, prenom);
        this.salaire = salaire;
    }

    @Override
    public void afficherDetails(){
        System.out.println(super.getNom() + " " + super.getPrenom() + " Salaire = " + salaire);
    }

    public float getSalaire() {
        return salaire;
    }

    public void setSalaire(float salaire) {
        this.salaire = salaire;
    }
}
