package MainPackage.Domain;

import java.time.LocalDate;

public abstract class Person {
    private String surname;
    private String givenName;
    private String patronymic;
    private LocalDate dataOfBirth;
    private Address adress;

    public Person(String surname, String givenName, String patronymic, LocalDate dataOfBirth) {
        this.surname = this.surname;
        this.givenName = this.givenName;
        this.patronymic = this.patronymic;
        this.dataOfBirth = this.dataOfBirth;
    }
public Person(){}
    public String getPersonString(){
        return surname+ " " + givenName;
    }
    public Address getAdress() {
        return adress;
    }

    public void setAdress(Address adress) {
        this.adress = adress;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getDataOfBirth() {
        return dataOfBirth;
    }

    public void setDataOfBirth(LocalDate dataOfBirth) {
        this.dataOfBirth = dataOfBirth;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
