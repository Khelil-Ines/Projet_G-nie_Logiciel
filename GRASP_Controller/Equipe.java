package GRASP_Controller;

public class Equipe {
    private int idEquipe;
    private String nomEquipe;
    private ChefEquipe chefEquipe;

    public Equipe(int idEquipe, String nomEquipe) {
        this.idEquipe = idEquipe;
        this.nomEquipe = nomEquipe;
    }

    public int getIdEquipe() {
        return idEquipe;
    }

    public String getNomEquipe() {
        return nomEquipe;
    }

    public void ajouterEquipe() {
    }

    public void modifierEquipe() {
    }

    public void supprimerEquipe() {
    }
    
    public ChefEquipe getChefEquipe() {
        return chefEquipe;
    }

    public void definirChef(ChefEquipe chef) {
        this.chefEquipe = chef;
    }
}

