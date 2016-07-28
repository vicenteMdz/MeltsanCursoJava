import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Properties;

public class Tarea {
	
	public static void main(String[] args) {
		Properties myProperties = new Properties();
		myProperties.setProperty("mykey20", "myValue20");
		myProperties.setProperty("mykey30", "myValue30");
		myProperties.setProperty("mykey40", "myValue40");
		PrintStream fichero=null;
		try {
			fichero = new PrintStream ("properties.txt");
		} catch (FileNotFoundException e) {
			System.out.println("Error al crear el archivo");
		}
		myProperties.list(System.out);
		myProperties.list(fichero);
    }
}
