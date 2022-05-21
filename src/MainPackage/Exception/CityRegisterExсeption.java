package MainPackage.Exception;

public class CityRegisterExсeption extends Exception {

    private String code;
    public CityRegisterExсeption() {
    }

    public String getCode() {
        return code;
    }

    public CityRegisterExсeption(String code, String message)
    {
        super(message);
        this.code = code;
    }

    public CityRegisterExсeption(String code, String message, Throwable cause)
    {
        super(message, cause);
        this.code = code;
    }
}
