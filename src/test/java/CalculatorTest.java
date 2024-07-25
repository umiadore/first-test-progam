import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
@Test
    public void sum_simplePositiveExample_success () {
    // Подготовительные входные данные
    Calculator calculator = new Calculator();
    int first =5;
    int second =5;

    //запуск самого метода
    int result = calculator.sum(first, second);

    // сверка результатов
    assertEquals (11, result);



    }
}
