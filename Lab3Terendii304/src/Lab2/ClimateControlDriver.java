package Lab2;


import java.io.IOException;


/**
 * Клас-драйвер для тестування кліматконтролю.
 */
public class  ClimateControlDriver{

    public static void main(String[] args) throws IOException {
        // Створюємо екземпляр класу-нащадка ClimateControlDevice, а не абстрактного AirConditioner
        ClimateControlDevice device = new ClimateControlDevice(22, "Середній", "Чистий", 100.0);

        // Виклик методу displayEnergyStatus
        device.displayEnergyStatus();

        // Виклик методу для зміни температури
        device.adjustTemperature(18);

        // Вимкнення пристрою
        device.shutDown();
    }
}
