package olapcube.metricas;

import java.util.List;

public class Max extends Medida{
    public Max() {
        super("Max");
    }
    @Override
    public double calcular(List<Double> valores) {
        double max = valores.get(0);
        for (Double valor : valores) {
            if (valor > max) {
                max = valor;
            }
        }
        return max;
    }
}
