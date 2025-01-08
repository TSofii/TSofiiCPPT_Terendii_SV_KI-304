class AirConditioner:
    """
    ������� ���� ��� ������������. ����� ������ �������������� ������������.
    """

    def init(self, brand, model, power, temperature):
        """
        ����������� ������������.
        :param brand: ����� ������.
        :param model: ������ ������������.
        :param power: ��������� ������������ � �����.
        :param temperature: �����������, ��� ����������� �� ����������.
        """
        self.brand = brand
        self.model = model
        self.power = power
        self.temperature = temperature

    def turn_on(self):
        """
        ��������� ������������.
        """
        print(f"����������� {self.brand} {self.model} ��������. �����������: {self.temperature}�C")

    def turn_off(self):
        """
        ��������� ������������.
        """
        print(f"����������� {self.brand} {self.model} ��������.")