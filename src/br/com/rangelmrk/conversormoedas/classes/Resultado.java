package br.com.rangelmrk.conversormoedas.classes;

public record Resultado(double conversion_result) {
    @Override
    public String toString() {
        return "Resultado da conversão: " + conversion_result;
    }
}
