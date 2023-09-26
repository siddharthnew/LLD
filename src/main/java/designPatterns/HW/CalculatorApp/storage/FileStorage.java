package designPatterns.HW.CalculatorApp.storage;

import java.util.ArrayList;
import java.util.List;

public class FileStorage {
    private static final String FILE_PATH = "calculations.txt";

    public static void saveCalculation(String calculation) {
        //using try with resources so no need to close writer object in the finally block
        try (java.io.FileWriter fileWriter = new java.io.FileWriter(FILE_PATH, true)) {
            fileWriter.write(calculation);
            fileWriter.write(System.lineSeparator());
        } catch (java.io.IOException e) {
            System.out.println("Error saving calculation: " + e.getMessage());
        }
    }

    public static List<String> loadCalculations() {
       List<String> pastCalculations = new ArrayList<>();
        try (java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                pastCalculations.add(line);
            }
        } catch (java.io.IOException e) {
            System.out.println("Error loading calculations: " + e.getMessage());
        }
        return pastCalculations;
    }
}
