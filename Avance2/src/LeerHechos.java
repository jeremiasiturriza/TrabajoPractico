import java.util.List;
import java.io.IOException;
import java.util.ArrayList;



public class LeerHechos {
    //Matriz
    public List<ArrayList<Double>> data = new ArrayList<>();
    //Encabezado
    public String[] header;

    public LeerHechos(CSVparserWithHeaderRow csv, String file) throws IOException {
        for (int i = 0; i < csv.data.size(); i++) {
            ArrayList<Double> record = new ArrayList<>();
            Integer w = 0;
            for (int j = 4; j < csv.data.get(i).length; j++) {
                record.add(Double.parseDouble(csv.data.get(i)[j]));
                w++;
            }
            data.add(record);
        }
        this.header = csv.getHeader(file);
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

