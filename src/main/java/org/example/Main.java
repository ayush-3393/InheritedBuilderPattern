package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Student student = Student.studentBuilder()
                .withFirstName("Ayush")
                .withLastName("Sinha")
                .withAge(99)
                .withEmail("ayush@gmail.com")
                .withBatchName("Jun2-2022")
                .withPsp(99)
                .build();

        System.out.println(student);

    }
}