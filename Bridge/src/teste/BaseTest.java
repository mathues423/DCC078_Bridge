package teste;
import main.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BaseTest {
    @Test
    void deveRetornarAssinaturaNovo() {
        novo type_client = new novo();
        Base cliente = new Base(1000.0f);
        cliente.setTipoCliente(type_client);
        assertEquals(1000.0f, cliente.calcularAssinatura(), 0.01f);
    }

    @Test
    void deveRetornarAssinaturaIntermediario() {
        intermediario type_client = new intermediario();
        Base cliente = new Base(1000.0f);
        cliente.setTipoCliente(type_client);
        assertEquals(1000.0f, cliente.calcularAssinatura(), 0.01f);
    }

    @Test
    void deveRetornarAssinaturaAntigo() {
        antigo type_client = new antigo();
        Base cliente = new Base(1000.0f);
        cliente.setTipoCliente(type_client);
        assertEquals(1000.0f, cliente.calcularAssinatura(), 0.01f);
    }
}