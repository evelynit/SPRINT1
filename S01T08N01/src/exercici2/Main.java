package exercici2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("hola","oso", "manzana", "fresa", "Octopus");
		
		List<String> longWordsWithO = words.stream()
				.filter(w -> w.contains("o") && w.length() > 5)
				.collect(Collectors.toList());
		
		System.out.println(longWordsWithO);
	}

}
