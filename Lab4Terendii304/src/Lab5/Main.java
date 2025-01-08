package Lab5;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        FileHandler fileHandler = new FileHandler();
        Scanner scanner = new Scanner(System.in);

        try {
            // Введення значення кута
            System.out.print("Введіть значення кута (у радіанах): ");
            double x = scanner.nextDouble();

            // Обчислення результату
            double result = calculator.calculate(x);
            System.out.println("Результат: " + result);

            // Запис результату у текстовий та бінарний файли
            fileHandler.writeToTextFile("result.txt", result);
            fileHandler.writeToBinaryFile("result.bin", result);

            // Читання та перевірка результатів з обох файлів
            String textResult = fileHandler.readFromTextFile("result.txt");
            double binaryResult = fileHandler.readFromBinaryFile("result.bin");

            System.out.println("Результат з текстового файлу: " + textResult);
            System.out.println("Результат з бінарного файлу: " + binaryResult);

        } catch (ArithmeticException e) {
            System.err.println("Помилка: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Помилка роботи з файлом: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Невідома помилка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
