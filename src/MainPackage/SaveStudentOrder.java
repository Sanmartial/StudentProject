package MainPackage;

import MainPackage.Domain.Address;
import MainPackage.Domain.Adult;
import MainPackage.Domain.Child;
import MainPackage.Domain.StudentOrder;

import java.time.LocalDate;

public class SaveStudentOrder {
    public static void main(String[] args) {
        StudentOrder so = new StudentOrder();
        buildStudentOrder(1);

        long ans = saveStudentOrder(so);
        System.out.println(ans);

    }

    static long saveStudentOrder(StudentOrder so){
        long answer = 199L;
        System.out.println("saveStudentOrder started");
    return answer;
    }

    public static StudentOrder buildStudentOrder(long ID){
        StudentOrder so = new StudentOrder();
        so.setStudentOrderID(ID);
        so.setMarriageSertificateID("" + (123456000 + ID));
        so.setMarriageDate(LocalDate.of(2016, 7, 4));
        so.setMarriageOffice("Отдел ЗАГС");

        Address address = new Address("195000", "Заневский пер.", "12", "142");

        Adult husband = new Adult("Петров", "Виктор", "Сергеевич", LocalDate.of(1997, 8, 24));
        husband.setPassportSeria("" + (1000 + ID));
        husband.setGetPassportNumber("" + (100000 + ID));
        husband.setIssueDate(LocalDate.of(2017, 9,15));
        husband.setIssueDepartment("department Police # " + ID);
        husband.setStudentID("" + (100000 + ID));
        husband.setAdress(address);

        Adult wife = new Adult("Петров", "Виктор", "Сергеевич", LocalDate.of(1997, 8, 24));
        wife.setPassportSeria("" + (2000 + ID));
        wife.setGetPassportNumber("" + (200000 + ID));
        wife.setIssueDate(LocalDate.of(2018, 4,15));
        wife.setIssueDepartment("department Police # " + ID);
        wife.setStudentID("" + (200000 + ID));
        wife.setAdress(address);

        Child child = new Child("Петрова", "Ирина", "Викторовна", LocalDate.of(2018, 6, 29));
        child.setSertificateNumber("" + (30000 + ID));
        child.setIssueDate(LocalDate.of(2018, 7, 19));
        child.setIssueDepartment("Отдел ЗАГС # " + ID);
        child.setAdress(address);

        Child child1 = new Child("Петров", "Евгений", "Викторович", LocalDate.of(2018, 6, 29));
        child1.setSertificateNumber("" + (40000 + ID));
        child1.setIssueDate(LocalDate.of(2018, 7, 19));
        child1.setIssueDepartment("Отдел ЗАГС # " + ID);
        child1.setAdress(address);

        so.setHusband(husband);
        so.setWife(wife);
        so.addChild(child);



    return so;}

}
