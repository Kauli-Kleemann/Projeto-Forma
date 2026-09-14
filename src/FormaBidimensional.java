public abstract class FormaBidimensional extends Forma {

    public abstract double obterArea();

    @Override
    public String obterDescricao() {

        return getClass().getSimpleName() + " - área: " + String.format("%.2f", obterArea());
    }
}