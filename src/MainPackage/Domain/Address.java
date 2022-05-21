package MainPackage.Domain;

public class Address {
    private String postCOde;
    private String street;
    private String building;
    private String extension;
    private String apartment;

    public Address(String postCOde, String street, String building, String apartment) {
        this.postCOde = postCOde;
        this.street = street;
        this.building = building;
        this.apartment = apartment;
    }

    public String getPostCOde() {
        return postCOde;
    }

    public void setPostCOde(String postCOde) {
        this.postCOde = postCOde;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }
}
