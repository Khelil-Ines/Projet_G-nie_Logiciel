package GRASP_Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        
        ChefEquipe chef1 = new ChefEquipe(1, "Chef A");
        ChefEquipe chef2 = new ChefEquipe(2, "Chef B");
        
        controller.ajouterChefEquipe(chef1);
        controller.ajouterChefEquipe(chef2);
        
        Equipe equipe1 = new Equipe(101, "Equipe Alpha");
        Equipe equipe2 = new Equipe(102, "Equipe Beta");
        
        controller.ajouterEquipe(equipe1);
        controller.ajouterEquipe(equipe2);
        
        UIObject ui = new UIObject(controller);
        
        ui.clickAssignerChef(101, 1); // Assigner Chef 1 à Equipe Alpha
        ui.clickAssignerChef(102, 2); // Assigner Chef 2 à Equipe Beta
        
        System.out.println("Equipe Alpha Chef: " + equipe1.getChefEquipe().getNom());
        System.out.println("Equipe Beta Chef: " + equipe2.getChefEquipe().getNom());
    }
}

