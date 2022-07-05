package com.testes.junit;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTest {

    @Test
    void deveValidarCalculoIdade() {
        Pessoa joao = new Pessoa("João", LocalDateTime.of(1999, 01, 12, 12, 0, 0));
        Assertions.assertEquals(23, joao.getIdade());
    }

    @Test
    void verificaSeEhMaiorDeIdade() {
        Pessoa joao = new Pessoa("João", LocalDateTime.of(1999, 01, 12, 12, 0, 0));
        Assertions.assertTrue(joao.maiorDeIdade());

        Pessoa izabel = new Pessoa("Izabel", LocalDateTime.now());
        Assertions.assertFalse(izabel.maiorDeIdade());
    }
}
