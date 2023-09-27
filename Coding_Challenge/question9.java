public class question9 {
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }
    public static void main(String[] args) {
        double fahrenheit = 98.6;
        double celsius = fahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + " degrees Fahrenheit is equal to " + celsius + " degrees Celsius.");
    }
}