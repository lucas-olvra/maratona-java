package acadamy.devdojo.maratona.java.introducao;

public class Aula04Operadores {

    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 20;
        double resultado = numero1 / (double) numero2;
        System.out.println(resultado);

        // %
        int resto = 20 % 2;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMaiorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezMaiorQueVinte "+isDezIgualQueVinte);
        System.out.println("isDezIgualDez "+isDezIgualDez);
        System.out.println("isDezIgualDez "+isDezDiferenteDez);

        // Operadores Logicos = && (AND) || (OR) ! (NOT)
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQue30 = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQue30 = idade < 30 && salario >= 3381;

        System.out.println(isDentroDaLeiMaiorQue30);
        System.out.println(isDentroDaLeiMenorQue30);


        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;

        System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel);

        // = += -= *= /= %=

        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        //
        int contador = 0;
        contador += 1;
        contador++;
        contador--;
        ++contador;
        --contador;

        int contador2 = 0;
        ++contador2;
        System.out.println(contador2);
    }
}
