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


    public void handlerTakeNumber(){
        /*
         * This expects the numer to be input should be returned
         * */
        StringCalculator solverObj = new StringCalculator();
        assertEquals(solverObj.Add("1"),1);
    }



}
