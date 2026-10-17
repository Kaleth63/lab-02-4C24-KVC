package pe.edu.tecsup.lab02;

public class StudentModel {

    private String name;
    private int age;
    private String career;

    public StudentModel(String name, int age, String career) {
        this.name = name;
        this.age = age;
        this.career = career;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCareer() {
        return career;
    }
}