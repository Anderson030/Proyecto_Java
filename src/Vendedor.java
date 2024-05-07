public class Vendedor extends Empleado {
    // Propiedad adicional
    private double comision;

    // Constructor
    public Vendedor(String nombre, double salarioBase, double comision) {
        super(nombre, salarioBase);
        this.comision = comision;
    }

    // Método para calcular el salario del vendedor (salario base + comisión)
    @Override
    public double calcularSalario() {
        return super.getSalarioBase() + comision;
    }
}