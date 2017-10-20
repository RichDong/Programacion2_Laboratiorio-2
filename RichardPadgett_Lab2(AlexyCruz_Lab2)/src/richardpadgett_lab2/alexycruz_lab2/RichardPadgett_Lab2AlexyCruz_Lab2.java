package richardpadgett_lab2.alexycruz_lab2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class RichardPadgett_Lab2AlexyCruz_Lab2 {

    public static void main(String[] args) {
        int opcion = 0;
        while (opcion != 4) {
            ArrayList<Maestro> listam = new ArrayList();
            ArrayList<Alumno> listaa = new ArrayList();
            ArrayList<Clases> listac = new ArrayList();
            int menu = Integer.parseInt(JOptionPane.showInputDialog("INICIO\n" + "1.Log In\n" + "2.Matricula\n" + "3.Administracion"));
            switch (menu) {
                case 1:
                    break;
                case 2:
                    int costo = 0;
                    JOptionPane.showInputDialog("MATRICULA");
                    String nom = JOptionPane.showInputDialog("Nombre del Alumno");
                    int dinero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuanto capital posee"));
                    String numcuenta = JOptionPane.showInputDialog("Numero de Cuenta");
                    int ed = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
                    String user =  JOptionPane.showInputDialog("Ingrese su nombre de usuario");
                    String contra = JOptionPane.showInputDialog("Ingrese su nombre de usuario");
                    int maxclases = Integer.parseInt(JOptionPane.showInputDialog("Cuatas clases quiere llevar?"));
                    while (costo < dinero) {
                        for (int i = 0; i < maxclases; i++) {
                            String nomclas = JOptionPane.showInputDialog("Ingrese el nombre de la clase que quiere matricular");
                            for (int j = 0; j < listac.size(); j++) {
                                costo += listac.get(i).getprecio();
                            }
                            

                        }

                    }

                    break;
                case 3:
                    int menu3 = Integer.parseInt(JOptionPane.showInputDialog("Configuracion\n" + "1.Crear clases\n" + "2.Asignar maestros"));
                    switch (menu3) {
                        case 1:
                            int numclas = Integer.parseInt(JOptionPane.showInputDialog("Cuantas clases desea crear?"));

                            for (int i = 0; i < numclas; i++) {
                                String maestro = "";
                                int unidadv = 0;
                                String clase = JOptionPane.showInputDialog("Nombre de clase # " + i + 1);
                                String seccion = JOptionPane.showInputDialog("Numero de seccion de clase # " + i + 1);
                                int cantalumn = Integer.parseInt(JOptionPane.showInputDialog("Cantidad maxima de alimnos de clase # " + i + 1));
                                int precio = Integer.parseInt(JOptionPane.showInputDialog("Precio de la clase # " + i + 1));
                                String nomtemp = JOptionPane.showInputDialog("Nombre del maesto # " + i + 1);

                                while (maestro != nomtemp) {

                                    for (int j = 0; j < listam.size(); j++) {
                                        if (listam.get(j).getNombre().equals(nomtemp)) {
                                            maestro = nomtemp;
                                        } else {
                                            JOptionPane.showInputDialog("Este maestro no esta registrado");
                                        }

                                        unidadv = Integer.parseInt(JOptionPane.showInputDialog("Unidades valorativas de clase # " + i + 1));

                                    }
                                }
                                listac.add(new Clases(clase, seccion, cantalumn, maestro, unidadv, precio));
                            }
                            break;
                        case 2:
                            int numaes = Integer.parseInt(JOptionPane.showInputDialog("Cuantas maestros desea asignar?"));
                            for (int i = 0; i < numaes; i++) {
                                String nombre = JOptionPane.showInputDialog("Nombre del maestro # " + i + 1);
                                String titu = JOptionPane.showInputDialog("Titulo del maestro # " + i + 1);
                                String maestria = JOptionPane.showInputDialog("Maestria del maestro # " + numaes);
                                double salario = Integer.parseInt(JOptionPane.showInputDialog("Salatio del maestro # " + i + 1));
                                String usuario = JOptionPane.showInputDialog("Nombre de usuario del maestro # " + i + 1);
                                String contram = JOptionPane.showInputDialog("Contrasena del maestro # " + i + 1);
                                int cantclass = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de clases disponibles del maestro # " + i + 1));
                                listam.add(new Maestro(nombre, titu, maestria, usuario, contram));
                            }

                            break;

                    }
                    break;
                case 4:
                    break;
            }
        }
    }

}
