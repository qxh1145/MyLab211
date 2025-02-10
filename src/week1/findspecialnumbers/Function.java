package week1.findspecialnumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Function {
    Equation equation = new Equation();
    List<Float> coeList = new ArrayList<>();

    public List<Float> calculateEquation(float a, float b) {
        List<Float> result = new ArrayList<>();
        equation.setCoeA(a);
        equation.setCoeB(b);

        if (a == 0) {
            if (b == 0) {
                System.out.println("Equation has infinitely many solutions.");
            } else {
                System.out.println("Equation has no solution.");
            }
        } else {
            float x = -b / a;
            result.add(x);
        }
        return result;
    }

    public List<Float> calculateQuadraticEquation(float a, float b, float c) {
        List<Float> result = new ArrayList<>();
        equation.setCoeA(a);
        equation.setCoeB(b);
        equation.setCoeC(c);

        float delta = b * b - 4 * a * c; // Tính delta
        if (delta > 0) {
            float sqrtDelta = (float) Math.sqrt(delta); // Tính căn bậc 2 của delta
            float x1 = (-b + sqrtDelta) / (2 * a);  // Tính x1 đúng
            float x2 = (-b - sqrtDelta) / (2 * a);  // Tính x2 đúng
            result.add(x1);
            result.add(x2);
        } else if (delta == 0) {
            float x12 = -b / (2 * a);  // Nghiệm kép
            result.add(x12);
        }
        return result;
    }

    boolean isSquareNum(float x) {
        if (x < 0) {
            return false;
        }
        double sqrt = Math.sqrt(x);
        return sqrt == Math.floor(sqrt);
    }

    boolean isOdd(float x) {
        return x % 2 != 0;
    }

    public void display(List<Float> result) {
        if (result.isEmpty()) {
            System.out.println("No real solutions.");
            return;
        }

        List<Float> oddNum = new ArrayList<>();
        List<Float> evenNum = new ArrayList<>();
        List<Float> squareNum = new ArrayList<>();
        coeList.add(equation.getCoeA());
        coeList.add(equation.getCoeB());
        coeList.add(equation.getCoeC());

        for (float in : coeList) {
            if (isSquareNum(in)) {
                squareNum.add(in);
            }
            if (isOdd(in)) {
                oddNum.add(in);
            } else {
                evenNum.add(in);
            }
        }

        float x1 = result.get(0);  // Luôn có ít nhất một nghiệm
        float x2 = result.size() > 1 ? result.get(1) : Float.NaN;  // Nếu có 2 nghiệm thì gán x2, nếu không gán NaN

        for (Float num : result) {
            if (isSquareNum(num)) {
                squareNum.add(num);
            }
            if (isOdd(num)) {
                oddNum.add(num);
            } else {
                evenNum.add(num);
            }
        }

        System.out.println("Solution: x1 = " + x1 + " and x2 = " + (Float.isNaN(x2) ? "None" : x2));
        System.out.println("Odd Number(s): " + formatList(oddNum));
        System.out.println("Even Number(s): " + formatList(evenNum));
        System.out.println("Perfect Square(s): " + formatList(squareNum));
    }

    private String formatList(List<Float> list) {
        if (list.isEmpty()) {
            return "None";
        }
        return list.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(","));
    }
}