package com.meltsan.cursoJava.claseTres;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class UtilsJava 
{
	
	    //Declaracion de atributos	
		private static final String USERNAME = "administrador";
		private static final String PASSWORD = "admin123";
		private static final String CADENAVACIA = "";
		
		
		//Metodo Main
		public static void main(String []args){
			BufferedReader dataIn = new BufferedReader( new InputStreamReader(System.in));
			String u = "", p = "";
			try{
				do{
					System.out.print("Ingresa tu Nombre de Usuario:  ");
					u= dataIn.readLine();
				}while(notBlank(u).equals(CADENAVACIA));
			}catch(IOException e){
				System.out.println("Error al leer el Username de teclado");
			}
			try{
	            do{
	                System.out.print("Ingresa tu Contraseña:  ");
	                p= dataIn.readLine();
	            }while(notBlank(p).equals(CADENAVACIA));
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
			Properties p1= System.getProperties();
			System.out.println(p1);//contrab
		}
		
		private static String notBlank(String cadena){
			if(cadena==null){
				return "";
			}else{
				return cadena.trim();
			}
		}
}
