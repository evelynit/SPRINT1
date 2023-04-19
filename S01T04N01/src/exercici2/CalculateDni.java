package exercici2;

public class CalculateDni {
	public char calculateDniLetter(int numberDni) {
		String letters = "TRWAGMYFPDXBNJZSQVHLCKE";
        int index = numberDni % 23;
        return letters.charAt(index);
	}
}
