package richardpadgett_lab2.alexycruz_lab2;

import javax.swing.JOptionPane;

public class RichardPadgett_Lab2AlexyCruz_Lab2 {

    public static void main(String[] args) {
        int menu = Integer.parseInt(JOptionPane.showInputDialog("INICIO\n" + "1.Log In\n" + "2.Matricula\n" + "3.Configuracion"));
        switch (menu) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                int menu3 = Integer.parseInt(JOptionPane.showInputDialog("Configuracion\n" + "1.Crear clases\n" + "2.Asignar Maestros"));
                switch (menu3) {
                    case 1:
                        int numclas = Integer.parseInt(JOptionPane.showInputDialog("Cuantas clases desea crear?"));
                        for (int i = 0; i < numclas; i++) {
                            String clase = JOptionPane.showInputDialog("Nombre de clase # " + numclas);
                            String seccion = JOptionPane.showInputDialog("Numero de seccion de clase # " + numclas);
                            int cantalumn = Integer.parseInt(JOptionPane.showInputDialog("Cantidad maxima de alimnos de clase # "+numclas));
                            String maestro = JOptionPane.showInputDialog("Nombre del maesto # "+numclas);
                            int unidadv = Integer.parseInt(JOptionPane.showInputDialog("Unidades valorativas de clase # "+numclas));
  }
                        break;
                    case 2:
                        
                        break;

                }
                break;
        }
    }

}
