package at.pxnet;

import java.util.ArrayList;
import java.util.List;

public class Person {
    // Create a class "Person" in the at.pxnet package
    // Make sure it has a constructor to take the following parameters in order:
    // * id (string)
    // * name
    // * age (int)
    // * array of grades (int)

    // A grade can be any number from 1 to 5. If a number outside this range is passed as a grade, an
    // IllegalArgumentException should be thrown.
    //
    // Make sure the principles of data encapsulation are followed
    // A Person's id can never change
    // A person's age can change

    private final String id;
    private String name;
    private int age;
    private List<Integer> grades;

    public Person(String id, String name, int age, int[] gradesArray) {
        this.id = id;
        this.name = name;
        setAge(age);
        setGrades(gradesArray);

    }

    //Ueberpruefen ob die eingegebenen Noten zwischen 1-5 liegen
    public void setGrades(int[] gradesArray) {
        List<Integer> grades = new ArrayList<>();

        for (int grade : gradesArray) {
            if (grade < 1 || grade > 5) {
                throw new IllegalArgumentException("Note muss zwischen 1 und 5 liegen");
            }
            grades.add(grade);
        }
        this.grades = grades;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
    public int getAge() {
        return age;
    }

}
