package MainPackage.Validation;

import MainPackage.Domain.Student.AnswerStudent;
import MainPackage.Domain.StudentOrder;

public class StudentValidation {
    public AnswerStudent checkStudent(StudentOrder so){
        System.out.println("students are check");
        return new AnswerStudent();
    }
}
