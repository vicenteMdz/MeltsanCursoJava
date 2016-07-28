package com.meltsan.cursoJava.claseTres;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;

public class ProcessBuilder_ErrorStream {
	
	public static void main(String args[]) throws Exception {

        // Create an error situation when running javap passing an invalid
        // class
        ProcessBuilder processBuilder = new ProcessBuilder("javap", "-private",
                "java.lang.junkClass");   // This class does not exist

        // The options for manipulating the environment include adding environment
        // variables with the put() method, and removing them with the remove()
        // method.
        Map<String, String> environment = processBuilder.environment();

        environment.put("path", ";"); // Clearing the path variable;
        environment.put("path", "C:\\Java\\jdk1.6.0_18\\bin;");

        // With ProcessBuilder, you call start() to execute the command. Prior
        // to calling start(), you can manipulate how the Process will be created.
        Process process = processBuilder.start();
        writeProcessOutput(process);
        writeProcessError(process);
    }

     // Get the output from the subprocess and then display.
    static void writeProcessOutput(Process process) throws Exception {
        // "process.getInputStream()" gets the input stream of the subprocess.
        // The stream obtains data piped from the standard output stream of the
        // process represented by this Process object.
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

    // Get the error from the subprocess and then display
    static void writeProcessError(Process process) throws Exception {
        System.out.println("----- Start capturoing error through process.getErrorStream() ");
        InputStreamReader tempReader = new InputStreamReader(
                new BufferedInputStream(process.getErrorStream()));
        BufferedReader reader = new BufferedReader(tempReader);
        while (true) {
            String line = reader.readLine();
            if (line == null) {
                break;
            }
            System.out.println(line);
        }
        System.out.println("----- Stop capturoing error through process.getErrorStream() ");
    }
}
