package br.com.fiap.designpatterns.oo.criacional.singleton.classes;

public class UseCaseB {
    public void adicionaNota() {
        MediaNotaSystem mediaNotaSystem = MediaNotaSystem.getInstance();
        mediaNotaSystem.addGrade("123", 10.0);
    }
}
