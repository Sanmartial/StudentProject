package MainPackage.Validation;
import MainPackage.Domain.Person;
import MainPackage.Domain.Register.AnswerCityRegister;
import MainPackage.Domain.Child;
import MainPackage.Domain.Register.AnswerCityRegisterItem;
import MainPackage.Domain.Register.CityRegisterResponse;
import MainPackage.Domain.StudentOrder;
import MainPackage.Exception.CityRegisterExсeption;
import MainPackage.Exception.TransportException;
import MainPackage.Validation.Register.CityRegisterChecker;
import MainPackage.Validation.Register.FakeCityRegisterChecker;

import java.awt.desktop.SystemEventListener;
import java.util.List;

public class CityRegisterValidator {
    public String hostName;
    protected int port;
    public String login;
    public String password;
    public static  final String IN_CODE = "NO_GRN";
    private CityRegisterChecker personChecker;
    public CityRegisterValidator(){
        personChecker = new FakeCityRegisterChecker();
    }
    public AnswerCityRegister checkCityRegister(StudentOrder so){
        AnswerCityRegister ans = new AnswerCityRegister();
            ans.addItem(checkPerson(so.getHusband()));
            ans.addItem(checkPerson(so.getWife()));
            for (Child child: so.getChildren())
            {
                ans.addItem(checkPerson(child));
            }
        return ans;
    }
    private AnswerCityRegisterItem checkPerson(Person person){
        AnswerCityRegisterItem.CityStatus status = null;
        AnswerCityRegisterItem.CityError error = null;
        try {
            CityRegisterResponse tmp = personChecker.checkPerson(person);
            status = tmp.isExisting() ?
                    AnswerCityRegisterItem.CityStatus.YES:
                    AnswerCityRegisterItem.CityStatus.NO;
        }
        catch (CityRegisterExсeption ex){
            ex.printStackTrace(System.out);
            status = AnswerCityRegisterItem.CityStatus.ERROR;
            error = new AnswerCityRegisterItem.CityError(ex.getCode(), ex.getMessage());
        }
        catch (TransportException ex){
            ex.printStackTrace(System.out);
            status = AnswerCityRegisterItem.CityStatus.ERROR;
            error = new AnswerCityRegisterItem.CityError(IN_CODE, ex.getMessage());
        }
        catch (Exception ex){
            ex.printStackTrace(System.out);
            status = AnswerCityRegisterItem.CityStatus.ERROR;
            error = new AnswerCityRegisterItem.CityError(IN_CODE, ex.getMessage());
        }
        AnswerCityRegisterItem ans = new AnswerCityRegisterItem(status, person, error);

        return ans;}
}
