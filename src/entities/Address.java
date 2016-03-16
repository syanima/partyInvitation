package entities;

public class Address {
    private final String city;
    private final String state;
    private final String country;

    public Address(String city,String state,String country) {
        this.country = country;
        this.state = state;
        this.city =city;
    }

    public boolean isResidentOfThisCountry(String givenCountry) {
        return this.country.equals(givenCountry);
    }

//    public String toString(){
//        return String.format("%s, %s,\n%s",city,state,country);
//    }

}