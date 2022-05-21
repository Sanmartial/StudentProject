package MainPackage.Domain;

import MainPackage.Domain.Person;

import java.time.LocalDate;

public class Child extends Person {
    private String sertificateNumber;
    private LocalDate issueDate;
    private String issueDepartment;

    public Child(){
        super();
    }

    public Child(String surname, String givenName, String patronymic, LocalDate dataOfBirth) {
        super(surname, givenName, patronymic, dataOfBirth);
    }

    public String getSertificateNumber() {
        return sertificateNumber;
    }

    public void setSertificateNumber(String sertificateNumber) {
        this.sertificateNumber = sertificateNumber;
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
