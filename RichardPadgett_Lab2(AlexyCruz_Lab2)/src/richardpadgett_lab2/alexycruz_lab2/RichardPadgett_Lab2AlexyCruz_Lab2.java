package richardpadgett_lab2.alexycruz_lab2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class RichardPadgett_Lab2AlexyCruz_Lab2 {

    public static void main(String[] args) {
        int opcion = 0;
        ArrayList<Maestro> listam = new ArrayList();
        ArrayList<Alumno> listaa = new ArrayList();
        ArrayList<Clases> listac = new ArrayList();

        while (opcion != 4) {
            int menu = Integer.parseInt(JOptionPane.showInputDialog("INICIO\n" + "1.Log In\n" + "2.Matricula\n" + "3.Administracion"));
            switch (menu) {
                case 1:
                    String a = JOptionPane.showInputDialog("LOGIN\n" + "ingrese su nombre de usuario\n");
                    String b = JOptionPane.showInputDialog("ingrese su contrasena");

                    break;
                case 2:
                    int contalumn = 0;
                    int costo = 0;
                    JOptionPane.showInputDialog("MATRICULA");
                    String nom = JOptionPane.showInputDialog("Nombre del Alumno");
                    int dinero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuanto capital posee"));
                    String numcuenta = JOptionPane.showInputDialog("Numero de Cuenta");
                    int ed = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
                    String user = JOptionPane.showInputDialog("Ingrese su nombre de usuario");
                    String contra = JOptionPane.showInputDialog("Ingrese su nombre de usuario");
                    String lista = "";
                    int maxclases = Integer.parseInt(JOptionPane.showInputDialog("Cuantas clases quiere llevar?"));
                    while (costo < dinero) {
                        for (int j = 0; j < listac.size(); j++) {
                            lista += listac.get(j).getNombre() + "\n";
                        }
                        JOptionPane.showMessageDialog(null, lista);
                        String nomclas = JOptionPane.showInputDialog("Ingrese el nombre de la clase que quiere matricular");

                        for (int i = 0; i < listac.size(); i++) {
                          contalumn++;
                          if(contalumn > listac.get(i).cantalumn)
                              JOptionPane.showMessageDialog(null, "Esta clase esta llena");
                        }
                        for (int j = 0; j < listac.size(); j++) {
                            costo += listac.get(j).getprecio();
                            if (costo > dinero) {
                                JOptionPane.showMessageDialog(null, "No posee sufiecientes fondos para matricular estas clases");
                            }

                        }

                    }
                    listaa.add(new Alumno(user, contra, nom, user, dinero, ed));
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

                                for (int j = 0; j < listam.size(); j++) {
                                    if (listam.get(j).getNombre().equals(nomtemp)) {
                                        maestro = nomtemp;
                                    }
                                }

                                while (!maestro.equals(nomtemp)) {

                                    nomtemp = JOptionPane.showInputDialog("Nombre del maestro # " + i + 1);
                                    System.out.println(listam.size());
                                    System.out.println("nomtemp: " + nomtemp);
                                    System.out.println("maestro: " + maestro);
                                    for (int k = 0; k < listam.size(); k++) {
                                        if (listam.get(k).getNombre().equals(nomtemp)) {
                                            maestro = nomtemp;
                                        } else {
                                            JOptionPane.showInputDialog("Este maestro no esta registrado");
                                        }

                                    }

                                }
                                unidadv = Integer.parseInt(JOptionPane.showInputDialog("Unidades valorativas de clase # " + i + 1));
                                listac.add(new Clases(clase, seccion, cantalumn, maestro, unidadv, precio));
                            }
                            break;
                        case 2:
                            int numaes = Integer.parseInt(JOptionPane.showInputDialog("Cuantas maestros desea asignar?"));
                            for (int i = 0; i < numaes; i++) {
                                String nombre = JOptionPane.showInputDialog("Nombre del maestro # " + i + 1);
                                String titu = JOptionPane.showInputDialog("Titulo del maestro # " + i + 1);
                                String maestria = JOptionPane.showInputDialog("Maestria del maestro # " + numaes);
                                double salario = Integer.parseInt(JOptionPane.showInputDialog("Salario del maestro # " + i + 1));
                                String usuario = JOptionPane.showInputDialog("Nombre de usuario del maestro # " + i + 1);
                                String contram = JOptionPane.showInputDialog("Contrasena del maestro # " + i + 1);
                                int cantclass = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de clases disponibles del maestro # " + i + 1));
                                listam.add(new Maestro(nombre, titu, maestria, usuario, contram));

                                System.out.println("cree maestro");
                            }

                            System.out.println(listam.size());

                            break;

                    }
                    break;
                case 4:
                    break;
            }
        }
    }

}
