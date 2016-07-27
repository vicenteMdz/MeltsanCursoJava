/*Nombre del Ejercicio
 *Fecha: 
 *Meltsan Solution. Curso Java Basico
 *@Author. Vicente Mendoza Bautista
*/

import java.io.*;
import java.lang.*;

public class login{
	
	//Declaracion de atributos	
	private static final String USERNAME = "administrador";
	private static final String PASSWORD = "admin123";
	//Metodo Main
	public static void main(String []args){
		BufferedReader dataIn = new BufferedReader( new InputStreamReader(System.in));
		String u = "", p = "";
		try{
			do{
				System.out.print("Ingresa tu Nombre de Usuario:  ");
				u= dataIn.readLine();
			}while(u.equals(""));
		}catch(IOException e){
			System.out.println("Error al leer el Username de teclado");
		}
		try{
                        do{
                                System.out.print("Ingresa tu Contraseña:  ");
                                p= dataIn.readLine();
                        }while(p.equals(""));
                }catch(IOException e){
                        System.out.println("Error al leer la contraseña");
                }
		if(!u.equals(USERNAME)){
			System.out.println("El nombre de Usuario es Inconrrecto");
		}else if(!p.equals(PASSWORD)){
			System.out.println("La contraseña es Inconrrecta");
		}else{
			System.out.println("\t\t*** Has Iniciado sesion exitosamente ***");
		}
	}
}
