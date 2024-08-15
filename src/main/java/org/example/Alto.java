package org.example;

public class Alto implements Proporcao{

    @Override
    public float tempoTrabalho() {
        return 4;
    }

    @Override
    public String proporcaoRisco() {
        return "alto";
    }
}
