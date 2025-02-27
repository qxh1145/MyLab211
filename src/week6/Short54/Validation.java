package week6.Short54;

import java.util.Scanner;

public class Validation {
    public final static String DATE_FORMAT = "dd/MM/yyyy";
    final static Scanner scanner = new Scanner(System.in);

    public static int getInt() {
        return getInt(null, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static int getInt(int minRange, int maxRange) {
        return getInt(null, minRange, maxRange);
    }

    public static int getInt(String msg) {
        return getInt(msg, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static int getInt(String msg, int minRange, int maxRange) {
        if (minRange > maxRange) {
            int temp = minRange;
            minRange = maxRange;
            maxRange = temp;
        }

        int value = Integer.MIN_VALUE;

        do {
            try {
                if (msg != null) {
                    System.out.print(msg);
                }

                value = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Please enter again...");
            }
        } while (value < minRange || value > maxRange);
        return value;
    }

    public static float getFloat() {
        return getFloat(null, Float.MIN_VALUE, Float.MAX_VALUE);
    }

    public static float getFloat(float minRange, float maxRange) {
        return getFloat(null, minRange, maxRange);
    }

    public static float getFloat(String msg) {
        return getFloat(msg, Float.MIN_VALUE, Float.MAX_VALUE);
    }

    public static float getFloat(String msg, float minRange, float maxRange) {
        if (minRange > maxRange) {
            float temp = minRange;
            minRange = maxRange;
            maxRange = temp;
        }

        float value = Integer.MIN_VALUE;

        do {
            try {
                if (msg != null) {
                    System.out.print(msg);
                }

                value = Float.parseFloat(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Please enter again...");
            }
        } while (value < minRange || value > maxRange);
        return value;
    }

    public static String getString(String msg, String pattern) {
        String value = null;
        do {
            value = getString(msg);
        } while (!value.matches(pattern));

        return value;
    }

    public static String getString(String msg) {
        String value = null;
        while (true) {
            if (msg != null) {
                System.out.print(msg);
            }
            value = scanner.nextLine().replaceAll("\\s+", " ").trim();
            if (!value.isEmpty() && !value.isBlank()) {
                break;
            }
            System.err.println("Please enter again...");
        }
        return value;
    }

    public static String checkPhone(String msg) {
        String value = null;
        while (true) {
            System.out.print(msg); // Use print instead of println to avoid extra newline
            value = scanner.nextLine().trim();

            String[] hyphenSplit = value.split("-");
            String[] dotSplit = value.split("\\.");
            String[] spaceSplit = value.split(" ");

            if (hyphenSplit.length == 3 && hyphenSplit[0].length() == 3 && hyphenSplit[1].length() == 3 && hyphenSplit[2].length() == 4) {
                break;
            } else if (dotSplit.length == 3 && dotSplit[0].length() == 3 && dotSplit[1].length() == 3 && dotSplit[2].length() == 4) {
                break;
            } else if (spaceSplit.length == 3 && spaceSplit[0].length() == 3 && spaceSplit[1].length() == 3 && spaceSplit[2].length() == 4) {
                break;
            } else {
                System.err.println("Invalid phone number format. Please enter in XXX-XXX-XXXX, XXX.XXX.XXXX, or XXX XXX XXXX format.");
            }
        }
        return value;
    }

}
