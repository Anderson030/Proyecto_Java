public class Empleado implements Trabajador{


    public String nombre;
    public int salario;

    public Empleado(String nombre, int salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    @Override
    public void realizarTarea() {

        System.out.println("Realizando tarea laboral");

    }
}
