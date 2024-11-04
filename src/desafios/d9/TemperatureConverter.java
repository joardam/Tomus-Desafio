package desafios.d9;

public class TemperatureConverter {
    public static double convert(double temperature, char scale) {
        if (scale == 'C') {
            return (temperature * (1.8)) + 32;
        } else if (scale == 'F') {
            return (temperature - 32) / 1.8;
        } else {
            throw new IllegalArgumentException("Invalid scale");
        }
    }
}
