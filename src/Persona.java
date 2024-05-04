import java.time.Year;

public class Persona {

    private String Nombre;
    private String FechaDeNacimiento;
    private Integer Edad;

    public Persona(String nombre, String fechaDeNacimiento, int edad) {
    }


    // Getters y setters

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getFechaDeNacimiento() {
        return FechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {

        if (Edad != null && Edad >= 0) {

            Year year = Year.now();
            int añoActual = year.getValue();
            int añoDeNacimiento = añoActual - Edad;




            FechaDeNacimiento = fechaDeNacimiento;
        } else {
            System.out.println("NO VALIDO");
        }


    }


    public Integer getEdad() {
        return Edad;
    }



    public void setEdad(int edad) {
        if (edad >= 0) {
            this.Edad = edad;
        } else {
            System.out.println("No es válida la edad");



        }
    }




    public String calcularFechaNacimiento() {
        if (Edad != null && Edad >= 0) {

            Year year = Year.now();
            int añoActual = year.getValue();
            int añoDeNacimiento = añoActual - Edad;


            return añoDeNacimiento + "-01-01";
        } else {
            return "No se puede calcular la fecha de nacimiento sin una edad válida.";
        }
    }
}
