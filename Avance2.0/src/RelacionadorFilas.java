import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RelacionadorFilas {
    // Mapa para relacionar las filas de hechos con las filas de dimensiones
    private Map<Integer, List<List<Double>>> relacionFilas = new HashMap<>();

    // Constructor que crea la relación entre filas de hechos y dimensiones
    public RelacionadorFilas(LeerHechos hechos, LeerDimensiones dimensiones) {
        for (int i = 0; i < hechos.data.size(); i++) {
            ArrayList<Double> hecho = hechos.data.get(i);
            int id = i; // Suponiendo que el ID es el índice de la fila
            List<List<Double>> datos = new ArrayList<>();
            datos.add(hecho);
            relacionFilas.put(id, datos);
        }

        for (int i = 0; i < dimensiones.dimensionsData.size(); i++) {
            ArrayList<Double> dimension = dimensiones.dimensionsData.get(i);
            int id = i; // Suponiendo que el ID es el índice de la fila
            List<List<Double>> datos = relacionFilas.get(id);
            if (datos != null) {
                datos.add(dimension.subList(1, dimension.size())); // Excluyendo el ID
            }
        }
    }

    // Método para obtener los datos relacionados para un ID dado
    public List<List<Double>> obtenerDatosRelacionados(int id) {
        return relacionFilas.get(id);
    }
}