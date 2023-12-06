package Controllers;

import Models.UsuarioModel;
import Support.DataBaseConnectionManager;
import Support.DataBaseException;

public class ConectionController {

    private String nomeSys;
    private String licenciado;
    private UsuarioModel user;
    private DataBaseConnectionManager dbcm;

    private static ConectionController conectionController = new ConectionController();

    public static ConectionController getInstance() {
        return conectionController;
    }

    private ConectionController() {
        this.nomeSys = "FlicksNPlay";
        this.licenciado = "Augusto Zeni e Vitor M. Brackmann";
        this.user = null;
        try {
            this.dbcm = new DataBaseConnectionManager(DataBaseConnectionManager.POSTGRESQL,
                    "flicks_n_play", "postgres", "postgres");
            this.dbcm.connectionTest();
        } catch (DataBaseException ex) {
            System.exit(0);
        }
    }

    public void setUser(UsuarioModel user) {
        this.user = user;
    }

    public String getNomeSistema() {
        return nomeSys;
    }

    public String getNomeLicenciado() {
        return licenciado;
    }

    public UsuarioModel getUser() {
        return user;
    }

    public DataBaseConnectionManager getDB() {
        return dbcm;
    }
}
