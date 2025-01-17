package week2.NormalCalculator;

public class Function {
   public enum Operator {
       add, subtract, multiply, divine, exponent, equal
   }

   public void nomarlCalculator(){
       double memory;

           System.out.println("-----Normal Calculator-----");
           double num1 = Validation.getDouble("Enter numbers1: ");
           double num2 = Validation.getDouble("Enter numbers2: ");
           String operatorStr = Validation.getString("Enter operator: ");
           Operator operator = checkOperator(operatorStr);

           if (operator == null){
               System.out.println("Invalid operator)");
               return;
           }
           memory = calculate(num1, operator, num2);
           System.out.println("Memory: "+ memory);

           while (!operatorStr.equals("=")){
               operatorStr = Validation.getString("Enter operator: ");
               if (operatorStr.equals("=")){
                   System.out.println("Result: " + memory);
                   break;
               }
               num2 = Validation.getDouble("Enter numbers: ");
               operator = checkOperator(operatorStr);

               memory = calculate(memory, operator, num2);
               System.out.printf("Memory: %.2f",memory);
           }
   }
   public void bmiCalculator(){
       System.out.println("----BMI Calculator----");
       double weight = Validation.getDouble("Enter weight: ");
       double height = Validation.getDouble("Enter height: ");

       Calculator bmi = calBMI(weight, height);
       System.out.printf("BMI number: %.2f\n",bmi.getValue());
       System.out.println("BMI status: "+ bmi.getStatus());
   }

   public double calculate(double a, Operator operator, double b){
       double result = 0.0;
       switch (operator){
           case add -> {
               result = a + b;
           }
           case subtract -> {
               result = a - b;
           }
           case multiply -> {
               result = a * b;
           }
           case divine -> {
               result = a / b;
           }
           case exponent -> {
               result = Math.pow(a,b);
           }
           default -> System.out.println("Invalid operation");
           }
           return result;

   }
    public Calculator calBMI(double weight, double height) {
       height = height / 100;
       double bmiValue = weight / (height * height);
       return new Calculator(bmiValue);
    }


        public Operator checkOperator(String operator) {
       switch (operator) {
           case "+" -> {
               return Operator.add;
           }
           case "-" ->
           {
               return Operator.subtract;
           }
           case "*" -> {
               return Operator.multiply;
           }
           case "/" -> {
               return Operator.divine;
           }
           case "^" -> {
               return Operator.exponent;
           }
           case "=" -> {
               return Operator.equal;
           }
           default -> {
               return null;
           }
       }
   }
}
