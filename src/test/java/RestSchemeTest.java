import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RestSchemeTest {

    @Test
    public void test() {
        RestScheme service = new RestScheme();

        int expected = 3;
        int count = service.calculate(10_000, 3_000, 20_000);
        //System.out.println("1. " + count + " раз(а) отдыхал за год");

        Assertions.assertEquals(expected, count);
    }

    @Test
    public void test2() {
        RestScheme service = new RestScheme();

        int expected = 2;
        int count = service.calculate(100_000, 60_000, 150_000);
        //System.out.println("2. " + count + " раз(а) отдыхал за год");

        Assertions.assertEquals(expected, count);
    }
}
