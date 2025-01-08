# -*- coding: utf-8 -*-
"""
������ � ������� � �������� ������� ��� ������ � ���������� �������������.
"""

class Conditioner:
    """
    ������� ���� �����������.
    """

    def __init__(self, brand, model, power, temperature):
        self.brand = brand
        self.model = model
        self.power = power
        self.temperature = temperature
        self.is_on = False

    def turn_on(self):
        """�������� �����������."""
        self.is_on = True
        print(f"{self.brand} {self.model} ��������. ���������: {self.power} ��.")

    def turn_off(self):
        """�������� �����������."""
        self.is_on = False
        print(f"{self.brand} {self.model} ��������.")

    def set_temperature(self, temperature):
        """���������� �����������."""
        self.temperature = temperature
        print(f"����������� ����������� �� {temperature}�C.")


class ClimateControlDevice(Conditioner):
    """
    �������� ���� ������� �������������.
    """

    def __init__(self, brand, model, power, temperature, humidity, air_quality):
        super().__init__(brand, model, power, temperature)
        self.humidity = humidity
        self.air_quality = air_quality

    def adjust_humidity(self, humidity):
        """����������� ��������."""
        self.humidity = humidity
        print(f"�������� ����������� �� {humidity}%.")

    def display_air_quality(self):
        """³��������� ����� ������."""
        print(f"����� ������: {self.air_quality}%.")
