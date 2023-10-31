package Controllers;

import Models.UsuarioModel;
import br.univates.raiz.auth.JAuthenticator;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AuthenticatorController {

    private JAuthenticator tela;
    private ArrayList<? extends UsuarioModel> users;
    private UsuarioModel loggedUser;

    public AuthenticatorController(ArrayList<? extends UsuarioModel> users) {
        this.users = users;
        this.tela = new JAuthenticator(null, true);
        this.loggedUser = null;
    }

    public boolean showDialog(boolean withRepetition) {
        if (withRepetition) {
            boolean repeat = true;
            while (repeat) {
                repeat = false;
                showDialog();
                if (!tela.isCanceled() && !isRight()) {
                    JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos", "Autenticação", JOptionPane.ERROR_MESSAGE);
                    repeat = true;
                }
            }
        } else {
            showDialog();
        }
        return (this.loggedUser != null);
    }

    public void showDialog() {
        tela.setVisible(true);
    }

    public boolean isRight() {
        boolean ok = false;
        if (!tela.isCanceled()
                && !tela.getLogName().isEmpty()
                && !tela.getSenha().isEmpty()) {
            for (UsuarioModel user : users) {
                if (user.getNome().equals(tela.getLogName())) {
                    if (getHashCode(user.getSenha()).equals(AuthenticatorController.getHashCode(tela.getSenha()))) {
                        this.loggedUser = user;
                        ok = true;
                        break;
                    }
                }
            }
        }
        return ok;
    }

    public static String getHashCode(String senha) {
        return senha.hashCode() + "";
    }

    public String hashCode(String senha) {
        return senha.hashCode() + "";
    }

    public UsuarioModel getLoggedUser() {
        return loggedUser;
    }
    
    public boolean getCargoUser() {
        return Boolean.valueOf(this.loggedUser.isNvAcess());
    }
}
