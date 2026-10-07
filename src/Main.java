public class Main {

    public static void main(String[] args) {

        // Create Student object
        Student student1 = new Student();

        // Give the student information
        student1.name = "Shoaib";
        student1.age = 20;

        // Call Student method
        student1.introduce();

        // Create StudentInfo object
        StudentInfo info = new StudentInfo();

        info.showName(student1);
        info.showAge(student1);

        // Create StudentPrinter object
        StudentPrinter printer = new StudentPrinter();

        printer.printStudent(student1);

        // Create University object
        University university = new University();

        university.showUniversity();
    }
}