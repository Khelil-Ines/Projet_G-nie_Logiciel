public class ClientFactory extends UtilisateurFactory {

    @Override
    public Utilisateur creerUtilisateur(String type) {
        if (type.equalsIgnoreCase("Client")) {
            return new Client();
        }
        return null;
    }
}