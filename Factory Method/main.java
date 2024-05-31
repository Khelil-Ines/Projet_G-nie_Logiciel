public class Main {
    public static void main(String[] args) {
        UtilisateurFactory clientFactory = new ClientFactory();
        Utilisateur client = clientFactory.creerUtilisateur("Client");
        client.consulterProfil();
    }
}