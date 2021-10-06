package lab1.task2;

public class Task2 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Aleksey K.";
        student1.age = 19;
        student1.mark = 8;

        Student student2 = new Student();
        student2.name = "Alexandr N.";
        student2.age = 20;
        student2.mark = 8;

        Student student3 = new Student();
        student3.name = "Andrey R.";
        student3.age = 20;
        student3.mark = 9;

        Student student4 = new Student();
        student4.name = "Kirill T.";
        student4.age = 19;
        student4.mark = 10;

        Student student5 = new Student();
        student5.name = "Vladimir G.";
        student5.age = 20;
        student5.mark = 10;

        Student student6 = new Student();
        student6.name = "Aleksey D.";
        student6.age = 19;
        student6.mark = 7;

        University university1 = new University();
        university1.name = "UTM";
        university1.foundationYear = 1964;
        university1.students = new Student[]{student4, student6};

        University university2 = new University();
        university2.name = "ASEM";
        university2.foundationYear = 1991;
        university2.students = new Student[]{student2, student5};

        University university3 = new University();
        university3.name = "USM";
        university3.foundationYear = 1946;
        university3.students = new Student[]{student1, student3};

        // Advanced Level Task
        double averageMedia1 = (double) (student4.mark + student6.mark) / university1.students.length;
        double averageMedia2 = (double) (student2.mark + student5.mark) / university2.students.length;
        double averageMedia3 = (double) (student1.mark + student3.mark) / university3.students.length;
        double totalAverageMedia = (averageMedia1 + averageMedia2 + averageMedia3) / 3;

        System.out.println("The average students' media in UTM is " + averageMedia1);
        System.out.println("The average students' media in ASEM is " + averageMedia2);
        System.out.println("The average students' media in USM is " + averageMedia3);
        System.out.println("The average media between 3 universities is " + totalAverageMedia);
    }
}
