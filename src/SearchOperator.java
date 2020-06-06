public class SearchOperator {

    static  String [] operation = {"+", "-", "*", "/"};

    public static String searchArgOp(String data) {
        String operator = "";
        for (String op : operation) {
            if (data.contains(op)) {
                operator = op;
            }
        }
        return operator;
    }
}
