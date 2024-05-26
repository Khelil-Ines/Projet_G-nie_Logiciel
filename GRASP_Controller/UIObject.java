package GRASP_Controller;

public class UIObject {
    private Controller controller;

    public UIObject(Controller controller) {
        this.controller = controller;
    }

    public void clickAssignerChef(int idEquipe, int idChef) {
        controller.assignerChef(idEquipe, idChef);
    }
}
