package com.meltsan.cursoJava.claseTres;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws Exception {

        String[] commandArray = {"javap", "-private",
            "java.lang.String"};
        String[] environment = {"path=;",
            "path=C:\\Java\\jdk1.6.0_18\\bin;"};

        Runtime runtime = Runtime.getRuntime();
        Process process = runtime.exec(commandArray, environment);
        writeProcessOutput(process);
    }
	
	/**
	 * 
	 * @param process
	 * @throws Exception
	 */
    static void writeProcessOutput(Process process) throws Exception {
        InputStreamReader tempReader = new InputStreamReader(
                new BufferedInputStream(process.getInputStream()));
        BufferedReader reader = new BufferedReader(tempReader);
        while (true) {
            String line = reader.readLine();
            if (line == null) {
                break;
            }
            System.out.println(line);
        }
    }
}
