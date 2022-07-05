package com.testes.junit;

import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;

// É possível importar todos os métodos, apenas os que deseja ou escreve-los no próprio código;

import static org.junit.jupiter.api.Assertions.*;
// import static org.junit.jupiter.api.Assertions.assertArrayEquals;
// import static org.junit.jupiter.api.Assertions.assertNotEquals;
// import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.junit.jupiter.api.Assertions.assertNull;
// import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AssertionsTest {

    @Test
    void verificarLancamentos(){

        int[] primeiroLamcamento = {10, 20, 30, 40, 50, 60};
        int[] segundoLancamento = {10, 20, 30, 40, 50, 60};

        assertArrayEquals(primeiroLamcamento, segundoLancamento);
        // assertNotEquals(primeiroLamcamento, segundoLancamento);
    }

    @Test
    void verificarObjetoNulo(){
        Pessoa pessoa = null;
        assertNull(pessoa);

        pessoa = new Pessoa("Lucas", LocalDateTime.now());
        assertNotNull(pessoa);
    }

    @Test
    void verificarNumerosDeTiposDiferentes(){
        double  valor = 5.0;
        double outroValor = 5.0;

        assertEquals(valor, outroValor);
    }
    
}
