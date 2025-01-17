package week2.NormalCalculator;

public class Calculator {
    private double value;

    public Calculator(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getStatus() {
        if (value < 19) {
            return "Under-standard";
        }else if (value >= 19 && value <= 25){
            return "Standard";
        }else if (value > 25 && value <= 30){
            return "Overweight";
        }else if (value > 30 && value <= 40){
            return "Fat";
        }
        return "Veryfat";
    }
}
