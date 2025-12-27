package br.com.fiap.designpatterns.oo.criacional.singleton.classes;

public class UseCaseA {

    public void adicionaNota() {
        MediaNotaSystem mediaNotaSystem = MediaNotaSystem.getInstance();
        mediaNotaSystem.addGrade("123", 5.0);
    }
}
