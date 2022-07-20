import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {

    @Test
    public void shouldCalcExact() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.calculateSqr(200, 300);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcZero() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.calculateSqr(10, 15);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcBorderRight() {
        SQRService service = new SQRService();

        int expected = 1;
        int actual = service.calculateSqr(9801, 100000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcBorderLeft() {
        SQRService service = new SQRService();

        int expected = 1;
        int actual = service.calculateSqr(9, 100);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcAll() {
        SQRService service = new SQRService();

        int expected = 90;
        int actual = service.calculateSqr(100,9801  );

        Assertions.assertEquals(expected, actual);
    }
}
