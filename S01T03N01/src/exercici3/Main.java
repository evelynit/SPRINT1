package exercici3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        //Leer el archivo "countries.txt" y guardar los datos en un HashMap
        HashMap<String, String> countries = new HashMap<>();
        try {
            File file = new File("src\\exercici3\\Countries.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String[] parts = scanner.nextLine().split(" ");
                String country = parts[0];
                String capital = parts[1];
                countries.put(country, capital);
            }
            scanner.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
            e.printStackTrace();
        }

        //Pedir el nombre del usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre:");
        String nombreUsuario = scanner.nextLine();

        //Repetir 10 veces
        int puntuacion = 0;
        for (int i = 0; i < 10; i++) {
            //Seleccionar un país aleatorio del HashMap
            String[] countriesArray = countries.keySet().toArray(new String[0]);
            Random random = new Random();
            int randomIndex = random.nextInt(countriesArray.length);
            String country = countriesArray[randomIndex];

            //Mostrar el nombre del país seleccionado y pedir al usuario/a que introduzca la capital
            System.out.println("¿Cuál es la capital de " + country + "?");
            String capitalUsuario = scanner.nextLine();

            //Comprobar si la capital introducida es correcta y actualizar la puntuación
            String capitalCorrecta = countries.get(country);
            if (capitalCorrecta.equalsIgnoreCase(capitalUsuario)) {
                puntuacion++;
                System.out.println("¡Correcto!");
            } else {
                System.out.println("Incorrecto. La capital de " + country + " es " + capitalCorrecta);
            }
        }

        //Guardar el nombre del usuario/a y su puntuación en un archivo
        try {
            FileWriter fileWriter = new FileWriter("src\\exercici3\\Classification", true);
            fileWriter.write(nombreUsuario + " - " + puntuacion + "\n");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo");
            e.printStackTrace();
        }
    }

}
