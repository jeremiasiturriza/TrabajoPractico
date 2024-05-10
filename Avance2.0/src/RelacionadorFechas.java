import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RelacionadorFechas {
    // Mapa para relacionar los años con los IDs correspondientes
    private Map<Integer, List<Integer>> mapaAniosIds = new HashMap<>();

    // Constructor que crea la relación entre años y IDs
    public RelacionadorFechas(LeerFechas fechas) {
        for (int i = 0; i < fechas.data.size(); i++) {
            ArrayList<Double> filaFecha = fechas.data.get(i);
            int idFecha = filaFecha.get(0).intValue(); // Suponiendo que el ID de fecha está en la primera columna
            int anio = filaFecha.get(1).intValue(); // Suponiendo que el año está en la segunda columna
            List<Integer> ids = mapaAniosIds.getOrDefault(anio, new ArrayList<>());
            ids.add(idFecha);
            mapaAniosIds.put(anio, ids);
        }
    }

    // Método para obtener los IDs correspondientes a un año dado
    public List<Integer> obtenerIdsPorAnio(int anio) {
        return mapaAniosIds.getOrDefault(anio, new ArrayList<>());
    }
}