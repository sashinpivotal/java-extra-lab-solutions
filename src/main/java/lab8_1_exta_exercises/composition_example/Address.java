package lab8_1_exta_exercises.composition_example;

public class Address {
    private String city;
    private String country;

    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }

    public String getAddressInfo() {
        return city + " " + country;
    }
}
