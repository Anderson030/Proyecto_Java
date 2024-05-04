public class Estudiante extends Persona {

    String GradoEstudiante;


    @Override
    public String toString() {
        return "Estudiante{" +
                "Nombre='" + getNombre() + '\'' +
                ", FechaDeNacimiento='" + getFechaDeNacimiento() + '\'' +
                ", Edad=" + getEdad() +
                ", GradoEstudiante='" + GradoEstudiante + '\'' +
                '}';
    }
}