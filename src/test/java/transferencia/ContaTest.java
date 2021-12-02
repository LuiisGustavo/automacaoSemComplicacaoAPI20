package transferencia;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaTest {

    Cliente gustavo;
    Cliente bia;
    Conta contaGustavo;
    Conta contaBia;

    @BeforeEach
    void setUp() {
        gustavo = new Cliente("Gustavo","11111111111", "2222222");
        bia = new Cliente("Bia", "22222222222", "159357");

        contaGustavo = new Conta("0606", "123456", 2500.00, gustavo);
        contaBia = new Conta("0505","654321", 3500.00, bia);
    }

    @Test
    public void realizarTransacao(){

        contaGustavo.realizarTransferencia(1000.00, contaBia);

        assertEquals(1500.00, contaGustavo.getSaldo());
        assertEquals(4500.00, contaBia.getSaldo());

    }

    @Test
    public void validarTransferenciainvalida(){

        boolean resultado = contaGustavo.realizarTransferencia(3500.00, contaBia);

        assertFalse(resultado);
    }

    @Test
    public void validarProprietario(){
        assertEquals(gustavo, contaGustavo.getProprietario());
    }


}