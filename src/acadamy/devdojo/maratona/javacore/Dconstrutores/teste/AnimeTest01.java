package acadamy.devdojo.maratona.javacore.Dconstrutores.teste;


import acadamy.devdojo.maratona.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece", "TV", 23, "Ação", "Mappa");
        anime.imprime();
    }
}
