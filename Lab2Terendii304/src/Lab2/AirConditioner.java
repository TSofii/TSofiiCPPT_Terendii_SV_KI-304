package Lab2;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

/**
 * Клас, що представляє систему кондиціонування повітря.
 * @автор Студент
 * @версія 1.0
 */
public class AirConditioner {

    // Складові частини кондиціонера
    private TemperatureSensor tempSensor;
    private Fan fan;
    private Filter filter;

    private FileWriter logFile;

    // Конструктор
    public AirConditioner() throws IOException {
        this.tempSensor = new TemperatureSensor(24); // Температура за замовчуванням
        this.fan = new Fan("Середній");
        this.filter = new Filter("Чистий");
        logFile = new FileWriter("AirConditionerLog.txt", true);
        logActivity("Кондиціонер ініціалізовано з налаштуваннями за замовчуванням.");
    }

    // Конструктор з параметрами
    public AirConditioner(int temp, String fanSpeed, String filterStatus) throws IOException {
        this.tempSensor = new TemperatureSensor(temp);
        this.fan = new Fan(fanSpeed);
        this.filter = new Filter(filterStatus);
        logFile = new FileWriter("AirConditionerLog.txt", true);
        logActivity("Кондиціонер ініціалізовано з кастомними налаштуваннями.");
    }

    // Метод для регулювання температури
    public void adjustTemperature(int newTemp) throws IOException {
        tempSensor.setTemperature(newTemp);
        logActivity("Температура змінена на " + newTemp + "°C");
    }

    // Метод для зміни швидкості вентилятора
    public void changeFanSpeed(String newSpeed) throws IOException {
        fan.setFanSpeed(newSpeed);
        logActivity("Швидкість вентилятора встановлена на " + newSpeed);
    }

    // Метод для очищення фільтра
    public void cleanFilter() throws IOException {
        filter.clean();
        logActivity("Фільтр очищено.");
    }

    // Метод для відображення поточного статусу
    public void displayStatus() throws IOException {
        logActivity("Поточний статус: Температура: " + tempSensor.getTemperature() + "°C, Вентилятор: " + fan.getFanSpeed() + ", Фільтр: " + filter.getStatus());
    }

    // Метод для вимкнення кондиціонера
    public void shutDown() throws IOException {
        logActivity("Кондиціонер вимикається.");
        logFile.close();
    }

    // Метод для ведення журналу активностей
    private void logActivity(String message) throws IOException {
        logFile.write(LocalDateTime.now() + " - " + message + "\n");
        logFile.flush();
    }
}



