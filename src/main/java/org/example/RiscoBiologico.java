package org.example;

public class RiscoBiologico extends Risco{

    public RiscoBiologico(String tipo) {
        super(tipo);
    }

    @Override
    public String calcularTempoTrabalho() {
        float tempo = this.proporcao.tempoTrabalho();
        return "Esse ambiente possui o risco "+ tipo + " que tem o  grau de risco"+ this.proporcao.proporcaoRisco() +
                " e o tempo de trabalho não deve ultrapassar " + tempo + " horas.";
    }
}
