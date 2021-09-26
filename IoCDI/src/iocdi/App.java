package iocdi;

/**
 * @author Miguel Ángel Sixtega Escribano
 */
public class App {

    public static void main(String[] args) {
        UsuarioFactory obj = new UsuarioFactory(new UsuarioImplOracle());
        // UsuarioFactory obj = new UsuarioFactory(new UsuarioImplMongo());
        obj.getInsertaUsuario(5);
        obj.getEliminaUsuarioByID(5);
    }
}
