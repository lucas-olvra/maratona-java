package acadamy.devdojo.maratona.javacore.Csobrecargametodos.teste;

import acadamy.devdojo.maratona.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akudama Drive", "TV", 23, "Ação");
        anime.imprime();
    }
}
