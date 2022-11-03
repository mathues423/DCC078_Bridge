package teste;

import main.Silver;
import main.antigo;
import main.intermediario;
import main.novo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SilverTest {
    @Test
    void deveRetornarAssinaturaNovo() {
        novo type_client = new novo();
        Silver cliente = new Silver(1000.0f);
        cliente.setTipoCliente(type_client);
        assertEquals(1000.0f, cliente.calcularAssinatura(), 0.01f);
    }

    @Test
    void deveRetornarAssinaturaIntermediario() {
        intermediario type_client = new intermediario();
        Silver cliente = new Silver(1000.0f);
        cliente.setTipoCliente(type_client);
        assertEquals(850.0f, cliente.calcularAssinatura(), 0.01f);
    }

    @Test
    void deveRetornarAssinaturaAntigo() {
        antigo type_client = new antigo();
        Silver cliente = new Silver(1000.0f);
        cliente.setTipoCliente(type_client);
        assertEquals(700.0f, cliente.calcularAssinatura(), 0.01f);
    }
}