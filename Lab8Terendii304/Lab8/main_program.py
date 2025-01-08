# -*- coding: utf-8 -*-
# main_program.py

import math_module as mm
import math

def main():

    x_values = [math.radians(i) for i in range(0, 180, 15)]
    results = {}

    # Calculate y values for each x
    for x in x_values:
        # Перевірка, щоб sin(x) не дорівнював нулю
        # if math.sin(x) != 0:
            y = mm.calculate_expression(x)
            if y is not None:
                results[x] = y
        # else:
        #     print(f"Skipped calculation for x={x} as sin(x) is zero.")

    # Write results to a text file
    mm.write_to_text_file("results.txt", results)

    # Read and print results from the text file
    print("Results from the text file:")
    text_results = mm.read_from_text_file("results.txt")
    for x, y in text_results.items():
        print(f"x={x}, y={y}")

    # Write results to a binary file
    mm.write_to_binary_file("results.bin", results)

    # Read and print results from the binary file
    print("Results from the binary file:")
    binary_results = mm.read_from_binary_file("results.bin")
    for x, y in binary_results.items():
        print(f"x={x}, y={y}")

if __name__ == "__main__":
    main()

