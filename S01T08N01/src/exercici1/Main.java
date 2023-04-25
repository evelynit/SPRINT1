package exercici1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("hola","oso", "manzana", "fresa");
		
		List<String> wordsWithO = words.stream()
				.filter(w -> w.contains("o"))
				.collect(Collectors.toList());
		
		System.out.println(wordsWithO);
	}

}
