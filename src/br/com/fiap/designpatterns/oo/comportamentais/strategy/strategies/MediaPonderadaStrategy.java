package br.com.fiap.designpatterns.oo.comportamentais.strategy.strategies;

public class MediaPonderadaStrategy implements NotaStrategy {

    private double[] weights;

    public MediaPonderadaStrategy(double[] weights) {
        this.weights = weights;
    }

    @Override
    public double calculateAverage(double[] grades) {
        double sum = 0.0;
        double weightSum = 0.0;

        for (int i = 0; i < grades.length; i++) {
            sum += grades[i] * weights[i];
            weightSum += weights[i];
        }

        return sum / weightSum;
    }
}
