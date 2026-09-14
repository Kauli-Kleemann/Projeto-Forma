public class Tetraedro extends FormaTridimensional {

    double aresta;

    public Tetraedro(double aresta) {
        this.aresta = aresta;
    }

    @Override 
    public double obterArea() {
        double area = Math.pow(aresta, 2) * Math.sqrt(3);
        return area;
    }

    @Override 
    public double obterVolume() {
        double volume = (Math.pow(aresta, 3) * Math.sqrt(2)) / 12;
        return volume;
    }
}