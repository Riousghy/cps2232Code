public class GenericProduct<T extends Number> {
    public T multiply(T x, T y) {
        double result = x.doubleValue() * y.doubleValue();
        return (T) Double.valueOf(result);
    }

    public static void main(String[] args) {
        GenericProduct<Double> calculator = new GenericProduct<>();
        Double x = 5.5;
        Double y = 7.7;

        Double product = calculator.multiply(x, y);
        System.out.println("Product of " + x + " and " + y + " is: " + product);
    }
}
