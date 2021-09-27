package DI;

/**
 * @author Miguel Ángel Sixtega Escribano
 */
public class Principal {

    public static void main(String[] args) {
        ServicioImpresion miServicio = new ServicioImpresion(new ServicioEnvioAspecto(), new ServicioPDF());
        miServicio.imprimir();
    }

}
