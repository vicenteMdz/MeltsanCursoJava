/*Ejercicio 4. Encuentra el numero mas grande
 *Martes 26 de julio del 2016
 *Meltsan Solutions
 *@Author: Vicente Mendoza Bautista
*/

public class GreatestValue2 {
    
    public static void main(String[] args) {
        //declaracion e inicializacion de variables enteras
        int num1 = 10;
        int num2 = 23;
        int num3 = 5;
        int min = 0;
	String mensaje="";        
        //seccion de condigo que determina el numero mayor
        min = (num1<num2)?num1:num2;
        min = (min<num3)?min:num3;
        mensaje = (min<10)?"El numero mas pequeño es menor a 10":"El numero mas pequeño es mayor o igual a 10";
        //imprime en pantalla los 3 numeros, y el numero mayor
        System.out.println("number 1 = "+num1);
        System.out.println("number 2 = "+num2);
        System.out.println("number 3 = "+num3);
        System.out.println("El numero menor es= "+min);
	System.out.println(mensaje);
    }
    
}
