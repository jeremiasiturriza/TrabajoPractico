import java.util.ArrayList;

public class LeerHechos {
    // atributos de los hechos
    public ArrayList<Integer> cantidad = new ArrayList<>();
    public ArrayList<Double> valor_unitario = new ArrayList<>();
    public ArrayList<Double> valor_total = new ArrayList<>();
    public ArrayList<Double> costo = new ArrayList<>();
    // atributos de las dimensiones
    public ArrayList<Integer> id_producto = new ArrayList<>();
    public ArrayList<Integer> id_punto_venta = new ArrayList<>();
    public ArrayList<Integer> id__fecha = new ArrayList<>();

    //Constructor para valor de los hechos
    public LeerHechos(ParseCSV parser) {
        for (int i = 1; i < parser.data.size(); i++) {
            cantidad.add(Integer.parseInt(parser.get(i)[4]));
            valor_unitario.add(Double.parseDouble(parser.get(i)[5]));
            valor_total.add(Double.parseDouble(parser.get(i)[6]));
            costo.add(Double.parseDouble(parser.get(i)[7]));
        }
    }

    //Constructor para dimensiones
    public LeerHechos(ParseCSV parser, boolean dimension){
        for (int i = 1; i < parser.data.size(); i++) {
            id_producto.add(Integer.parseInt(parser.get(i)[1]));
            id_punto_venta.add(Integer.parseInt(parser.get(i)[2]));
            id__fecha.add(Integer.parseInt(parser.get(i)[3]));
        }
    }

    //Getters para los hechos
    public int getCantidad(int index) {
        return cantidad.get(index);
    }

    public double getValorUnitario(int index) {
        return valor_unitario.get(index);
    }

    public double getValorTotal(int index) {
        return valor_total.get(index);
    }

    public double getCosto(int index) {
        return costo.get(index);
    }

    //Getters para las dimensiones
    public int getIdProducto(int index){
        return id_producto.get(index);
    }
    
    public int getIdPuntoVenta(int index){
        return id_punto_venta.get(index);
    }

    public int getIdFecha(int index){
        return id__fecha.get(index);
    }

    public void mostrarHecho(int index){
        System.out.println("\tCantidad \t" + "Valor Unitario \t" + "Valor Total \t" + "Valor Costo \t" + "\n" +
                           index  + "\t" + cantidad.get(index) + "\t\t" + valor_unitario.get(index) + "\t\t" + valor_total.get(index) + "\t\t" + costo.get(index) + "\n");
    }


}
