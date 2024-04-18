package br.com.prova;

public abstract class BaseFigura {

    protected String cor;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public BaseFigura(String cor) {
        this.cor = cor;
    }

    public BaseFigura() {
    }
}
