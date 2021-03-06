package DI;

/**
 * @author Miguel Ángel Sixtega Escribano
 */
public class ServicioImpresion {

    ServicioEnvio servicioA;
    ServicioPDF servicioB;

    public ServicioImpresion(ServicioEnvio servicioA, ServicioPDF servicioB) {
        this.servicioA = servicioA;
        this.servicioB = servicioB;
    }

    public void imprimir() {
        servicioA.enviar();
        servicioB.pdf();
    }
}
