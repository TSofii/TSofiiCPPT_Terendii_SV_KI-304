package Lab4;
import java.io.IOException;

public class Calculator {
    public double calculate(double x) throws ArithmeticException {
        double sinValue = Math.sin(x);
        if (sinValue == 0) {
            throw new ArithmeticException("Синус кута дорівнює 0. Ділення на нуль неможливе.");
        }
        return 1 / sinValue;
    }
}


