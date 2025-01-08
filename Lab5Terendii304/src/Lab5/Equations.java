package Lab5;
public class Equations {
        public double calculate(int x) throws CalcException {
            double rad = Math.toRadians(x);
            try {
                double y = 1.0 / Math.sin(rad);
                if (Double.isNaN(y) || Double.isInfinite(y)) {
                    throw new ArithmeticException();
                }
                return y;
            } catch (ArithmeticException ex) {
                throw new CalcException("Invalid value of X for sine calculation.");
            }
        }
    }


