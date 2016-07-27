/*Ejercicio 4. Encuentra el numero mas grande
 *Martes 26 de julio del 2016
 *Meltsan Solutions
 *@Author: Vicente Mendoza Bautista
*/

public class GreatestValue {
    
    public static void main(String[] args) {
        //declaracion e inicializacion de variables enteras
        int num1 = 10;
        int num2 = 23;
        int num3 = 5;
        int max = 0;
        
        //seccion de condigo que determina el numero mayor
        max = (num1>num2)?num1:num2;
        max = (max>num3)?max:num3;
        
        //imprime en pantalla los 3 numeros, y el numero mayor
        System.out.println("number 1 = "+num1);
        System.out.println("number 2 = "+num2);
        System.out.println("number 3 = "+num3);
        System.out.println("The highest number is = "+max);
    }
    
}
