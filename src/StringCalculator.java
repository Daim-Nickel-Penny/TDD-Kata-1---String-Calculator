public class StringCalculator {
    public int Add(String numbers) {

        if (numbers.isEmpty()) return 0; //for empty string

        if (numbers.length() == 1) return Integer.parseInt(numbers); //for single number
        else {
            int result=0;
            String splittedString[] = numbers.split(","); //for two joined numbers

            for(int i=0;i<splittedString.length;i++){
                result+=Integer.parseInt(splittedString[i]);
            }

            return result;
        }
    }
}
