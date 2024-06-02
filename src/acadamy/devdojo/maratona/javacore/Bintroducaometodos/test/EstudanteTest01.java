package acadamy.devdojo.maratona.javacore.Bintroducaometodos.test;

import acadamy.devdojo.maratona.javacore.Bintroducaometodos.dominio.Estudante;
import acadamy.devdojo.maratona.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();

        estudante01.nome = "Midorya";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Sakura";
        estudante02.idade = 16;
        estudante02.sexo = 'F';

        impressoraEstudante.imprimi(estudante01);
        impressoraEstudante.imprimi(estudante02);

        System.out.println("#################");
        impressoraEstudante.imprimi(estudante01);
        impressoraEstudante.imprimi(estudante02);
    }
}
