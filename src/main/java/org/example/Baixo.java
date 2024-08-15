package org.example;

public class Baixo implements Proporcao{

    @Override
    public float tempoTrabalho() {
        return 8;
    }

    @Override
    public String proporcaoRisco() {
        return "baixo";
    }
}
