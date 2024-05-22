package acadamy.devdojo.maratona.java.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, float e double = 0
        // char unicode
        // boolean false
        // String null
        String[] nomes = new String[3];
        nomes[0] = "Goku";
        nomes[1] = "Zoro";
        nomes[2] = "Naruto";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
