package exercici7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		List<String> elements = Arrays.asList("uno","masa","u","ea","apple","esqueleto","oliva","siete");
		
		List<String> sortedElementsReversed = elements.stream()
				.sorted(Comparator.comparingInt(String::length).reversed()) //method reference clase : nombreMetodo() 
				.collect(Collectors.toList());
		
		System.out.println(sortedElementsReversed);
	}

}
