package MainPackage.Domain.Register;

public class CityRegisterResponse {
    private boolean existing;
    private Boolean temporal;

    @Override
    public String toString() {
        return "CityRegisterResponse{" +
                "existing=" + existing +
                ", temporal=" + temporal +
                '}';
    }

    public boolean isExisting(){ return  existing;}
    public void setExisting (boolean existing){
        this.existing = existing;
    }
    public Boolean getTemporal (){
        return temporal;
    }

    public void setTemporal (Boolean temporal){
        this.temporal = temporal;}
}
