public class Employee extends User {
    private String nomEmployee;

    public Employee(String prenom, String nom, String email, String motDePasse, String URLimg, String statut, String nomEmployee) {
        super(prenom, nom, email, motDePasse, URLimg, statut);
        this.nomEmployee = nomEmployee;
    }

    public void assignerProjet() {
    }

    public void assignerEquipe() {
    }

    public void affecterListeEmploye() {
    }

    public void supprimerEmploye() {
    }

    public void ajouterEmploye() {
    }
}