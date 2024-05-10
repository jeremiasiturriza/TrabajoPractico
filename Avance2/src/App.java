public class App {
    public static void main(String[] args) throws Exception {
        CSVparserWithHeaderRow csv = new CSVparserWithHeaderRow();
        String file = "G:\\LCD\\Algoritmos I\\TP Final/ventas.csv";
        
        csv.loadDataFromCsv(file);
        LeerHechos hechos = new LeerHechos(csv, file);
        double prueba;
        prueba = hechos.getData(5, 1);
        

        String hecho_1 = hechos.getHeader(1);

        System.out.println(hecho_1 + " " + prueba);
        //hechos.imprimirData();
    }
}
