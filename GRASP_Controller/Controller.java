package GRASP_Controller;

public class Controller {
    private List<Equipe> equipes;
    private List<ChefEquipe> chefs;

    public Controller() {
        equipes = new ArrayList<>();
        chefs = new ArrayList<>();
    }

    public void assignerChef(int idEquipe, int idChef) {
        Equipe equipe = trouverEquipe(idEquipe);
        ChefEquipe chef = trouverChef(idChef);
        if (equipe != null && chef != null) {
            equipe.definirChef(chef);
        }
    }

    private Equipe trouverEquipe(int idEquipe) {
        for (Equipe e : equipes) {
            if (e.getIdEquipe() == idEquipe) {
                return e;
            }
        }
        return null;
    }

    private ChefEquipe trouverChef(int idChef) {
        for (ChefEquipe c : chefs) {
            if (c.getIdChef() == idChef) {
                return c;
            }
        }
        return null;
    }

    public void ajouterEquipe(Equipe equipe) {
        equipes.add(equipe);
    }

    public void ajouterChefEquipe(ChefEquipe chef) {
        chefs.add(chef);
    }
}

