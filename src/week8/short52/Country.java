package week8.short52;

public class Country {
    protected String CountryCode;
    protected String CountryName;
    protected float totalArea;

    public Country(String countryCode, String countryName, float totalArea) {
        this.CountryCode = countryCode;
        this.CountryName = countryName;
        this.totalArea = totalArea;
    }

    public Country() {

    }

    public String getCountryCode() {
        return CountryCode;
    }

    public String getCountryName() {
        return CountryName;
    }

    public float getTotalArea() {
        return totalArea;
    }

    @Override
    public String toString() {
        return String.format("%-10s | %-17s |%-10s |", this.getCountryCode(),this.getCountryName(), this.getTotalArea());
    }
}
