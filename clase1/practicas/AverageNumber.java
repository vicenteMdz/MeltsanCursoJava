/*Ejercicio 3. promediando numeros
 *Martes 26 de julio del 2016
 *Meltsan Solutions
 *Vicente Mendoza Bautista
*/

public class AverageNumber {
    
    public static void main(String[] args) {
        //declaracion e inicializacion de 3 variables de tipo entero
        int num1 = 10;
        int num2 = 20;
        int num3 = 45;
        
        //Obtiene el promedio de los 3 numero y lo guarda en la variable entera ave
	int ave = (num1+num2+num3)/3;
        
        //muestra en pantalla los 3 numeros y el promedio de estos
        System.out.println("number 1 = "+num1);
        System.out.println("number 2 = "+num2);
        System.out.println("number 3 = "+num3);
        System.out.println("Average is = "+ave);
    }
    
}
