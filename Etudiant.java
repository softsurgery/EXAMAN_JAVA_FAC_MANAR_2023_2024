public class Etudiant extends Personne {
    private float note;

    public Etudiant(String nom, String prenom, float note) {
        super(nom, prenom);
        this.note = note;
    }

    @Override
    public void afficherDetails(){
        System.out.println(super.getNom() + " " + super.getPrenom() + " note = " + note);
    }

    public float getNote() {
        return note;
    }

    public void setNote(float note) {
        this.note = note;
    }
}
