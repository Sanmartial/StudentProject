package MainPackage.Domain.Register;


import MainPackage.Domain.Person;

public class AnswerCityRegisterItem
{
    private Person person;
    private CityStatus status;
    private CityError error;

    public AnswerCityRegisterItem(CityStatus status, Person person, CityError error) {
    }


    public enum CityStatus{
        YES, NO, ERROR;
    }
    public static class CityError{
        private String code;
        private String text;

        public CityError (String code, String text){
            this.code = code;
            this.text = text;
        }

        public String getCode() {
            return code;
        }

        public String getText() {
            return text;
        }
    }

    public Person getPerson() {
        return person;
    }

    public CityStatus getStatus() {
        return status;
    }

    public CityError getError() {
        return error;
    }

    public AnswerCityRegisterItem(Person person, CityStatus status, CityError error) {
        this.person = person;
        this.status = status;
        this.error = error;
    }

    public AnswerCityRegisterItem(Person person, CityStatus status) {
        this.person = person;
        this.status = status;
    }
}
