import java.util.Map;

public class Converter {
    String firstNum;
    String secondNum;
    public Converter(String firstNum,String secondNum){
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }



    public static int romanToInt(String roman) {
        final Map<Character, Integer> map = Map.of('I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000);

        int result = 0;
        for (int index = 0; index < roman.length(); index++) {
            final int curNumber = map.get(roman.charAt(index));

            if (index > 0 && curNumber > map.get(roman.charAt(index - 1))) {

                result += curNumber - 2 * map.get(roman.charAt(index - 1));
            } else {
                result += curNumber;
            }
        }
        System.out.printf( roman, result);
        return result;
    }


}
