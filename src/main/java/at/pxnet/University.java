package at.pxnet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class University {
    // Create a class "University" in the at.pxnet package.
    // It should only have the default constructor
    // The class provides three Methods:
    // * "addStudent" takes a Person as a parameter and add them as a new student to the university
    // * "removeStudent" takes a Person as a parameter and removes them from the list
    // * "getStudents" returns a List of Persons. The list must be unmodifiable
    // * "getFailingStudents" returns a List of Persons. The list must be unmodifiable
    //
    // An additional method "getAverageAge" does not take any parameters and returns the average age of the
    // students (double). If no students are enlisted in the university, "0" is returned.
    private List<Person> students = new ArrayList<>();


    public University() {
    }

    public void addStudent(Person person) {
        students.add(person);
    }

    public void removeStudent(Person person) {
        students.remove(person);
    }

    public List<Person> getStudents() {
        return Collections.unmodifiableList(students);
    }

    public List<Person> getFailingStudents() {
        List<Person> failing = new ArrayList<>();

        for (Person student : students) {
            if (Grading.isFailing(student)) {
                failing.add(student);
            }
        }
        return Collections.unmodifiableList(failing);
    }

    public double getAverageAge() {
        if (students.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (Person student : students) {
            sum += student.getAge();
        }
        return (double) sum / students.size();
    }

}
