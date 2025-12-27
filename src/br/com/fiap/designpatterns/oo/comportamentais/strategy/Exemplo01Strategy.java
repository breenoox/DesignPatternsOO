package br.com.fiap.designpatterns.oo.comportamentais.strategy;

import br.com.fiap.designpatterns.oo.comportamentais.strategy.context.NotaContext;
import br.com.fiap.designpatterns.oo.comportamentais.strategy.strategies.MediaAritmeticaStrategy;
import br.com.fiap.designpatterns.oo.comportamentais.strategy.strategies.MediaHarmonicaStrategy;
import br.com.fiap.designpatterns.oo.comportamentais.strategy.strategies.MediaPonderadaStrategy;

public class Exemplo01Strategy {
    public static void main(String[] args) {

        NotaContext context = new NotaContext();

        double[] grades = {85, 90, 78, 92, 88};

        context.setStrategy(new MediaAritmeticaStrategy());
        System.out.println("Média Aritmética: " + context.executeStrategy(grades));

        double[] weights = {0.1, 0.2, 0.3, 0.2, 0.2};
        context.setStrategy(new MediaPonderadaStrategy(weights));
        System.out.println("Média Ponderada: "  + context.executeStrategy(grades));

        context.setStrategy(new MediaHarmonicaStrategy());
        System.out.println("Média Harmonica: "  + context.executeStrategy(grades));
    }
}
