package academy.devdojo.javaoneforall.javacore.Einitializationblocks.domain;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        for (int episode : anime.getEpisodes()) {
            System.out.print(episode + " ");
        }
        ;
    }
}
