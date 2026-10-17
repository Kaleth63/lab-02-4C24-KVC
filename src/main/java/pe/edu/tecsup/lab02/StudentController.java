package pe.edu.tecsup.lab02;

public class StudentController {

    private StudentModel model;
    private StudentView view;

    public StudentController(StudentModel model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void updateView() {
        view.showStudent(model.getName(), model.getAge());
    }
}