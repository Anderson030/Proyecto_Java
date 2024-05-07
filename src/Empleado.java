public class Empleado implements Trabajador{

    public String nombre;
    public int salario;



    @Override
    public void realizarTarea() {

        System.out.println("Realizando tarea laboral");

    }
}
