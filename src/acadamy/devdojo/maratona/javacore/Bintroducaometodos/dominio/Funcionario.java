package acadamy.devdojo.maratona.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprimi(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.salarios);
        for(double salario : salarios) {
            System.out.print(salario + " ");
        }
    }

    public void imprimeMediaSalarial(){
        double media = 0;
        for (double salario : salarios){
            media += salario; // 1200, 1500, 2000
            System.out.println(media); // 1-1200, 2-1500, 3-2000 = 4700
        }
        media /= salarios.length; // 4700 / 3 = 1566,66
        System.out.println("\nMédia Salarial "+media);
    }
}
