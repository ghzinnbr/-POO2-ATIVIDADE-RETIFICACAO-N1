package br.com.prova;

public class Triangulo extends BaseFigura implements IComum {

    private Double base;

    private Double altura;

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Triangulo(String cor, Double base, Double altura) {
        super(cor);
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(){
        super();
    }

    @Override
    public String toString() {
        return "Triangulo [cor=" + super.getCor() + ", base=" + base + ", altura=" + altura + "]";
    }

    @Override
    public double getArea() {
       return this.base * this.altura;
    }

    
    
}
