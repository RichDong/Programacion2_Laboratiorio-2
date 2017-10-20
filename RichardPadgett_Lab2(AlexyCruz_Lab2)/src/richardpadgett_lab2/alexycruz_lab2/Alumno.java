package richardpadgett_lab2.alexycruz_lab2;

public class Alumno {

    String usuario;
    String contra;
    String nombre;
    String numeroc;
    double dinero;
    int edad;

    public Alumno() {
    }

    public Alumno(String usuario, String contra, String nombre, String numeroc, double dinero, int edad) {
        this.usuario = usuario;
        this.contra = contra;
        this.nombre = nombre;
        this.numeroc = numeroc;
        this.dinero = dinero;
        this.edad = edad;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroc() {
        return numeroc;
    }

    public void setNumeroc(String numeroc) {
        this.numeroc = numeroc;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    

}
