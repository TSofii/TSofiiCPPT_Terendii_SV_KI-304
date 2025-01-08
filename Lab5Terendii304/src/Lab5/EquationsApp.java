package Lab5;

import java.io.*;
import java.util.Scanner;

public class EquationsApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Equations eq = new Equations();
        EquationsIO eqIO = new EquationsIO();

        try {
            // Введення користувача
            System.out.print("Введіть X (у градусах): ");
            int x = in.nextInt();

            // Обчислення результату
            double result = eq.calculate(x);
            eqIO.setResult(result);
            System.out.println("Результат: " + result);

            // Запис і зчитування результату у текстовому форматі
            eqIO.writeResTxt("result.txt");
            eqIO.readResTxt("result.txt");
            System.out.println("Результат з текстового файлу: " + eqIO.getResult());

            // Запис і зчитування результату у бінарному форматі
            eqIO.writeResBin("result.bin");
            eqIO.readResBin("result.bin");
            System.out.println("Результат з бінарного файлу: " + eqIO.getResult());

        } catch (CalcException ex) {
            System.out.println("Помилка обчислення: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Помилка вводу/виводу: " + ex.getMessage());
        } finally {
            in.close();
        }
    }
}

