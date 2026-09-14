public class Circulo extends FormaBidimensional {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override 
    public double obterArea() {
        double area = Math.PI * Math.pow(raio, 2);
        return area;
    }
}