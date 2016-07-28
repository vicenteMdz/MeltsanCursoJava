/**Miercoles 27 de Julio del 2016
 *Meltsan Solutions
 * @author Vicente Mendoza Bautista
 */

import javax.swing.JOptionPane;

public class MyGetInputFromKeyboardJOptionPaneProject2 {

    public static void main(String[] args) {
        //variable que guarda el nombre
        String name = "";
        //variable entera que guarda la edad
        int edad=0;
        name=JOptionPane.showInputDialog("Please enter your name");//pedimos el nombre al usuario y lo guardamos en name
        try {
            edad=Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your age: "));//se pide la edad y se guarda en la variable edad
            //se compara la edad, si es mayor a 100 asignamos un mensaje a la variable msj, si no, asignamos otro mensaje
            String msg = (edad>100)?"Hello " + name + ", You are old!!!":"Hello " + name + ", You are young!!!";
            //se muestra la salida en pantalla
            JOptionPane.showMessageDialog(null, msg);
        } catch (NumberFormatException e) {
            System.out.println("Error!!! Insertaste una edad incorrecta");
        }  
    }
    
}
