package br.com.prova;

public class Quadrado  extends Retangulo{
    
    public Quadrado(){
        super();
    }

    @Override
    public String toString() {
        return "Quadrado [cor=" + this.cor + ", lado1=" + super.getLado1() + ", lado2=" + super.getLado2() + "]";
    }
}
