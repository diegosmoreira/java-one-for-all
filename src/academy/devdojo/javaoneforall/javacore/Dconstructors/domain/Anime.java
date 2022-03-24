package academy.devdojo.javaoneforall.javacore.Dconstructors.domain;

public class Anime {
    private String name;
    private String type;
    private int episodes;
    private String gender;
    private String studio;

    /*
    * - The constructor is initialized before all methods */
    public Anime(String name, String type, int episodes, String gender) {
        /* This sintaxe is allowed in constructors only
        *  The call to a constructor must be in the first line */
        this(); // Call the constructor without arguments
        this.name = name;
        this.type = type;
        this.episodes = episodes;
        this.gender = gender;
    }

    public Anime(String name, String type, int episodes, String gender, String studio) {
        this(name, type, episodes, gender); // Call the first constructor which the arguments corresponds
        this.studio = studio;
    }

    /*
    * - Its possible to use method overloading in constructors */
    public Anime() {

    }

    public void print() {
        System.out.println(this.name);
        System.out.println(this.type);
        System.out.println(this.episodes);
        System.out.println(this.gender);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }
}
