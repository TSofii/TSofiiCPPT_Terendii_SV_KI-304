from .air_conditioner import AirConditioner

class ClimateControlDevice(AirConditioner):
    """
    Похідний клас, що розширює функціональність базового кондиціонера для пристроїв кліматконтролю.
    """

    def init(self, brand, model, power, temperature, humidity, air_quality):
        """
        Ініціалізація пристрою кліматконтролю.
        :param humidity: Вологість повітря.
        :param air_quality: Якість повітря (вказується як індекс).
        """
        super().init(brand, model, power, temperature)
        self.humidity = humidity
        self.air_quality = air_quality

    def adjust_humidity(self, new_humidity):
        """
        Регулювання вологості повітря.
        :param new_humidity: Новий рівень вологості.
        """
        self.humidity = new_humidity
        print(f"Вологість налаштована на {self.humidity}%.")

    def display_air_quality(self):
        """
        Виведення інформації про якість повітря.
        """
        print(f"Індекс якості повітря: {self.air_quality}.")