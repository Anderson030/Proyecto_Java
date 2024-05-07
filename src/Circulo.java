public class Circulo extends Figura{

    private double radio;


    public Circulo(String nombre, String color, double radio) {
        super(nombre, color);
        this.radio = radio;
    }

        public double calcularArea() {
            return Math.PI * radio * radio;
        }


        public double calcularPerimetro() {
            return 2 * Math.PI * radio;
        }
    }




