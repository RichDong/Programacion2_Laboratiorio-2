
package richardpadgett_lab2.alexycruz_lab2;


public class Maestro {
    String nombre;
    String titulo;
    String maestria;
    String usuario;
    String contra;

    public Maestro() {
    }

    public Maestro(String nombre, String titulo, String maestria, String usuario, String contra) {
        this.nombre = nombre;
        this.titulo = titulo;
        this.maestria = maestria;
        this.usuario = usuario;
        this.contra = contra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMaestria() {
        return maestria;
    }

    public void setMaestria(String maestria) {
        this.maestria = maestria;
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

    @Override
    public String toString() {
        return "Maestro{" + "nombre=" + nombre + ", titulo=" + titulo + ", maestria=" + maestria + ", usuario=" + usuario + ", contra=" + contra + '}';
    }
    
}
