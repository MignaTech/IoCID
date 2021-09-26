package iocdi;

/**
 * @author Miguel Ángel Sixtega Escribano
 */
public class UsuarioFactory {

    IUsuario usr;

    public UsuarioFactory(IUsuario usr) {
        this.usr = usr;
    }

    public void getInsertaUsuario(int id) {
        usr.insertaUsuario(id);
    }

    public void getEliminaUsuarioByID(int id) {
        usr.eliminaUsuarioByID(id);
    }
}
