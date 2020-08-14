package encapsulation.designs;

public class FamilyProfile {

    private String name;
    private int age;
    private String email;
    private String address;

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getName(){
         return name;
    }
    public int getAge(){
        return age;
    }
    public String getEmail(){
        return email;
    }
    public String getAddress(){
        return address;
    }

}
