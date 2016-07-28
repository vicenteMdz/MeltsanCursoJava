/**Miercoles 27 de Julio del 2016
 *Meltsan Solutions
 * @author Vicente Mendoza Bautista
 */

import javax.swing.JOptionPane;

public class MyOwnWhileProject {
    
    public static void main(String[] args) {
        //array de String inicializados con nombres estaticos
        String names []={"Beah","Bianca","Lance","Belle","Nico","Yza","Gem","Ethan"};
        //se le pide al usuario una palabra a buscar
        String searchName = JOptionPane.showInputDialog("Ingresa una palabra a buscar!");
        //variable booleana que nos indica si se encontro o no la palabra buscada
        boolean foundName =false;
        //contador para iterar el bucle while y obtener datos del arreglo
        int count=0;
        //ciclo while en donde se busca la palabra
        while(count < names.length){
             if (names [count ].equals(searchName)){//se compara con cada posicion del arreglo
                foundName =true;//si se encontro la palabra cambiamos el estado de la variable founName a verdadero
                break;//se rompe el ciclo para no seguir buscando
            }
             count++;//se incrementa el contador
        }
        //se muestra la salida en pantalla
        if (foundName)
            JOptionPane.showMessageDialog(null, searchName + " is found!");
        else
            JOptionPane.showMessageDialog(null, searchName + " is not found!");
        
    }
}
