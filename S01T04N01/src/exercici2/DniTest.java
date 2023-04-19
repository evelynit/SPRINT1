package exercici2;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
class DniTest {
    private CalculateDni calculateDni = new CalculateDni();
    @ParameterizedTest
    @CsvSource({
            "12345678, Z",
            "98765432, T",
            "87654321, R",
            "54321678, W",
            "98765432, T",
            "11223344, A",
            "44556677, P",
            "88990011, E",
            "99887766, H",
            "65432178, M"
    })


    @Test
    public void testCalculateLetter(int numberDni, char expectedLetter) {
        char calculatedLetter = calculateDni.calculateDniLetter(numberDni);
        Assert.assertEquals(expectedLetter, calculatedLetter);
    }
}
