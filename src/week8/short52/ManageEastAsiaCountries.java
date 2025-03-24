package week8.short52;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Predicate;

public class ManageEastAsiaCountries {
    ArrayList<Country> countryArr = new ArrayList<>();
    public void addCountry(){
        String cID = Validation.getString("Enter country id: ");
        String cName = Validation.getString("Enter country name: ");
        float totalArea = Validation.getFloat("Enter totalArea: ", 0, Float.MAX_VALUE);
        String cTerrain = Validation.getString("Enter terrain: ");

        countryArr.add(new EastAsiaCountries(cID,cName,totalArea,cTerrain));
    }

    public void display(){
        countryArr.forEach(System.out::println);
    }

    public void search(){
        String find = Validation.getString("Enter country name you want ot find: ");
        ArrayList<Country> rs = new ArrayList<>();
        countryArr.forEach(country -> {
            if(country.getCountryName().contains(find)){
                rs.add(country);
            }
        });

        if(rs.isEmpty()){
            System.out.println("Not found");
        }else {
            rs.forEach(System.out::println);
        }
    }

    public void sort(Comparator<Country> comparator) {
        countryArr.sort(comparator);
    }


    public static void main(String[] args) {

        ManageEastAsiaCountries manageEastAsiaCountries = new ManageEastAsiaCountries();

        while (true) {
            System.out.println(" ".repeat(50) + "Menu" + " ".repeat(50));
            System.out.println("=".repeat(100));
            System.out.println("1. Input the information of 11 countries in East Asia\n" +
                    "2. Display the information of country you've just input\n" +
                    "3. Search the information of country by user-entered name\n" +
                    "4. Display the information of countries sorted name in ascending order\n" +
                    "5. Exit");
            System.out.println("=".repeat(100));
            int choice = Validation.getInt("Enter your choice: ");

            switch (choice){
                case 1 -> {
                    manageEastAsiaCountries.addCountry();
                }
                case 2 -> {
                    manageEastAsiaCountries.display();
                }
                case 3 -> {
                    manageEastAsiaCountries.search();
                }
                case 4 -> {
                    manageEastAsiaCountries.sort(Comparator.comparing(Country::getCountryName).reversed());
                    manageEastAsiaCountries.display();
                }
                case 5 ->{
                    System.exit(0);
                }
            }
        }
    }

}
