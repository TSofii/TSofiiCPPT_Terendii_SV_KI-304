from conditioner.climate_device import ClimateControlDevice

def main():
    """
    ����� ����� � ��������. ������������ ������ �������� �������������.
    """
    # ��������� ��'���� �������� �������������
    climate_device = ClimateControlDevice(
        brand="Samsung",
        model="ACX100",
        power=2000,
        temperature=22,
        humidity=50,
        air_quality=80
    )

    # ��������� ��������
    climate_device.turn_on()

    # ������������ ��������
    climate_device.adjust_humidity(60)

    # ��������� ���������� ��� ����� ������
    climate_device.display_air_quality()

    # ��������� ��������
    climate_device.turn_off()

if name == "main":
    main()