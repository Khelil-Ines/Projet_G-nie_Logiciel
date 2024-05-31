public abstract class User {
    protected String prenom;
    protected String nom;
    protected String email;
    protected String motDePasse;
    protected String URLimg;
    protected String statut;

    public User(String prenom, String nom, String email, String motDePasse, String URLimg, String statut) {
        this.prenom = prenom;
        this.nom = nom;
        this.email = email;
        this.motDePasse = motDePasse;
        this.URLimg = URLimg;
        this.statut = statut;
    }

    public void setAuthMethod() {
    }

    public void changeMdp(String newMdp) {
        this.motDePasse = newMdp;
    }

    public void modifierProfil() {
    }

}