package academy.devdojo.javaoneforall.javacore.constructors.test;

import academy.devdojo.javaoneforall.javacore.constructors.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu", "TV", 12, "Ação", "Production IG");

        anime.print();
    }
}
