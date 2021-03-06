package MainPackage.Validation.Register;

import MainPackage.Domain.Adult;
import MainPackage.Domain.Child;
import MainPackage.Domain.Register.CityRegisterResponse;
import MainPackage.Domain.Person;
import MainPackage.Exception.CityRegisterExсeption;
import MainPackage.Exception.TransportException;
import MainPackage.Validation.Register.CityRegisterChecker;

public class FakeCityRegisterChecker implements CityRegisterChecker {
    private static final String GOOD_1 = "1000";
    private static final String GOOD_2 = "2000";
    private static final String BAD_1 = "1001";
    private static final String BAD_2 = "2001";
    private static final String ERROR_1 = "1002";
    private static final String ERROR_2 = "2002";
    private static final String ERROR_T_1 = "1003";
    private static final String ERROR_T_2 = "2003";
    public CityRegisterResponse checkPerson(Person person) throws CityRegisterExсeption {
        CityRegisterResponse res = new CityRegisterResponse();
        if(person instanceof Adult){
            Adult t = (Adult) person;

            if(t.getPassportSeria().equals(GOOD_1) || t.getPassportSeria().equals(GOOD_2)){
                res.setExisting(true);
                res.setTemporal(false);
            }

            if(t.getPassportSeria().equals(BAD_1) || t.getPassportSeria().equals(BAD_2)){
                res.setExisting(false);

            }
            if(t.getPassportSeria().equals(ERROR_1) || t.getPassportSeria().equals(ERROR_2)){
                CityRegisterExсeption cre = new CityRegisterExсeption("1", "Fake ERROR");
                throw  cre;

            }
            if(t.getPassportSeria().equals(ERROR_T_1) || t.getPassportSeria().equals(ERROR_T_2)){
                TransportException tex = new TransportException("Transport ERROR");
                try {
                    throw  tex;
                } catch (TransportException e) {
                    e.printStackTrace();
                }

            }
        }
        if( person instanceof Child){
            res.setExisting(true);
            res.setTemporal(true);
        }
        System.out.println(res );
        return res;
    }

}
