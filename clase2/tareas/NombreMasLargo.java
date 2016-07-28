/*Ejercicio. Buscar el nombre mas largo de 3 personas
 *Jueves 28 de julio del 2016
 *Meltsan Solutions. Curso Java Básico
 *@Author Vicente Mendoza
*/

import javax.swing.JOptionPane;

public class NombreMasLargo{
    
    public static void main(String []args){
        //arreglo de 6 posiciones para guardar el nombre y el apellido de 3 personas
        String []nombres = new String[6];
        String nombreMasLargo="";
        //variable contador para recorrer el arreglo de nombres
        int count=0, numP=1;
        for(count=0;count<nombres.length;count+=2){
            do{
                nombres[count]=JOptionPane.showInputDialog(null,"Ingresa el nombre del " +numP +"° miembro de tu familia: ");
                if(nombres[count].equals("")){
                    JOptionPane.showMessageDialog(null,"Tienes que ingresar el nombre del miembro de tu familia");
                }
            }while(nombres[count].equals(""));
            do{
                nombres[count+1]=JOptionPane.showInputDialog(null,"Ingresa el apellido del " +numP +"° miembro de tu familia: ");
                if(nombres[count+1].equals("")){
                    JOptionPane.showMessageDialog(null,"Tienes que ingresar el apellido del miembro de tu familia");
                }
            }while(nombres[count+1].equals(""));
            numP++;
        }
        //calculando el nombre mas largo
        nombreMasLargo=(nombres[0].length()>nombres[2].length())?nombres[0]:nombres[2];
        nombreMasLargo=(nombreMasLargo.length()>nombres[4].length())?nombreMasLargo:nombres[3];
        JOptionPane.showMessageDialog(null, "El nombre mas largo de los miembros de tu familia es: " + nombreMasLargo);
    }
}
