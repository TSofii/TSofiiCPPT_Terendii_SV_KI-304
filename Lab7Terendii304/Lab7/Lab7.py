def generate_matrix(size, fill_char):
    """
    Функція створює зубчастий список, що містить лише заштриховані області квадратної матриці.
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
    Функція для друку матриці.
    """
    for row in matrix:
        print(" ".join(row))

def main():
    try:
        size = int(input("Введіть розмір квадратної матриці: "))
        fill_char = input("Введіть символ-заповнювач: ")
        if len(fill_char) != 1:
            raise ValueError("Введіть лише один символ для заповнювача.")
        matrix = generate_matrix(size, fill_char)
        print("Згенерована матриця:")
        print_matrix(matrix)
    except ValueError as e:
        print(f"Помилка: {e}")

if __name__ == "__main__":
    main()
