package com.kodilla.testing.weather.stub;

import java.util.*;
import java.util.stream.Collectors;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double averageTemperature(){
        double sum = 0;

        Map<String, Double> temperatures = this.temperatures.getTemperatures();
        for (Map.Entry<String, Double> temperature : temperatures.entrySet()) {
            sum = sum + temperature.getValue();
        }
        System.out.println("Average temperature is: ");
        return sum / temperatures.size();
    }

    public double calculateMedianTemperature() {
        Map<String,Double> temperatures = this.temperatures.getTemperatures();

        ArrayList<Double> temperaturesValue = new ArrayList<>(temperatures.values());

        Collections.sort(temperaturesValue);

        if (temperaturesValue.size() % 2 == 0) {
            int firstIndex = temperaturesValue.size() / 2;
            int secondIndex = temperaturesValue.size() / 2 - 1;
            return temperaturesValue.get(firstIndex) +temperaturesValue.get(secondIndex)/2;
        }
        return temperaturesValue.size()/2;
    }

}