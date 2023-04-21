package exercicis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;

public class FileManager {
	
	// Ejercicio 1
	public static void listFilesAlphabetically(File directory) throws IOException{
		File[] files = directory.listFiles();//devuelve un array de objetos File, que son archivos y subdirectorios contenidos en el directorio actuak
		Arrays.sort(files);

		for(File file: files) {
			System.out.println(file.getName());
		}

	}

	// Ejercicio 2
	public static void listFilesRecursively(File directory, int depth) throws IOException{
		File[] files = directory.listFiles();
		Arrays.sort(files);

		for(int i = 0; i < files.length; i++) {
			File file = files[i];
			BasicFileAttributes attributes = Files.readAttributes(file.toPath(), BasicFileAttributes.class);
			String type = file.isDirectory() ? "D" : "F";
			String lastModified = attributes.lastModifiedTime().toString();
			String indent = " ".repeat(depth); //para hacer espacios

			System.out.printf("%s (%s) %s - Last modified %s%n", indent, type, file.getName(), lastModified);

			if (file.isDirectory()) {
				listFilesRecursively(file, depth + 1);
			}
		}	
	}

	// Ejercicio 3
	public static void listFilesRecursivelyToFile(File directory, int depth, BufferedWriter writer) throws IOException{
		File[] files = directory.listFiles();
		Arrays.sort(files);

		for (int i = 0; i < files.length; i++) {
			File file = files[i];

			BasicFileAttributes attributes = Files.readAttributes(file.toPath(),BasicFileAttributes.class);
			String type = file.isDirectory() ? "D" : "F";
			String lastModified = attributes.lastModifiedTime().toString();
			String indent = " ".repeat(depth);

			writer.write(String.format("%s(%s) %s - Last modified: %s%n", indent, type, file.getName(), lastModified));
			if (file.isDirectory()){
				listFilesRecursivelyToFile(file, depth + 1, writer);
			}
		}
	}

	// Ejercicio 4
	public static void displayFileContent(File file) throws IOException{
		try(BufferedReader reader = new BufferedReader(new FileReader(file))){
			String line;
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		}catch (IOException e) {
			System.out.println("Error al leer el archivo: " + e.getMessage());	
		}
	}

	// Ejercicio 5	
	public static void serializeObjectToFile(Object object, String outputFile) throws IOException {
		try (ObjectOutputStream objectOutStream = new ObjectOutputStream(new FileOutputStream(outputFile))) {
			objectOutStream.writeObject(object);
		}
	}

	public static Object deserializeObjectFromFile(String inputFile) throws IOException, ClassNotFoundException {
		try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(inputFile))) {
			return objectInputStream.readObject();
		}
	}
}
