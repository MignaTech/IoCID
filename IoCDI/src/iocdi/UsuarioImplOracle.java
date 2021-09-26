package iocdi;

/**
 * @author Miguel Ángel Sixtega Escribano
 */
public class UsuarioImplOracle implements IUsuario {

    @Override
    public void insertaUsuario(int id) {
        System.out.println("Insertando usuario con Oracle :" + id);
    }

    @Override
    public void eliminaUsuarioByID(int id) {
        System.out.println("Eliminando usuario con Oracle :" + id);
    }
}
