package acadamy.devdojo.maratona.javacore.Bintroducaometodos.test;

import acadamy.devdojo.maratona.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Jiraya");
        pessoa.setIdade(70);
//        pessoa.imprimi();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
