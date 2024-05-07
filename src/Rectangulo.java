public class Rectangulo extends Figura{


    private double longitud;
    private double ancho;

    public Rectangulo(String nombre, String color) {
        super(nombre, color);
    }

    public double calcularArea() {
        return longitud * ancho;
    }

    // Método para calcular el perímetro del rectángulo
    public double calcularPerimetro() {
        return 2 * (longitud + ancho);
    }
}
