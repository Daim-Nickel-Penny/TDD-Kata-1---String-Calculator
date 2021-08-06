public class StringCalculator {
    /*Function for empty string
      This method is also called in the first test as well
     */
    public int Add(String numbers){
        int res = (numbers.isEmpty()) ?  0 : Integer.parseInt(numbers);
        return  res;
    }
}
