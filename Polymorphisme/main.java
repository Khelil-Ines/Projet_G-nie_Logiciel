public class Main {
    public static void main(String[] args) {
        Client client = new Client("Montassar", "Jalloul", "test@test.com", "password123", "http://example.com/image.jpg", "Active");
        client.ajouterClient();
        client.consulterProfil();

        RH rh = new RH("TEST", "TEST", "test@example.com", "password123", "http://example.com/image.jpg", "Active");
        rh.gerer();
        rh.changeMdp("newpassword");


    }
}
