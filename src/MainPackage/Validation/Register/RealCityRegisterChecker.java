package MainPackage.Validation.Register;

import MainPackage.Domain.Person;
import MainPackage.Domain.Register.CityRegisterResponse;
import MainPackage.Exception.CityRegisterExсeption;
import MainPackage.Exception.TransportException;
import MainPackage.Validation.Register.CityRegisterChecker;

public class RealCityRegisterChecker implements CityRegisterChecker {
    public CityRegisterResponse checkPerson(Person person) throws CityRegisterExсeption, TransportException {

        return  null;
    }
}
