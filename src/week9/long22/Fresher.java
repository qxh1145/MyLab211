package week9.long22;

public class Fresher extends Candidate{

    String uni;
    int yearOfgra;
    String rankOfGra;

    public Fresher(String candidateID, String firstName, String lastName, int birthDate, String address, String phone, String email, int candidateType, String uni, int yearOfgra, String rankOfGra) {
        super(candidateID, firstName, lastName, birthDate, address, phone, email, candidateType);
        this.uni = uni;
        this.yearOfgra = yearOfgra;
        this.rankOfGra = rankOfGra;
    }

    public String getUni() {
        return uni;
    }

    public void setUni(String uni) {
        this.uni = uni;
    }

    public int getYearOfgra() {
        return yearOfgra;
    }

    public void setYearOfgra(int yearOfgra) {
        this.yearOfgra = yearOfgra;
    }

    public String getRankOfGra() {
        return rankOfGra;
    }

    public void setRankOfGra(String rankOfGra) {
        this.rankOfGra = rankOfGra;
    }

    @Override
    public String toString() {
        return super.toString() +
                "uni='" + uni + '\'' +
                ", yearOfgra=" + yearOfgra +
                ", rankOfGra='" + rankOfGra + '\'' +
                '}';
    }
}
