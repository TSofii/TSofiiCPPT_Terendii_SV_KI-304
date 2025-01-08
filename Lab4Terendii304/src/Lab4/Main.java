package Lab4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Основний клас для запуску програми.
 * Здійснює взаємодію з користувачем та запис результатів у файл.
 */
public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введіть значення кута (у радіанах): ");
            double x = scanner.nextDouble();

            double result = calculator.calculate(x);
            System.out.println("Результат: " + result);

            // Запис результату у файл
            saveResultToFile(result);

        } catch (ArithmeticException e) {
            System.err.println("Помилка: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Помилка запису у файл: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Невідома помилка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    /**
     * Метод для запису результату у файл "result.txt".
     *
     * @param result результат обчислення виразу
     * @throws IOException якщо виникла помилка запису у файл
     */
    private static void saveResultToFile(double result) throws IOException {
        try (FileWriter writer = new FileWriter("result.txt")) {
            writer.write("Результат: " + result);
        }
    }
}
