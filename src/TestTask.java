public class TestTask {
    public static void main(String[] args) {
        System.out.println("Тестовый калькулятор");
        //Получаем данные из консоли
        InputData arguments = new InputData();
        String data = InputData.readStringArgument("Введите данные");
        //Получаем оператор (если введен неправильно вернется пустая строка)
        SearchOperator dataArray = new SearchOperator();
        String operator = dataArray.searchArgOp(data);
        //Проверяем оператор на валидность
        if (!operator.equals("")) {
            //Получаем аргументы
            SearchAgruments myArguments = new SearchAgruments();
            String [] arrArg = myArguments.searchAgr(data, operator);
            String argument1 = arrArg[0];
            String argument2 = arrArg[1];
            DataDefinition calcData = new DataDefinition();
            //Проверяем валидность аргументов
            if (DataDefinition.validateBothAgruments(argument1, argument2)) {
                int newArg1 =  DataDefinition.dataPrerarate(argument1);
                int newAgr2 = DataDefinition.dataPrerarate(argument2);
                String typeArg = calcData.argumentsType;
                Calculator calc = new Calculator();
                int result = calc.calculate(newArg1, newAgr2, operator);
                //Если введены римские цифры
                if (typeArg.equals("roman")) {
                    ArabicToRoman res = new ArabicToRoman();
                    String romanRes = ArabicToRoman.arabicToRoman(result);
                    System.out.println(romanRes);
                } else {
                //Если введены арабские цифры
                    System.out.println(result);
                }
            } else {
                System.err.println("Аргументы должны быть или римские или таки арабские ");
            }
        } else {
            System.err.println("Вы таки что-то не то ввели ");
        }
    }
}
