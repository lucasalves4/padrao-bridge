package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RiscoQuimicoTest {

    @Test
    void deveRetornarRiscoBaixo() {
        Proporcao proporcao = new Baixo();
        RiscoQuimico riscoQuimico = new RiscoQuimico("químico");
        riscoQuimico.setProporcao(proporcao);
        assertEquals("Esse ambiente possui o risco químico ,com o  grau de risco baixo e o tempo de trabalho " +
                "não deve ultrapassar 8.0 horas.", riscoQuimico.calcularTempoTrabalho());
    }

    @Test
    void deveRetornarRiscoMedio() {
        Proporcao proporcao = new Medio();
        RiscoQuimico riscoQuimico = new RiscoQuimico("químico");
        riscoQuimico.setProporcao(proporcao);
        assertEquals("Esse ambiente possui o risco químico ,com o  grau de risco médio e o tempo de trabalho " +
                "não deve ultrapassar 6.0 horas.", riscoQuimico.calcularTempoTrabalho());
    }

    @Test
    void deveRetornarRiscoAlto() {
        Proporcao proporcao = new Alto();
        RiscoQuimico riscoQuimico = new RiscoQuimico("químico");
        riscoQuimico.setProporcao(proporcao);
        assertEquals("Esse ambiente possui o risco químico ,com o  grau de risco alto e o tempo de trabalho " +
                "não deve ultrapassar 4.0 horas.", riscoQuimico.calcularTempoTrabalho());
    }

}