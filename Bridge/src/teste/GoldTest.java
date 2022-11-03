package teste;

import main.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoldTest {
    @Test
    void deveRetornarAssinaturaNovo() {
        novo type_client = new novo();
        Gold cliente = new Gold(1000.0f);
        cliente.setTipoCliente(type_client);
        assertEquals(1000.0f, cliente.calcularAssinatura(), 0.01f);
    }

    @Test
    void deveRetornarAssinaturaIntermediario() {
        intermediario type_client = new intermediario();
        Gold cliente = new Gold(1000.0f);
        cliente.setTipoCliente(type_client);
        assertEquals(842.5f, cliente.calcularAssinatura(), 0.01f);
    }

    @Test
    void deveRetornarAssinaturaAntigo() {
        antigo type_client = new antigo();
        Gold cliente = new Gold(1000.0f);
        cliente.setTipoCliente(type_client);
        assertEquals(685.0f, cliente.calcularAssinatura(), 0.01f);
    }
}