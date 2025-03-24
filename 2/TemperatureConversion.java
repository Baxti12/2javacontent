abstract class BaseConverter {
    public abstract double convert(double celsius);
}

class CelsiusToKelvinConverter extends BaseConverter {
    @Override
    public double convert(double celsius) {
        return celsius + 273.15;
    }
}

class CelsiusToFahrenheitConverter extends BaseConverter {
    @Override
    public double convert(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}

public class TemperatureConversion {

    public static void main(String[] args) {
        double celsiusTemperature = 25.0;

        System.out.println("Temperature: " + celsiusTemperature + "°C");

        BaseConverter kelvinConverter = new CelsiusToKelvinConverter();
        double kelvinTemperature = kelvinConverter.convert(celsiusTemperature);
        System.out.println(celsiusTemperature + "°C to Kelvin: " + kelvinTemperature + "K");

        BaseConverter fahrenheitConverter = new CelsiusToFahrenheitConverter();
        double fahrenheitTemperature = fahrenheitConverter.convert(celsiusTemperature);
        System.out.println(celsiusTemperature + "°C to Fahrenheit: " + fahrenheitTemperature + "°F");
    }
}
