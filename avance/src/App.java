//import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        ParseCSV parser = new ParseCSV();
        parser.loadDataFromCsv("G:\\LCD\\Algoritmos I\\TP Final/ventas.csv");
        LeerHechos hechos = new LeerHechos(parser);
        LeerHechos id_dimensiones = new LeerHechos(parser, true);
        //System.out.println(hechos.getValorUnitario(0));
        hechos.mostrarHecho(0);
        
        
        // System.out.println(id_dimensiones.getIdProducto(5));
        // parser.loadDataFromCsv("G:\\LCD\\Algoritmos I\\TP Final/ventas.csv");
        

        Map<String, ArrayList<Integer>> anio = new HashMap<>();
        ArrayList<Integer> anio2017 = new ArrayList<>();
        ArrayList<Integer> anio2018 = new ArrayList<>();
        ArrayList<Integer> anio2019 = new ArrayList<>();
        ArrayList<Integer> anio2020 = new ArrayList<>();
        for (int i = 0; i < parser.data.size() - 1 ; i++) {
            //System.out.println("debug" + i);
            if (id_dimensiones.getIdFecha(i) < 184){
                anio2017.add(i);
            } else if (id_dimensiones.getIdFecha(i) < 549){
                anio2018.add(i);
            } else if (id_dimensiones.getIdFecha(i) < 914){
                anio2019.add(i);
            } else {
                anio2020.add(i);
            }
        anio.put("2017", anio2017);
        anio.put("2018", anio2018);
        anio.put("2019", anio2019);
        anio.put("2020", anio2020);
        }
        System.out.println("anio 2017 " + anio2017.size());
        System.out.println("anio 2018 " + anio2018.size());
        System.out.println("anio 2019 " + anio2019.size());
        System.out.println("anio 2020 " + anio2020.size());
        //System.out.println(anio.get("2017"));
    
    }
}
