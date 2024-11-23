
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

class App {
    public static void main(String[] args) {
        String inputFile = "temperatures.txt";
        String outputFile = "result.txt";

        try {
            // Read all lines from the file
            List<String> lines = Files.readAllLines(Paths.get(inputFile));

            // Convert the List<String> to a double array
            double[] temperatures = lines.stream()
                    .mapToDouble(Double::parseDouble)
                    .toArray();

            // Calculate average, max, and min temperatures
            double sum = 0, max = Double.MIN_VALUE, min = Double.MAX_VALUE;
            for (double temp : temperatures) {
                sum += temp;
                if (temp > max) max = temp;
                if (temp < min) min = temp;
            }
            double average = sum / temperatures.length;

            // Prepare results
            String results = String.format(
                    "Average Temperature: %.2f%nMaximum Temperature: %.2f%nMinimum Temperature: %.2f",
                    average, max, min
            );

            // Write results to the output file
            Files.write(Paths.get(outputFile), results.getBytes());
            System.out.println("Results written to " + outputFile);

        } catch (IOException e) {
            System.out.println("Error reading or writing files: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format in the file.");
        }
    }
}
