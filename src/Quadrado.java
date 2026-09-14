public class Quadrado extends FormaBidimensional {

    double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double obterArea() {
        double area = lado * lado;
        return area;
    }
}