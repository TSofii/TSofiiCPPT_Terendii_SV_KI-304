from .air_conditioner import AirConditioner

class ClimateControlDevice(AirConditioner):
    """
    �������� ����, �� �������� ��������������� �������� ������������ ��� �������� �������������.
    """

    def init(self, brand, model, power, temperature, humidity, air_quality):
        """
        ����������� �������� �������������.
        :param humidity: �������� ������.
        :param air_quality: ����� ������ (��������� �� ������).
        """
        super().init(brand, model, power, temperature)
        self.humidity = humidity
        self.air_quality = air_quality

    def adjust_humidity(self, new_humidity):
        """
        ����������� �������� ������.
        :param new_humidity: ����� ����� ��������.
        """
        self.humidity = new_humidity
        print(f"�������� ����������� �� {self.humidity}%.")

    def display_air_quality(self):
        """
        ��������� ���������� ��� ����� ������.
        """
        print(f"������ ����� ������: {self.air_quality}.")