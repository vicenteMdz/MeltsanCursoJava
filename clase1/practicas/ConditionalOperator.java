/*Ejercicio 2. Operadores Condicionales
 *Martes 26 de julio del 2016
 *Meltsan Solutions
 *Vicente Mendoza Bautista
*/

public class ConditionalOperator {
    
    public static void main(String[] args) {

        //declaracion de una variable tipo string llamada msj, e inicializada con cadena vacia
	String msj = "";
	//declaracion de una varible de tipo entera llamada salario, e inicializada con 1000000
        int salario = 1000000;

        // comparacion del salario con 500000 y asignar un mensaje a la variable msj
        msj = (salario >= 500000)?"Eres rico":"Eres pobre";

        //imprime la variable msj en pantalla
        System.out.println( msj );
    }
    
}
