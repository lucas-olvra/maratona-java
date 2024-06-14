package acadamy.devdojo.maratona.javacore.Bintroducaometodos.dominio;

public class Pessoa {
    private String nome;
    private int idade;


    public void imprimi() {
        System.out.println(this.getNome());
        System.out.println(this.getIdade());
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Idade Inválida");
            return;
        }
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }
}
