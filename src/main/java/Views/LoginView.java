package Views;

import Controllers.AuthenticatorController;
import Controllers.ConectionController;
import Controllers.UsuarioController;
import Models.UsuarioModel;
import java.util.ArrayList;

public class LoginView {

    public static void main(String[] args) {
        ConectionController conectionController = ConectionController.getInstance();

        UsuarioController usuarioController = new UsuarioController();
        ArrayList<UsuarioModel> users = usuarioController.readAll();

        AuthenticatorController auth = new AuthenticatorController(users);

        if (auth.showDialog(true)) {  
            conectionController.setUser(auth.getLoggedUser());
            DashboardView dashboardView = new DashboardView(auth.getCargoUser());
            dashboardView.setVisible(true);
        }
    }
}
