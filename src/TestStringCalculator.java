import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
@Test
public  class TestStringCalculator{
    public void handlerEmptyString(){
        /**
         * This will return zero if the string is empty
         */
        StringCalculator solverObj = new StringCalculator(); //creating an object of String Calculator
        assertEquals(solverObj.Add(""),0);
    }



}
