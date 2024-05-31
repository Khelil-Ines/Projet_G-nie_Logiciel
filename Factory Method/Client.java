public class Client implements Utilisateur {

    @Override
    public void consulterProfil() {
        System.out.println("Consultation du profil Client.");
    }

    @Override
    public void modifierProfil() {
        System.out.println("Modification du profil Client.");
    }

    @Override
    public void consulterProjets() {
        System.out.println("Consultation des projets Client.");
    }

    @Override
    public void demanderConges() {
        System.out.println("Demande de congés Client.");
    }
}