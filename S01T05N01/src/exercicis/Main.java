package exercicis;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// Ejercicio 1
		System.out.println("Cargando ejercicio 1........");
		File directory = new File("C:\\Users\\level\\eclipse-workspace\\S01T05N01\\src\\exercicis");
		try {
			FileManager.listFilesAlphabetically(directory);
		} catch (IOException e) {
			System.err.println("Error en el ejercicio 1: " + e.getMessage());
		}

		// Ejercicio 2
		System.out.println("Cargando ejercicio 2........");
		try {
			FileManager.listFilesRecursively(directory, 0);
		} catch (IOException e) {
			System.err.println("Error en el ejercicio 2: " + e.getMessage());
		}

		//Ejercicio 3
		System.out.println("Cargando ejercicio 3........ ver FileOutput.txt");
		File outputFile = new File("src\\\\exercicis\\\\FileOutput.txt");

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
			try {
				FileManager.listFilesRecursivelyToFile(directory, 0, writer);
			} catch (IOException e) {
				System.err.println("Error en el ejercicio 3: " + e.getMessage());
			}
		
		} catch (IOException e) {
		    System.err.println("Error al cerrar el BufferedWriter en el ejercicio 3: " + e.getMessage());
		}

		// Ejercicio 4
		System.out.println("Cargando ejercicio 4........");
		File inputFile = new File("src\\exercicis\\Person.java");
		try {
			FileManager.displayFileContent(inputFile);
		} catch (IOException e) {
			System.err.println("Error en el ejercicio 4: " + e.getMessage());
		}


		// Ejercicio 5
		System.out.println("Cargando ejercicio 5........");
		Person person = new Person("Ana Maria", 25);
		String outputFile1 = "src\\exercicis\\person.ser";

		// Serializar el objeto Person
		try {
			FileManager.serializeObjectToFile(person, outputFile1);
		} catch (IOException e) {
			System.err.println("Error al serializar el objeto: " + e.getMessage());
		}

		// Deserializar el objeto Person
		try {
			Person deserializedPerson = (Person) FileManager.deserializeObjectFromFile(outputFile1);
			System.out.println("Deserialized person: " + deserializedPerson);
		} catch (ClassNotFoundException e) {
			System.err.println("Error al deserializar el objeto: " + e.getMessage());
		}catch (IOException e) {
			System.err.println("Error al leer el archivo .ser: " + e.getMessage());
		}
	}
}
