public class Esfera extends FormaTridimensional {

    double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }

    @Override 
    public double obterArea() {
        double area = 4 * 3.14 * Math.pow(raio, 2);
        return area;
    }

    @Override 
    public double obterVolume() {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
        return volume;
    }
}