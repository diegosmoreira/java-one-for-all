package academy.devdojo.javaoneforall.javacore.IOverwriting.domain;

public class Anime {
    private String name;

    public Anime(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return this.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
