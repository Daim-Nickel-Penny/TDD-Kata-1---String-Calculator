import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@Test
public class TestStringCalculator {
    public void handlerEmptyString() {
        /**
         * This will return zero if the string is empty
         */
        StringCalculator solverObj = new StringCalculator(); //creating an object of String Calculator
        assertEquals(solverObj.Add(""), 0);
    }


    public void handlerTakeNumber() {
        /*
         * This expects the number to be input should be returned
         * */
        StringCalculator solverObj = new StringCalculator();
        assertEquals(solverObj.Add("1"), 1);
    }

    public void handlerAddTwoNumbers() {
         /* This splits the input string into two number
         and then returns the addition of these two numbers
         * */
        StringCalculator solverObj = new StringCalculator();
        assertEquals(solverObj.Add("1,2"), 3);
    }

    public void handleUnknownAmountOfNumbers(){
        /*Handling an unknown amount of numbers and returning sum*/
        StringCalculator solverObj = new StringCalculator();
        assertEquals(solverObj.Add("1,2,3,4,5"), 15);
    }

    public void handlerNewLine(){
        /*Handling new lines between numbers*/
        StringCalculator solverObj = new StringCalculator();
        assertEquals(solverObj.Add("1\n2,3"), 6);
    }

}
