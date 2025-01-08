package Lab5;

import java.util.Scanner;
import static java.lang.System.out;

/**
 * Клас <code>EquationsApp</code> реалізує програму-драйвер для класу Equations.
 * @author Student
 * @version 1.0
 */
public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);  // Для зчитування вводу від користувача

        try {
            Equations eq = new Equations();  // Створення об’єкта класу Equations
            out.print("Enter X (in degrees): ");
            int x = in.nextInt();  // Зчитування кута від користувача
            double result = eq.calculate(x);  // Виклик методу обчислення

            // Вивід на екран
            out.println("Result: " + result);  // Виведення результату на екран
        } catch (CalcException ex) {  // Обробка помилки обчислень
            out.println("Calculation error: " + ex.getMessage());
        } catch (Exception ex) {  // Загальна обробка всіх інших помилок
            out.println("An error occurred: " + ex.getMessage());
        } finally {
            in.close();  // Закриваємо сканер
        }
    }
}
