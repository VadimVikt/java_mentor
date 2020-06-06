public class DataDefinition {

    private static String[]  arabicArguments = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    private static String[]  romanArguments = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    public static String argumentsType;

    public static boolean validateBothAgruments(String arg1, String arg2) {
        // Валидируем входные данные и устанавливаем глобальную переменную типа исходных данных
        String firstArgType = null;
        String secondArgType = null;
        boolean result = false;
        for (int i = 0; i < 10; i++) {
            if (arg1.equals(arabicArguments[i])) {
                firstArgType = "arabic";
            }
            if (arg2.equals(arabicArguments[i])) {
                secondArgType = "arabic";
            }
            if (arg1.equals(romanArguments[i])) {
                firstArgType = "roman";
            }
            if (arg2.equals(romanArguments[i])) {
                secondArgType = "roman";
            }
        }
        if (firstArgType.equals(secondArgType)) {
            argumentsType = firstArgType;
            result = true;
        }
        return result;
    }

    public static int dataPrerarate(String arg) {
        int c = 0;
        for (int i = 0; i <= 9; i++ ) {
            if (argumentsType.equals("roman")) {
                if (arg.equals(romanArguments[i])) {
                    c = i + 1;
                }
            } else {
                if (arg.equals(arabicArguments[i])) {
                    c = i + 1;
                }
            }
        }
        return c;
    }

}
