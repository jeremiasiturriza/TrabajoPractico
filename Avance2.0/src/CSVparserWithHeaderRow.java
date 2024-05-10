import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVparserWithHeaderRow implements CsvParser {
    public List<String[]> data = new ArrayList<>();
    public String[] header;

    @Override
    public List<String[]> parseCsv(String filePath) throws IOException {

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            reader.readLine(); // Ignora la primera línea
            while ((line = reader.readLine()) != null) {
                String[] record = line.split(","); // Considera el delimitador de tu archivo CSV
                data.add(record);
            }
        }

        return data;
    }

    @Override
    public String[] getHeader(String filePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            this.header = reader.readLine().split(",");

        }
        return header;
    }
}
