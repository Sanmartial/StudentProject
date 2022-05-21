package MainPackage;

import MainPackage.Domain.Children.AnswerChildren;
import MainPackage.Domain.Register.AnswerCityRegister;
import MainPackage.Domain.Student.AnswerStudent;
import MainPackage.Domain.Wedding.AnswerWedding;
import MainPackage.Domain.StudentOrder;
import MainPackage.Validation.ChildrenValidation;
import MainPackage.Validation.CityRegisterValidator;
import MainPackage.Validation.StudentValidation;
import MainPackage.Validation.WeddingValidation;
import MainPackage.mail.MailSender;

import java.util.ArrayList;
import java.util.List;


public class StudentOrderValidator {
    private CityRegisterValidator cityRegisterVal;
    private WeddingValidation weddingVal;
    private ChildrenValidation childrenVal;
    private StudentValidation studentVal;
    private MailSender mailSender;

    public StudentOrderValidator() {
        cityRegisterVal = new CityRegisterValidator();
        weddingVal = new WeddingValidation();
        childrenVal = new ChildrenValidation();
        studentVal = new StudentValidation();
        mailSender = new MailSender();
    }

    public static void main(String[] args) {

        StudentOrderValidator sov = new StudentOrderValidator();
        sov.checkAll();
    }

    void checkAll() {
         List <StudentOrder> soArray = readStudentOrders();

         for(int i = 0; i < soArray.size(); i++) {
             checkOneOrder(soArray.get(i));
             System.out.println(soArray.get(i));
         }
         }

    public void checkOneOrder(StudentOrder so){
        AnswerCityRegister acr = checkCityRegister(so);
        AnswerChildren ac = checkChildren(so);
        AnswerWedding aw = checkWedding(so);
        AnswerStudent as = checkStudent(so);
        sendMail(so);
    }

    public void sendMail(StudentOrder so) {
        mailSender.sendMail(so);
    }

    public List<StudentOrder> readStudentOrders() {
        List<StudentOrder> soList = new ArrayList<>();
        for(int i = 0; i < soList.size(); i++)
            soList.add(SaveStudentOrder.buildStudentOrder(i));

        return soList;
    }

    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        return cityRegisterVal.checkCityRegister(so);
    }

    public AnswerWedding checkWedding(StudentOrder so) {
        return weddingVal.checkWedding(so);
    }

    public AnswerChildren checkChildren(StudentOrder so) {
        return childrenVal.checkChildren(so);
    }

    public AnswerStudent checkStudent(StudentOrder so) {
        return studentVal.checkStudent(so);
    }
}

