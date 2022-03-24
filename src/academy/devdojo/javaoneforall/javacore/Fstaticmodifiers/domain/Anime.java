package academy.devdojo.javaoneforall.javacore.Fstaticmodifiers.domain;

public class Anime {
    private String name;
    private static int[] episodes;

    /* Initialization order:
    *  0 - Initialization block is executed when JVM load the class
    *  1 - Memory for object is allocated
    *  2 - Variables with default or given values
    *  3 - Initialization block
    *  4 - Constructors
    * */
    static {
        System.out.println("Initialization block 1");
        episodes = new int[100];

        for(int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
    }

    static {
        System.out.println("Initialization block 2");
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {
        for(int episode: Anime.episodes) {
            System.out.print(episode + " ");
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public int[] getEpisodes() {
        return episodes;
    }
}
