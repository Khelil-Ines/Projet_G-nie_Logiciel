package SOLID_Responsabilite_Unique;

public class Affectation {

    private Projet projet;
    private Equipe equipe;

    public void assignerEquipe(Projet projet, Equipe equipe) {
        this.projet = projet;
        this.equipe = equipe;
    }
}

