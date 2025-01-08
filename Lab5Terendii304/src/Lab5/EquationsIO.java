package Lab5;

import java.io.*;
import java.util.Scanner;

public class EquationsIO {
    private double result;

    // Метод для запису результату у текстовий файл
    public void writeResTxt(String fName) throws FileNotFoundException {
        PrintWriter f = new PrintWriter(fName);
        f.printf("%f", result);
        f.close();
    }

    // Метод для зчитування результату з текстового файлу
    public void readResTxt(String fName) throws FileNotFoundException {
        File f = new File(fName);
        if (f.exists()) {
            Scanner s = new Scanner(f);
            result = s.nextDouble();
            s.close();
        } else {
            throw new FileNotFoundException("Файл " + fName + " не знайдено");
        }
    }

    // Метод для запису результату у бінарний файл
    public void writeResBin(String fName) throws FileNotFoundException, IOException {
        DataOutputStream f = new DataOutputStream(new FileOutputStream(fName));
        f.writeDouble(result);
        f.close();
    }

    // Метод для зчитування результату з бінарного файлу
    public void readResBin(String fName) throws FileNotFoundException, IOException {
        DataInputStream f = new DataInputStream(new FileInputStream(fName));
        result = f.readDouble();
        f.close();
    }

    // Метод для встановлення результату для тестування або обчислення
    public void setResult(double result) {
        this.result = result;
    }

    // Метод для отримання результату
    public double getResult() {
        return result;
    }
}
