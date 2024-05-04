public class Main {
    public static void main(String[] args) {

        Trabajador trabajador = new Trabajador() {
            @Override
            public void realizarTarea() {
                System.out.println("Realizando tarea laboral");
            }
        };


        trabajador.realizarTarea();
    }
}
