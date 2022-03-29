package academy.devdojo.javaoneforall.javacore.exercises.association.domain;

public class Seminar {
    private String title;
    private Student[] students;
    private Place place;

    public Seminar(String title, Place place) {
        this.title = title;
        this.place = place;
    }

    public void print() {
        System.out.println("Title: " + this.title);
        System.out.println("Place: " + this.place.getAddress());

        if(students == null) return;

        for(Student student: this.students) {
            System.out.println(student.getName());
        }

        System.out.println("-------------------");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }
}
