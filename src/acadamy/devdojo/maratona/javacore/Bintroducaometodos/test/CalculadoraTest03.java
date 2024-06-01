package acadamy.devdojo.maratona.javacore.Bintroducaometodos.test;

import acadamy.devdojo.maratona.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros02(20, 0);
        System.out.println(result);
        System.out.println(calculadora.divideDoisNumeros(20, 0));
        System.out.println("--------------------");
        calculadora.imprimiDivisaoDeNumeros(86,0);
    }
}
