package academy.devdojo.javaoneforall.javacore.Gassociation.test;

import academy.devdojo.javaoneforall.javacore.Gassociation.domain.School;
import academy.devdojo.javaoneforall.javacore.Gassociation.domain.Teacher;

public class SchoolTest01 {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Jiraya");
        Teacher teacher2 = new Teacher("Kakashi");
        Teacher[] teachers = {teacher1, teacher2};
        School school = new School("Konoha", teachers);

        school.print();
    }
}
