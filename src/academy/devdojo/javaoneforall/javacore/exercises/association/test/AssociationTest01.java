package academy.devdojo.javaoneforall.javacore.exercises.association.test;

import academy.devdojo.javaoneforall.javacore.exercises.association.domain.Place;
import academy.devdojo.javaoneforall.javacore.exercises.association.domain.Professor;
import academy.devdojo.javaoneforall.javacore.exercises.association.domain.Seminar;
import academy.devdojo.javaoneforall.javacore.exercises.association.domain.Student;

public class AssociationTest01 {
    public static void main(String[] args) {
        Student student1 = new Student("James", 25);
        Student student2 = new Student("Samantha", 22);
        Student student3 = new Student("Will", 30);
        Student student4 = new Student("Jenniffer", 28);

        Place place = new Place("Oxford");

        Professor professor1 = new Professor("John", "Math");
        Professor professor2 = new Professor("Mary", "Biology");

        Seminar seminar1 = new Seminar("Seminar 01", place);
        Seminar seminar2 = new Seminar("Seminar 02", place);
        Seminar seminar3 = new Seminar("Seminar 03", place);

        student1.setSeminar(seminar2);
        student2.setSeminar(seminar1);
        student3.setSeminar(seminar1);
        student4.setSeminar(seminar3);

        professor1.setSeminars(new Seminar[]{seminar1, seminar2});
        professor2.setSeminars(new Seminar[]{seminar3, seminar2});

        seminar1.setStudents(new Student[]{student1,student2,student3});
        seminar2.setStudents(new Student[]{student1,student4,student3});
        seminar3.setStudents(new Student[]{student1,student2,student3, student4});

        place.print();

    }
}
