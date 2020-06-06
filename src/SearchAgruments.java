public class SearchAgruments {

    public static String[] searchAgr(String data, String del) {
        String newData = " ";
        char[] a = del.toCharArray();
        for (char b : a) {
        //Замена делиметра
            newData = data.replace(b, '-');
         }
        String[] subStr;
        subStr = newData.split("-"); // Разделения строки str с помощью метода split()
       //сформировался массив аргументов
        return subStr;
    }
}
