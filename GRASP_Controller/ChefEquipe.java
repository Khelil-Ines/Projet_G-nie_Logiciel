package GRASP_Controller;

public class ChefEquipe extends Employe {
    private int idChef;
    private String nom;

    public ChefEquipe(int idChef, String nom) {
        this.idChef = idChef;
        this.nom = nom;
    }

    public int getIdChef() {
        return idChef;
    }

    public String getNom() {
        return nom;
    }
}
