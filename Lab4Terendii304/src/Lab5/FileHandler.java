package Lab5;
import java.io.*;

public class FileHandler {

    public void writeToTextFile(String filename, double result) throws IOException {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Результат: " + result);
        }
    }
    public String readFromTextFile(String filename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            return reader.readLine();
        }
    }
    public void writeToBinaryFile(String filename, double result) throws IOException {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename))) {
            dos.writeDouble(result);
        }
    }

    public double readFromBinaryFile(String filename) throws IOException {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filename))) {
            return dis.readDouble();
        }
    }
}
