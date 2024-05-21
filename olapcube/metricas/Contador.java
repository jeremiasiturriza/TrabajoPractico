package olapcube.metricas;

import java.util.List;


public class Contador extends Medida{
    public Contador() {
        super("Contador");
    }
@Override
    public double calcular(List<Double> valores) {
        return valores.size();
    }
}
