package org.example;

public class Student{
    private final User user = new User();
    private String batchName;
    private Integer psp;

    private Student(){
    }
    @Override
    public String toString() {
        return "Student{" +
                "user=" + user +
                ", batchName='" + batchName + '\'' +
                ", psp=" + psp +
                '}';
    }
    public static StudentBuilder studentBuilder(){
        return new StudentBuilder();
    }
    public static class StudentBuilder extends User{
        User user = new User();
        private String batchName;
        private Integer psp;
        public StudentBuilder withFirstName(String firstName){
            this.user.firstName = firstName;
            return this;
        }
        public StudentBuilder withLastName(String lastName){
            this.user.lastName = lastName;
            return this;
        }
        public StudentBuilder withAge(Integer age){
            this.user.age = age;
            return this;
        }
        public StudentBuilder withEmail(String email){
            this.user.email = email;
            return this;
        }
        public StudentBuilder withBatchName(String batchName){
            this.batchName = batchName;
            return this;
        }
        public StudentBuilder withPsp(Integer psp){
            this.psp = psp;
            return this;
        }
        public Student build(){
            Student student = new Student();
            student.user.firstName = this.firstName;
            student.user.lastName = this.lastName;
            student.user.age = this.age;
            student.user.email = this.email;
            student.batchName = this.batchName;
            student.psp = this.psp;
            return student;
        }
    }
}
