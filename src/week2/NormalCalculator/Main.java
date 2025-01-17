package week2.NormalCalculator;

public class Main {

    public static void main(String[] args) {
        Function function = new Function();
        while (true){
            System.out.println("========= Calculator Program =========");
            System.out.println("1. Normal Calculator");
            System.out.println("2. BMI Calculator");
            System.out.println("3. Exit");
            System.out.print("Please choice one option: ");

            int choice = Validation.getInt();

            switch (choice){
                case 1 -> {
                    function.nomarlCalculator();
                }
                case 2 -> {
                    function.bmiCalculator();
                }
                case 3 -> {
                    System.exit(0);
                }
            }
        }
    }
}
