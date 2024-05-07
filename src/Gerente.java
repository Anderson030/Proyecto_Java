public class Gerente extends Empleado {

    private double bono;


    public Gerente(String nombre, double salarioBase, double bono) {
        super(nombre, salarioBase);
        this.bono = bono;
    }

    // Método para calcular el salario del gerente (salario base + bono)
    @Override
    public double calcularSalario() {
        return super.getSalarioBase() + bono;
    }
}