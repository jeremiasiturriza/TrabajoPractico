import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeerHechos {
    // Matriz
    public List<ArrayList<Double>> data = new ArrayList<>();
    // Encabezado
    public String[] header;

    public LeerHechos(CsvParser csvParser, String file, int skipColumns) throws Exception {
        try {
            List<String[]> csvData = csvParser.parseCsv(file);
            for (int i = 0; i < csvData.size(); i++) {
                ArrayList<Double> record = new ArrayList<>();
                for (int j = skipColumns; j < csvData.get(i).length; j++) {
                    record.add(Double.parseDouble(csvData.get(i)[j]));
                }
                data.add(record);
            }
            this.header = csvParser.getHeader(file);
        } catch (IOException e) {
            System.err.println("Error al leer el archivo CSV: " + e.getMessage());
        }
    }

    public Double getData(int index, int hecho) {
        return data.get(index).get(hecho);
    }

    public String getHeader(int index) {
        return header[index + 4];
    }

    public void imprimirData() {
        for (int i = 0; i < 5; i++) {
            System.out.println(data.get(i));
        }
    }

}
