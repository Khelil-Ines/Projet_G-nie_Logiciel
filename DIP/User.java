public class User {
    private Long id;
    private String prenom;
    private String nom;
    private String email;
    private String motDePasse;
    private String URLimg;
    private String statut;

    public User(Long id, String prenom, String nom, String email, String motDePasse, String URLimg, String statut) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.email = email;
        this.motDePasse = motDePasse;
        this.URLimg = URLimg;
        this.statut = statut;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getURLimg() {
        return URLimg;
    }

    public void setURLimg(String URLimg) {
        this.URLimg = URLimg;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }
}
