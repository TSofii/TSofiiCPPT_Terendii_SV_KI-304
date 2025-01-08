import java.io.*;
import java.util.Scanner;


public class Lab1Terendii304 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);

        // Введення розміру матриці
        System.out.print("Введіть розмір квадратної матриці (непарне число): ");
        int n = in.nextInt();
        in.nextLine(); // Чистимо буфер після вводу числа

        // Перевірка на непарність розміру матриці
        if (n % 2 == 0) {
            System.out.println("Помилка: введіть непарний розмір матриці.");
            return;
        }

        // Введення символу-заповнювача
        System.out.print("Введіть символ-заповнювач: ");
        String filler = in.nextLine();

        // Перевірка на правильність вводу символу-заповнювача
        if (filler.length() != 1) {
            System.out.println("Помилка: введіть лише один символ-заповнювач.");
            return;
        }

        char fillChar = filler.charAt(0); // Отримуємо символ-заповнювача

        // Створення файлу для виведення результатів
        File dataFile = new File("MyFile.txt");
        PrintWriter fout = new PrintWriter(dataFile);

        // Створення квадратної матриці
        char[][] arr = new char[n][n];

        // Заповнення матриці згідно з малюнком піскового годинника
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i <= j && i + j < n) || (i >= j && i + j >= n - 1)) {
                    arr[i][j]=fillChar;
                    // Заштрихована область
                } else {
                    arr[i][j] = ' '; // Порожня область
                }
            }
        }

        // Виведення матриці на екран і запис у файл
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]);
                fout.print(arr[i][j]);
            }
            System.out.println();
            fout.println();
        }

        // Закриття файлу
        fout.flush();
        fout.close();
    }
}
