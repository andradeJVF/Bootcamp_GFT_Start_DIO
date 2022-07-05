package com.testes.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class CondicionaisTest {
    
    @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "usuario")
    void validarAlgoUsuario() {
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @DisabledIfEnvironmentVariable(named = "USER", matches = "root")
    void validarAlgoUsuario2() {
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @EnabledOnOs({OS.LINUX, OS.MAC})
    void validarAlgoUsuario3() {
        Assertions.assertEquals(10, 5 + 5);
    }

}
