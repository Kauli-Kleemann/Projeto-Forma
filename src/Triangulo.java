public class Triangulo extends FormaBidimensional {

    private double base, altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double obterArea() {
        double area = (base * altura) / 2;
        return area;
    }
}