package Lab2;
import java.io.IOException;

public class AirConditionerDriver {

    public static void main(String[] args) {
        try {
            // Ініціалізація кондиціонера
            AirConditioner ac = new AirConditioner();

            // Регулювання температури
            ac.adjustTemperature(22);

            // Зміна швидкості вентилятора
            ac.changeFanSpeed("Висока");

            // Очищення фільтра
            ac.cleanFilter();

            // Відображення статусу
            ac.displayStatus();

            // Вимкнення кондиціонера
            ac.shutDown();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
