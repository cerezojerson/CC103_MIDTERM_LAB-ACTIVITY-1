public class TemperatureConverter {
    public static void main(String[] args) {
        double fahrenheit = 212;
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
    }
}
