public class Kata {
    public static String integrate(int coefficient, int exponent) {
        return "" + (coefficient/++exponent) +"x^" + exponent;
    }
}
