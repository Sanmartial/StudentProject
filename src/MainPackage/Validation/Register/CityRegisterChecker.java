package MainPackage.Validation.Register;

import MainPackage.Domain.Register.CityRegisterResponse;
import MainPackage.Domain.Person;
import MainPackage.Exception.CityRegisterExсeption;
import MainPackage.Exception.TransportException;

public interface CityRegisterChecker {

   CityRegisterResponse checkPerson(Person person) throws CityRegisterExсeption, TransportException;

}
