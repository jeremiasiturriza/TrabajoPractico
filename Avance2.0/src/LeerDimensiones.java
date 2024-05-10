import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeerDimensiones {
    // Matriz de dimensiones
    public List<ArrayList<Double>> dimensionsData = new ArrayList<>();
    // Encabezado
    public String[] header;

    public LeerDimensiones(CsvParser csvParser, String file, int endColumn) throws Exception {
        try {
            List<String[]> csvData = csvParser.parseCsv(file);
            for (int i = 0; i < csvData.size(); i++) {
                ArrayList<Double> record = new ArrayList<>();
                for (int j = 0; j <= endColumn; j++) {
                    record.add(Double.parseDouble(csvData.get(i)[j]));
                }
                dimensionsData.add(record);
            }
            this.header = csvParser.getHeader(file);
        } catch (IOException e) {
            System.err.println("Error al leer el archivo CSV: " + e.getMessage());
        }
    }
}