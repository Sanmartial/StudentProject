package MainPackage.Domain;

import java.time.LocalDate;

public class Adult extends Person {
    private String passportSeria;
    private String passportNumber;
    private LocalDate issueDate;
    private String issueDepartment;
    private String university;
    private String studentID;

    public Adult(String surname, String givenName, String patronymic, LocalDate dataOfBirth) {
        super(surname, givenName, patronymic, dataOfBirth);
    }


    @Override
    public String getPersonString() {
        return super.getPersonString() + " " + passportNumber;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getPassportSeria() {
        return passportSeria;
    }

    public void setPassportSeria(String passportSeria) {
        this.passportSeria = passportSeria;
    }

    public String getGetPassportNumber() {
        return passportNumber;
    }

    public void setGetPassportNumber(String getPassportNumber) {
        this.passportNumber = getPassportNumber;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public String getIssueDepartment() {
        return issueDepartment;
    }

    public void setIssueDepartment(String issueDepartment) {
        this.issueDepartment = issueDepartment;
    }
}
