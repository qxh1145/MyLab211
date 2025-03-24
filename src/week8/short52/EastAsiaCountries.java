package week8.short52;

public class EastAsiaCountries extends Country{
    private String contryTerrain;

    public EastAsiaCountries(String countryCode, String countryName, float totalArea, String contryTerrain) {
        super(countryCode, countryName, totalArea);
        this.contryTerrain = contryTerrain;
    }

    public String getContryTerrain() {
        return contryTerrain;
    }

    public void setContryTerrain(String contryTerrain) {
        this.contryTerrain = contryTerrain;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%-17s", this.getContryTerrain());
    }
}
