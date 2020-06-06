public class ArabicToRoman {

    public static String arabicToRoman (int input) {
        StringBuilder result = new StringBuilder();
        while (input >= 100) {
            result.append("C");
            input -= 100;
        }
        while (input >= 90) {
            result.append("XC");
            input -= 90;
        }
        while (input >= 50) {
            result.append("L");
            input -= 50;
        }
        while (input >= 40) {
            result.append("XL");
            input -= 40;
        }
        while (input >= 10) {
            result.append("X");
            input -= 10;
        }
        while (input >= 9) {
            result.append("IX");
            input -= 9;
        }
        while (input >= 5) {
            result.append("V");
            input -= 5;
        }
        while (input >= 4) {
            result.append("IV");
            input -= 4;
        }
        while (input >= 1) {
            result.append("I");
            input -= 1;
        }

        return result.toString();
    }
}
