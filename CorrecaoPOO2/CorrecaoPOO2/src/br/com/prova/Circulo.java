package br.com.prova;

public class Circulo extends BaseFigura implements IComum {

    private Double raio;

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }
    
    public Circulo(String cor, Double raio) {
        super(cor);
        this.raio = raio;
    }

    public Circulo() {
        super();
    }

    @Override
    public double getArea() {
        return this.raio * 3.14 * 2;
    }

    @Override
    public String toString() {
        return "Circulo [cor=" + super.getCor() + ", raio=" + raio + "]";
    }

    
    
}
