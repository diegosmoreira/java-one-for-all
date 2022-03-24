package academy.devdojo.javaoneforall.javacore.Einitializationblocks.domain;

public class Anime {
    private String name;
    /* The initialization of an object occours before the constructor initialization */
    private int[] episodes;

    /* Instance initialization block is executed before the constructors and
    *  every time an object is instantiated
    *
    *  Initialization order:
    *  1 - Memory for object is allocated
    *  2 - Variables with default or given values
    *  3 - Initialization block
    *  4 - Constructors  */
    {
        episodes = new int[100];

        for(int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {
        for(int episode: this.episodes) {
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
