public class Cubo extends FormaTridimensional {

    double aresta;

    public Cubo(double aresta) {
        this.aresta = aresta;
    }

    @Override 
    public double obterArea() {
        double area = 6 * Math.pow(aresta, 2);
        return area;
    }

    @Override 
    public double obterVolume() {
        double volume = Math.pow(aresta, 3);
        return volume;
    }
}