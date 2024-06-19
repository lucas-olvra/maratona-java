package acadamy.devdojo.maratona.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;
    double media = 0;

    public void imprimi(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.salarios);
        for(double salario : salarios) {
            System.out.print(salario + " ");
        }
    }

    public void imprimeMediaSalarial(){
        for (double salario : salarios){
            media += salario; // 1200, 1500, 2000
            System.out.println(media); // 1-1200, 2-1500, 3-2000 = 4700
        }
        media /= salarios.length; // 4700 / 3 = 1566,66
        System.out.println("\nMédia Salarial "+media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }
}
