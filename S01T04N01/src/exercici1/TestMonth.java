package exercici1;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TestMonth {

	@Test
	public void testMonthsSize(ArrayList<String> months) {
		int expectedSize = 12;
		int actualSize = months.size();
		Assert.assertEquals(expectedSize, actualSize);

	}

	public void testAugustIn8(ArrayList<String> months) {
		String expectedMonth = "Agosto";
		String actualMonth = months.get(7);
		Assert.assertEquals(expectedMonth, actualMonth);
	}
}
