package academy.devdojo.javaoneforall.javacore.exercises.association.domain;

public class Professor {
    private String name;
    private String researchField;
    private Seminar[] seminars;

    public Professor(String name, String researchField) {
        this.name = name;
        this.researchField = researchField;
    }

    public void print() {
        System.out.println("Name: " + this.name);
        System.out.println("Research Field: " + this.researchField);

        if(seminars == null) return;

        for (Seminar seminar: this.seminars) {
            System.out.println(seminar.getTitle());
        }

        System.out.println("-------------------");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResearchField() {
        return researchField;
    }

    public void setResearchField(String researchField) {
        this.researchField = researchField;
    }

    public Seminar[] getSeminars() {
        return seminars;
    }

    public void setSeminars(Seminar[] seminars) {
        this.seminars = seminars;
    }
}
