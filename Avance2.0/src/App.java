import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        // CSVparserWithHeaderRow csv = new CSVparserWithHeaderRow();
        // String file = "archivos/ventas.csv";

        // csv.parseCsv(file);
        // LeerHechos hechos = new LeerHechos(csv, file, 4);
        // double prueba;
        // prueba = hechos.getData(5, 1);

        // String hecho_1 = hechos.getHeader(1);

        // System.out.println(hecho_1 + " " + prueba);
        // // hechos.imprimirData();

        // LeerDimensiones dimensiones = new LeerDimensiones(csv, file, 3);
        // double prueba2;
        // prueba2 = dimensiones.dimensionsData.get(5).get(1);

        // System.out.println(prueba2);

        // Suponiendo que tienes las listas de hechos y dimensiones ya creadas
        CSVparserWithHeaderRow csv = new CSVparserWithHeaderRow();
        String file = "archivos/ventas.csv";
        String file2 = "archivos/fechas.csv";

        csv.parseCsv(file);
        LeerHechos hechos = new LeerHechos(csv, file, 4);
        LeerDimensiones dimensiones = new LeerDimensiones(csv, file, 3);

        // Crear el relacionador de filas
        RelacionadorFilas relacionador = new RelacionadorFilas(hechos, dimensiones);

        // Obtener los datos relacionados para un ID dado
        int idBuscado = 2;
        List<List<Double>> datosRelacionados = relacionador.obtenerDatosRelacionados(idBuscado);
        if (datosRelacionados != null) {
            System.out.println("Datos relacionados para el ID " + idBuscado + ":");
            for (List<Double> fila : datosRelacionados) {
                System.out.println(fila);
            }
        } else {
            System.out.println("No se encontraron datos para el ID " + idBuscado);
        }
    }
}
