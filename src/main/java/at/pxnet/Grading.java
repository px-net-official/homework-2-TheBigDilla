package at.pxnet;

public class Grading {
    // Create a class "Grading" in the at.pxnet package
    // Since it is a utility class, it should not expose any constructors
    //
    // This class provides a public method "isFailing" that takes a Person as a parameter. A person is failing if
    // they have at least one "5" or at least three "4" in their grades. If a person does not have at least two
    // grades, the method throws an IllegalStateException, regardless of the grades

    private Grading() {
        throw new UnsupportedOperationException("Grading is a utility class and should not be instantiated");
    }


    public static boolean isFailing(Person person) {
        if (person.getGrades().size() < 2) {
            throw new IllegalStateException("Person muss mindestens 2 Noten haben");
        }
        int grade4 = 0;
        for (int grade: person.getGrades()) {
            if (grade == 5) {
                return true;
            }
            else if (grade == 4) {
                grade4++;
                if (grade4 >= 3) {
                    return true;
                }
            }
        }
        return false;
    }
}
