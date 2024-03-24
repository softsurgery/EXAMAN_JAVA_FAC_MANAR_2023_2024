public class TestPersonnes {

    public static void afficherDetails(Personne p){
        System.out.println(p);
    }


    public static void main(String[] args) {
        Personne p = new Personne("John", "Midas");
        p.modifierDetails("Alice");
        afficherDetails(p);
        
        Employe em = new Employe("John", "Midas",5000f);
        em.modifierDetails("Alice");
        afficherDetails(em);
        
        Etudiant et = new Etudiant("John", "Midas",17.25f);
        et.modifierDetails("Alice");
        afficherDetails(et);
    }
}
