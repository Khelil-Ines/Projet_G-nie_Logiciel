package SOLID_Responsabilite_Unique;
import java.util.ArrayList;
import java.util.List;
public class Equipe {

    private String nomEquipe;
    private ChefEquipe chefEquipe;

    public Equipe(String nomEquipe, ChefEquipe chefEquipe) {
        this.nomEquipe = nomEquipe;
        this.chefEquipe = chefEquipe;
    }

    public String getNomEquipe() {
        return nomEquipe;
    }

    public void setNomEquipe(String nomEquipe) {
        this.nomEquipe = nomEquipe;
    }

    public ChefEquipe getChefEquipe() {
        return chefEquipe;
    }

    public void setChefEquipe(ChefEquipe chefEquipe) {
        this.chefEquipe = chefEquipe;
    }
}

