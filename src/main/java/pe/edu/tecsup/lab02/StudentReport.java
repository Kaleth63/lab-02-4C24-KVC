package pe.edu.tecsup.lab02;

public class StudentReport {

    public void generateReport(StudentModel student) {
        System.out.println("=== REPORTE DEL ESTUDIANTE ===");
        System.out.println("Nombre: " + student.getName());
        System.out.println("Edad: " + student.getAge());
    }
}