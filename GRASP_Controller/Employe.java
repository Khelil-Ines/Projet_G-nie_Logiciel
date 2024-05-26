package GRASP_Controller;

public class Employe {
    private int idEmploye;
    private String nom;

    public Employe(int idEmploye, String nom) {
        this.idEmploye = idEmploye;
        this.nom = nom;
    }

    public int getIdEmploye() {
        return idEmploye;
    }

    public String getNom() {
        return nom;
    }

    public void assignerAProjet() {
    }

    public void assignerAEquipe(Equipe equipe) {

    }
}

