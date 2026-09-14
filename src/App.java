public class App {
    public static void main(String[] args) throws Exception {
        
        Forma[] formas = {
            new Circulo(7),
            new Quadrado(3),
            new Triangulo(12, 5),
            new Esfera(6),
            new Cubo(8),
            new Tetraedro(9),
        };

        for (Forma f : formas) {
            System.out.println(f.obterDescricao());
        }
    }
}
