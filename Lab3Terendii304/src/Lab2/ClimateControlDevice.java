package Lab2;

import java.io.IOException;

/**
 * Клас, що представляє пристрій кліматконтролю, який може рухатися та має джерело енергії.
 */
public class ClimateControlDevice extends AirConditioner implements Powered, Moveable {

    private double energyLevel;
    private double distanceTravelled;

    // Конструктор
    public ClimateControlDevice(int temp, String fanSpeed, String filterStatus, double initialEnergy) throws IOException {
        super(temp, fanSpeed, filterStatus);
        this.energyLevel = initialEnergy;
        this.distanceTravelled = 0.0;
    }

    // Реалізація методу move з інтерфейсу Moveable
    @Override
    public void move(double x) {
        distanceTravelled += x;
        energyLevel -= x / 10; // Наприклад, рух зменшує рівень енергії
        System.out.println("Пристрій переміщено на " + x + " одиниць. Залишок енергії: " + energyLevel);
    }

    // Реалізація методу milesToFueling з інтерфейсу Powered
    @Override
    public double milesToFueling() {
        return energyLevel * 10; // Наприклад, кожна одиниця енергії дозволяє рухатися на 10 одиниць
    }

    // Перевизначення абстрактного методу shutDown з AirConditioner
    @Override
    public void shutDown() throws IOException {
        System.out.println("Пристрій вимкнуто.");
    }

    public void displayEnergyStatus() {
        System.out.println("Залишок енергії: " + energyLevel);
    }
}

