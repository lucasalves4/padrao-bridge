package org.example;

public class Medio implements Proporcao{

    @Override
    public float tempoTrabalho() {
        return 6;
    }

    @Override
    public String proporcaoRisco() {
        return "médio";
    }
}
