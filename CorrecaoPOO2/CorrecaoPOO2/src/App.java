import br.com.prova.Circulo;
import br.com.prova.Quadrado;
import br.com.prova.Retangulo;
import br.com.prova.Triangulo;

public class App {
    public static void main(String[] args) throws Exception {

        Quadrado quadrado = new Quadrado();

        quadrado.setCor("Roxo");
        quadrado.setLado1(4);
        Triangulo triangulo = new Triangulo("Azul", 5.0, 12.0);
        Circulo circulo = new Circulo("Verde", 10.2);
        Retangulo retangulo = new Retangulo("Rosa", 32, 12);
        System.out.println(quadrado);
        System.out.println("Base do Quadrado: " + quadrado.getArea());
        System.out.println(triangulo);
        System.out.println("Base do Triangulo: " + triangulo.getArea());
        System.out.println(circulo);
        System.out.println("Base do Circulo: " + circulo.getArea());
        System.out.println(retangulo);
        System.out.println("Base do Retangulo: " + retangulo.getArea());
    }
}
