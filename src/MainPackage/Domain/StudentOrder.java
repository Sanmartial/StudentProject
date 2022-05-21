package MainPackage.Domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentOrder extends Person {
    private long studentOrderID;
    private Adult husband;
    private Adult wife;
    private List<Child> children;
    private String marriageSertificateID;
    private LocalDate marriageDate;
    private String marriageOffice;

    public StudentOrder(String surname, String givenName, String patronymic, LocalDate dataOfBirth) {
        super(surname, givenName, patronymic, dataOfBirth);
    }

    public StudentOrder() {
        super();
    }

    public String getMarriageSertificateID() {
        return marriageSertificateID;
    }

    public void setMarriageSertificateID(String marriageSertificateID) {
        this.marriageSertificateID = marriageSertificateID;
    }

    public LocalDate getMarriageDate(LocalDate of) {
        return marriageDate;
    }

    public void setMarriageDate(LocalDate marriageDate) {
        this.marriageDate = marriageDate;
    }

    public String getMarriageOffice() {
        return marriageOffice;
    }

    public void setMarriageOffice(String marriageOffice) {
        this.marriageOffice = marriageOffice;
    }

    public long getStudentOrderID() {
        return studentOrderID;
    }

    public void setStudentOrderID(long studentOrderID) {
        this.studentOrderID = studentOrderID;
    }

    public Adult getHusband() {
        return husband;
    }

    public void setHusband(Adult husband) {
        this.husband = husband;
    }

    public Adult getWife() {
        return wife;
    }

    public void setWife(Adult wife) {
        this.wife = wife;
    }
    public void addChild (Child child){
        if(children == null){
            children = new ArrayList<>();
        }
        children.add(child);
    }
    public List<Child> getChildren() {
        return children;
    }
}
