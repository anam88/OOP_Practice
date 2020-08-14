package encapsulation.designs;

public class ApartmentProfile {

    private String state;
    private String city;
    private String buildingName;
    //criteria include (# of bedrooms, # of bathrooms, utilities, parking)
    private Object[][] apartmentCriteria;

    public void setState(String state){
        this.state = state;
    }
    public void setCity(String city){
        this.city = city;
    }
    public void setBuildingName(String buildingName){
        this.buildingName = buildingName;
    }
    public void setApartmentCriteria(Object[][]apartmentCriteria){
        this.apartmentCriteria = apartmentCriteria;
    }
    public String getState(){
        return state;
    }
    public String getCity(){
        return city;
    }
    public String getBuildingName(){
        return buildingName;
    }
    public Object[][] getApartmentCriteria(){
        return apartmentCriteria;
    }

}
