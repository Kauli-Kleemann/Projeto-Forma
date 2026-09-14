public abstract class FormaTridimensional extends Forma {

    public abstract double obterArea();
    public abstract double obterVolume();

    @Override
    public String obterDescricao() {
        return getClass().getSimpleName() 
            + " - área: " + String.format("%.2f", obterArea()) 
            + " - volume: " + String.format("%.2f", obterVolume());
    }
}