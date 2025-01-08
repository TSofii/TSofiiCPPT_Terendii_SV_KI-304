# -*- coding: utf-8 -*-
"""
Модуль з базовим і похідним класами для роботи з пристроями кліматконтролю.
"""

class Conditioner:
    """
    Базовий клас Кондиціонер.
    """

    def __init__(self, brand, model, power, temperature):
        self.brand = brand
        self.model = model
        self.power = power
        self.temperature = temperature
        self.is_on = False

    def turn_on(self):
        """Увімкнути кондиціонер."""
        self.is_on = True
        print(f"{self.brand} {self.model} увімкнено. Потужність: {self.power} Вт.")

    def turn_off(self):
        """Вимкнути кондиціонер."""
        self.is_on = False
        print(f"{self.brand} {self.model} вимкнено.")

    def set_temperature(self, temperature):
        """Встановити температуру."""
        self.temperature = temperature
        print(f"Температура встановлена на {temperature}°C.")


class ClimateControlDevice(Conditioner):
    """
    Похідний клас Пристрій кліматконтролю.
    """

    def __init__(self, brand, model, power, temperature, humidity, air_quality):
        super().__init__(brand, model, power, temperature)
        self.humidity = humidity
        self.air_quality = air_quality

    def adjust_humidity(self, humidity):
        """Налаштувати вологість."""
        self.humidity = humidity
        print(f"Вологість встановлена на {humidity}%.")

    def display_air_quality(self):
        """Відобразити якість повітря."""
        print(f"Якість повітря: {self.air_quality}%.")
