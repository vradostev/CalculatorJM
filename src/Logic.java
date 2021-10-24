public class Logic {

    public static void logic(String firstNum, String secondNum, char operator) {
        int first = 0;
        int second = 0;
        int result = 0;

        boolean isRoman = false;
        try {
            first = Integer.parseInt(firstNum);
            second = Integer.parseInt(secondNum);
        } catch (Exception e) {
            try {
                first = RomanToInteger.romanToInt(firstNum);
                second = RomanToInteger.romanToInt(secondNum);
                isRoman = true;
            } catch (Exception e1) {
                System.out.println("Вы ввели не верные данные");
            }
        }
        if (first < 1 || second > 10 || first > 10 || second < 1) {
            throw new IllegalArgumentException("Числа должны быть от 1 до 10");
        }

        result = Calculate.calc(first,second,operator);
        if (isRoman) {
            String resultRoman = IntegerToRoman.roman(result);
            System.out.println(resultRoman);
        }else{
            System.out.println(result);
        }

        }

}

