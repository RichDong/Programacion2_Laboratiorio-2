package richardpadgett_lab2.alexycruz_lab2;

import java.util.ArrayList;

public class Alumno {

    String usuario;
    String contra;
    String nombre;
    String numeroc;
    double dinero;
    int edad;

    ArrayList<Clases> listac2 = new ArrayList();

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

    public ArrayList<Clases> getListac2() {
        return listac2;
    }

    public void setListac(ArrayList<Clases> listac) {
        this.listac2 = listac;
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

    @Override
    public String toString() {
        return "Alumno{" + "usuario=" + usuario + ", contra=" + contra + ", nombre=" + nombre + ", numeroc=" + numeroc + ", dinero=" + dinero + ", edad=" + edad + '}';
    }

}
