package exercici3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ArrayOutOfBoundsExampleTest {

	@Test
	public void testArrayIndexOutOfBounds() {
		ArrayOutOfBoundsExample example = new ArrayOutOfBoundsExample();
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
        
		// Verifica que se lanza una ArrayIndexOutOfBoundsException al intentar acceder a un índice fuera de los límites del array
		assertThrows(IndexOutOfBoundsException.class, ()-> example.getElement(list,5));
		//assertThrows(TipoDeExcepciónEsperada.class, () -> códigoQueDeberíaLanzarLaExcepción);

	}
}
