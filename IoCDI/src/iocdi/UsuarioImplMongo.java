package iocdi;

/**
 * @author Miguel Ángel Sixtega Escribano
 */
public class UsuarioImplMongo implements IUsuario {

    @Override
    public void insertaUsuario(int id) {
        System.out.println("Insertando usuario con Mongo :" + id);
    }

    @Override
    public void eliminaUsuarioByID(int id) {
        System.out.println("Eliminando usuario con Mongo :" + id);
    }
}
