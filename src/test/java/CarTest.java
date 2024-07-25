import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    // if you create a car with before each it is going to be created "automatically" before each test
    @BeforeEach
    public void init(){
        Car car = new Car(true);
    }
    @Test
    void ride_okCar_success () {
        Car car = new Car(true);

        boolean result = car.ride();
        assertTrue(result);
    }

    @Test
    void ride_notOkCar_success () {
        Car car = new Car(false);

        boolean result = car.ride();
        assertFalse(result);
    }

    @Test
    void ride_randomTest_success ()  {
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            boolean randomBoolean = random.nextBoolean();
            Car randomCar = new Car (randomBoolean);
            boolean result = randomCar.ride();
            assertEquals(randomBoolean, result);
        }
    }
}