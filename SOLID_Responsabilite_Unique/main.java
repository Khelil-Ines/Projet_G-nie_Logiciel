package SOLID_Responsabilite_Unique;

public class Main {
    public static void main(String[] args) {
        Projet projet = new Projet(); 
        Equipe equipe = new Equipe();   

        Affectation affectation = new Affectation(); 
        affectation.assignerEquipe(projet, equipe); 
    }
}
