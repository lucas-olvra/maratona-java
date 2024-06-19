package acadamy.devdojo.maratona.javacore.Bintroducaometodos.test;

import acadamy.devdojo.maratona.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Sanji");
        funcionario.setIdade(23);
        funcionario.setSalarios(new double[]{1200, 1500, 2000});

        funcionario.imprimi();
        System.out.println("----------");
        funcionario.imprimeMediaSalarial();
    }
}
