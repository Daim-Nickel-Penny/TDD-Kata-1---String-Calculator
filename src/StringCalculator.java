public class StringCalculator {
    public int Add(String numbers) {

        if (numbers.isEmpty()) return 0; //for empty string

        if (numbers.length() == 1) return Integer.parseInt(numbers); //for single number
        else {
            String splittedString[] = numbers.split(","); //for two joined numbers
            int result = Integer.parseInt(splittedString[0]) + Integer.parseInt(splittedString[1]);
            return result;
        }
    }
}
