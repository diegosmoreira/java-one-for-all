package academy.devdojo.javaoneforall.javacore.methodoverloading.test;

import academy.devdojo.javaoneforall.javacore.methodoverloading.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Akudama Drive", "TV", 12);
        anime.setGender("Ação");
        anime.print();
    }
}
