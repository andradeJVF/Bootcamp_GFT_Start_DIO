package com.testes.junit;

import java.time.LocalDateTime;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConsultaDadosTest {

    @BeforeAll
    static void configuraConexao() {
        BancoDeDados.iniciarConexao();
        // System.out.println("Rodou iniciarConexao");
    }

    @BeforeEach
    void insereDadosParaTeste() {
        BancoDeDados.insereDados(new Pessoa("João", LocalDateTime.of(1999, 01, 12, 16, 0, 0)));
    }

    @AfterEach
    void removeDadosDoTeste() {
        BancoDeDados.removeDados(new Pessoa("João", LocalDateTime.of(1999, 01, 12, 16, 0, 0)));
    }

    @Test
    void validaDadosDeRetorno() {
        Assertions.assertTrue(true);
    }

    @Test
    void validaDadosDeRetorno2() {
        Assertions.assertNull(null);
    }


    @AfterAll
    static void finalizaConexao() {
        BancoDeDados.finalizarConexao();
    }
}
