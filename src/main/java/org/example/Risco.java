package org.example;

public abstract class Risco {

    protected Proporcao proporcao;

    protected String tipo;

    public Risco(String tipo){
        this.tipo = tipo;
    }

    public void setProporcao(Proporcao proporcao) {
        this.proporcao = proporcao;
    }

    public void setNome(String tipo) {
        this.tipo = tipo;
    }

    public abstract String calcularTempoTrabalho();

}
