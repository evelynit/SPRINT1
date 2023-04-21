Este programa contiene 5 ejercicios:
Ejercicio 1: el programa mostrará todos los archivos y carpetas en el directorio indicado en orden alfabético.
Ejercicio 2: el programa mostrará todos los archivos y carpetas en el directorio indicado de forma recursiva, presentando la estructura de las carpetas.
Ejercicio 3: el programa mostrará todos los archivos y carpetas en el directorio indicado de forma recursiva y escribirá la estructura en un archivo de texto llamado "FileOutput.txt".
Ejercicio 4: el programa enseñará el contenido del archivo "DisplayFile.txt" en la consola.
Ejercicio 5: el programa creará un objeto de la clase "Person", lo guardará en un archivo llamado "person.ser" y luego lo leerá de nuevo y lo mostrará en la consola.

En la carpeta, podemos encontrar los siguientes archivos:
FileManager.java -> aquí están los métodos para llevar a cabo los ejercicios.
Main.java -> aquí se implementan los métodos de la clase FileManager.
Person.java -> es una clase que sirve como ejemplo para realizar el ejercicio 5.
FileOutput.txt -> aquí se escribe el contenido del archivo ejecutado en el ejercicio 3
DisplayFile.txt -> es texto que sirve como ejemplo para realizar el ejercicio 4
person.ser -> archivo generado al guardar el objeto "Person" en el ejercicio 5

----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Para compilar el proyecto, debemos abrir la línea de comandos en la carpeta S01T05N01, es decir, C:\Users\level\eclipse-workspace\S01T05N01>

Compilamos los archivos .java:
javac -d out src\exercicis\FileManager.java src\exercicis\Main.java src\exercicis\Person.java

Ejecutamos el archivo Main.class compilado:
java -cp out exercicis.Main
