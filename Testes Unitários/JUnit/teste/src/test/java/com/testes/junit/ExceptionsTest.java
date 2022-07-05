package com.testes.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTest {

    @Test
    void testaValorDeTransferencia() {
        Conta contaOrigem = new Conta("12345678", 0);
        Conta contaDestino = new Conta("12345678", 100);

        TransferenciaContas transferenciaContas = new TransferenciaContas();

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> transferenciaContas.transfere(contaOrigem, contaDestino, -1));
    }

    @Test
    void testaValorDeTransferencia2() {
        Conta contaOrigem = new Conta("12345678", 0);
        Conta contaDestino = new Conta("12345678", 100);

        TransferenciaContas transferenciaContas = new TransferenciaContas();

        Assertions.assertDoesNotThrow(() -> transferenciaContas.transfere(contaOrigem, contaDestino, 29));
    }
}
