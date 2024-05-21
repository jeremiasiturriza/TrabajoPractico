package olapcube.metricas;

import java.util.List;

public class Promedio extends Medida{
    public Promedio() {
        super("Promedio");
    }   

    @Override
    public double calcular(List<Double> valores) {
        double suma = 0;
        for (Double valor : valores) {
            suma += valor;
        }
        
        return suma / valores.size();
    }
}
