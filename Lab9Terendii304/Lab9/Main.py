from conditioner.climate_device import ClimateControlDevice

def main():
    """
    Точка входу в програму. Демонстрація роботи пристрою кліматконтролю.
    """
    # Створення об'єкта пристрою кліматконтролю
    climate_device = ClimateControlDevice(
        brand="Samsung",
        model="ACX100",
        power=2000,
        temperature=22,
        humidity=50,
        air_quality=80
    )

    # Включення пристрою
    climate_device.turn_on()

    # Налаштування вологості
    climate_device.adjust_humidity(60)

    # Виведення інформації про якість повітря
    climate_device.display_air_quality()

    # Вимкнення пристрою
    climate_device.turn_off()

if name == "main":
    main()