import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class RestSchemeTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/rest.csv")
    /*
    @CsvSource({
            "3,10000,3000,20000",
            "2,100000,60000,150000"
    })
    */
    public void test(int expected, int income, int expenses, int threshold) {
        RestScheme service = new RestScheme();

        //int expected = 3;
        int count = service.calculate(income, expenses, threshold);
        //System.out.println("1. " + count + " раз(а) отдыхал за год");

        Assertions.assertEquals(expected, count);
    }

    /*
    @Test
    public void test2() {
        RestScheme service = new RestScheme();

        int expected = 2;
        int count = service.calculate(100_000, 60_000, 150_000);
        //System.out.println("2. " + count + " раз(а) отдыхал за год");

        Assertions.assertEquals(expected, count);
    }
    */
}
