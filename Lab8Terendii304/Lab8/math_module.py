# -*- coding: utf-8 -*-
# math_module.py

import math
import struct

def calculate_expression(x):
   
    try:
        y = 1 / math.sin(x)
        return y
    except ZeroDivisionError:
        print("Error: sin(x) is zero, division by zero is not possible.")
        return None

def write_to_text_file(filename, results):
    
    with open(filename, 'w', encoding='utf-8') as file:
        for x, y in results.items():
            file.write(f"x={x}, y={y}\n")

def read_from_text_file(filename):
    
    results = {}
    with open(filename, 'r', encoding='utf-8') as file:
        for line in file:
            parts = line.strip().split(',')
            x = float(parts[0].split('=')[1])
            y = float(parts[1].split('=')[1])
            results[x] = y
    return results

def write_to_binary_file(filename, results):
   
    with open(filename, 'wb') as file:
        for x, y in results.items():
            file.write(struct.pack('ff', x, y))

def read_from_binary_file(filename):
    
    results = {}
    with open(filename, 'rb') as file:
        while True:
            data = file.read(8)
            if not data:
                break
            x, y = struct.unpack('ff', data)
            results[x] = y
    return results
