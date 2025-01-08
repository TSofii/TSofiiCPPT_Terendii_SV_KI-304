def generate_matrix(size, fill_char):
    """
    ������� ������� ��������� ������, �� ������ ���� ����������� ������ ��������� �������.
    """
    matrix = []
    for i in range(size):
        row = []
        for j in range(size):
            if (i < j and i < size - j - 1) or (i > j and i > size - j - 1):
                row.append(fill_char)
            else:
                row.append(' ')
        matrix.append(row)
    return matrix

def print_matrix(matrix):
    """
    ������� ��� ����� �������.
    """
    for row in matrix:
        print(" ".join(row))

def main():
    try:
        size = int(input("������ ����� ��������� �������: "))
        fill_char = input("������ ������-����������: ")
        if len(fill_char) != 1:
            raise ValueError("������ ���� ���� ������ ��� �����������.")
        matrix = generate_matrix(size, fill_char)
        print("����������� �������:")
        print_matrix(matrix)
    except ValueError as e:
        print(f"�������: {e}")

if __name__ == "__main__":
    main()
