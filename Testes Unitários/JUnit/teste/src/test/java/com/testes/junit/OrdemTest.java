package com.testes.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
//import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

// @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
// @TestMethodOrder(MethodOrderer.DisplayName.class)
// @TestMethodOrder(MethodOrderer.Random.class)
@TestMethodOrder(MethodOrderer.MethodName.class)
public class OrdemTest {

    // @Order(3)
    // @DisplayName("B")
    @Test
    void validaFluxoA() {
        Assertions.assertTrue(true);
    }

    // @Order(2)
    // @DisplayName("D")
    @Test
    void validaFluxoB() {
        Assertions.assertTrue(true);
    }

    // @Order(4)
    // @DisplayName("A")
    @Test
    void validaFluxoC() {
        Assertions.assertTrue(true);
    }

    // @Order(1)
    // @DisplayName("C")
    @Test
    void validaFluxoD() {
        Assertions.assertTrue(true);
    }
}
