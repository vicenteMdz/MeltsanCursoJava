
/*eNombre dee Ejercicioder
 *Fecha: 
 *Meltsan Solution. Curso Java Basico
 *@Author. Vicente Mendoza Bautista
*/

import java.io.*;
import java.lang.*;

public class leerTeclado{
	
	//Declaracion de atributos	
	private static final String PASSWORD="admin123";

	//Metodo Main
	public static void main(String [] args){
		int grade = 0;		
		String  calificacion = "";
		BufferedReader dataIn = new BufferedReader( new InputStreamReader(System.in));
		System.out.println("Ingresa el grado");
		try{
			grade = Integer.parseInt(dataIn.readLine());
			if(grade >= 60 && grade <= 70){
				calificacion = "C";
			}else if(grade >= 71 && grade <= 80){
				calificacion = "B";
			}else if(grade >= 81 && grade <= 90) {
				calificacion = "A";
                        }else if(grade >= 91 && grade <= 98) {
				calificacion = "A+";
                        }else if(grade >= 99 && grade <= 100) {
				calificacion = "S";
                        }else if(grade > 100){
				calificacion = "F";
			}else{
				calificacion = "R";
			}
			switch(calificacion){
				case "S":
					System.out.println("Mencion Honorifica con S");
					break;
				case "A":
					System.out.println("Mencion Honorifica con A");
					break;
				case "C":
					System.out.println("de PANZASO");
					break;
				default :
					System.out.println("Estas en caso Default");
					break;
			}
		}catch(IOException e){
			System.out.println("Error al leer");
		}catch(NumberFormatException e){
			System.out.println("Error, solo se aceptan numeros enteros");
		}catch(Exception e){
			System.out.println("Error desconocido");
		}
	}

}
