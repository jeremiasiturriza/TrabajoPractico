import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ParseCSV {
    public List<String[]> data = new ArrayList<>();

    // Parser para leer un archivo CSV
    public List<String[]> loadDataFromCsv(String filePath) throws IOException {
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] record = line.split(","); // Considera el delimitador de tu archivo CSV
                data.add(record);
            }
        }

        return data;
    }

    // Devuelve la fila de datos en la posición index
    public String[] get(int index) {
        return data.get(index);
    }
}
