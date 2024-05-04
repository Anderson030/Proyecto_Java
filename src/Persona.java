public class Persona {

    private String Nombre;
    private String FechaDeNacimiento;
    private Integer Edad;

    //Metodo constructor


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

        
        FechaDeNacimiento = fechaDeNacimiento;
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
}

