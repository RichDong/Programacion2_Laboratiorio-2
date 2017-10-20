package richardpadgett_lab2.alexycruz_lab2;

public class Clases {

    String nombre;
    String seccion;
    int cantalumn;
    int precio;
    String maestro;
    int unidadesval;

    public Clases() {
    }

    public Clases(String nombre, String seccion, int cantalumn, String maestro, int unidadesval) {
        this.nombre = nombre;
        this.seccion = seccion;
        this.cantalumn = cantalumn;
        this.maestro = maestro;
        this.unidadesval = unidadesval;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public int getCantalumn() {
        return cantalumn;
    }

    public void setCantalumn(int cantalumn) {
        this.cantalumn = cantalumn;
    }

    public String getMaestro() {
        return maestro;
    }

    public void setMaestro(String maestro) {
        this.maestro = maestro;
    }

    public int getUnidadesval() {
        return unidadesval;
    }

    public void setUnidadesval(int unidadesval) {
        this.unidadesval = unidadesval;
    }
      public int getprecio() {
        return precio;
    }

    public void setprecio(int precio) {
        this.precio = precio;
    }

}
