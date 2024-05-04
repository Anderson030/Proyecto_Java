public class Estudiante extends Persona implements Trabajador {

    String GradoEstudiante;

    public Estudiante(String nombre, String fechaDeNacimiento, int edad, String grado) {
        super(nombre, fechaDeNacimiento, edad);
        this.GradoEstudiante = grado;
    }


    public String getGradoEstudiante() {
        return GradoEstudiante;
    }

    public void setGradoEstudiante(String gradoEstudiante) {
        GradoEstudiante = gradoEstudiante;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "Nombre='" + getNombre() + '\'' +
                ", FechaDeNacimiento='" + getFechaDeNacimiento() + '\'' +
                ", Edad=" + getEdad() +
                ", GradoEstudiante='" + GradoEstudiante + '\'' +
                '}';


    }

    @Override
    public void realizarTarea() {

        System.out.println("Realizando tarea escolar");;

    }
}