package br.com.fiap.designpatterns.oo.criacional.singleton;

import br.com.fiap.designpatterns.oo.criacional.singleton.classes.MediaNotaSystem;
import br.com.fiap.designpatterns.oo.criacional.singleton.classes.UseCaseA;
import br.com.fiap.designpatterns.oo.criacional.singleton.classes.UseCaseB;

public class Exemplo01Singleton {

    public static void main(String[] args) {

        //Obtem a única instância do GradeSystem
        MediaNotaSystem mediaNotaSystem = MediaNotaSystem.getInstance();

        //Adiciona notas para alunos
        mediaNotaSystem.addGrade("123", 1.0);

        UseCaseA useCaseA = new UseCaseA();
        useCaseA.adicionaNota();

        UseCaseB useCaseB = new UseCaseB();
        useCaseB.adicionaNota();

        double average = mediaNotaSystem.getAverageGrade("123");
        System.out.println(
                "Média do aluno 123: " + average
        );

    }
}
