package SOLID_Responsabilite_Unique;

public class Projet {
    private String priorite;
    private String nomProjet;
    private String estimation;
    private String duree;
    private Client client;


    public Projet(String priorite, String nomProjet, String estimation, String duree) {
        this.priorite = priorite;
        this.nomProjet = nomProjet;
        this.estimation = estimation;
        this.duree = duree;
    }

    // Accesseurs et mutateurs pour les attributs de l'employé
    public String getpriorite() { return priorite; }
    public void setpriorite(String priorite) { this.priorite = priorite; }

    public String getnomProjet() { return nomProjet; }
    public void setnomProjet(String nomProjet) { this.nomProjet = nomProjet; }

    public String getestimation() { return estimation; }
    public void setestimation(String estimation) { this.estimation = estimation; }

    public String getduree() { return duree; }
    public void setduree(String duree) { this.duree = duree; }
    public Client getClient() {return client;}
    public void setClient(Client client) {this.client = client;}
}
