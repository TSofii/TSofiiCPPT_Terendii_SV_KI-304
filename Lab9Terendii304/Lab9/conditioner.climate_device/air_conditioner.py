class AirConditioner:
    """
    Базовий клас для кондиціонера. Описує основні характеристики кондиціонера.
    """

    def init(self, brand, model, power, temperature):
        """
        Ініціалізація кондиціонера.
        :param brand: Назва бренду.
        :param model: Модель кондиціонера.
        :param power: Потужність кондиціонера в ватах.
        :param temperature: Температура, яку кондиціонер має встановити.
        """
        self.brand = brand
        self.model = model
        self.power = power
        self.temperature = temperature

    def turn_on(self):
        """
        Включення кондиціонера.
        """
        print(f"Кондиціонер {self.brand} {self.model} увімкнено. Температура: {self.temperature}°C")

    def turn_off(self):
        """
        Вимкнення кондиціонера.
        """
        print(f"Кондиціонер {self.brand} {self.model} вимкнено.")