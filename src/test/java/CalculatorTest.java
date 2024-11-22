import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator c = null;
    //Option 1
    CalculatorService service = new CalculatorService() {
        @Override
        public int add(int i, int j) {
            return 0;
        }
    };

    //Option 2: using Mockito
    CalculatorService calculatorService = mock(CalculatorService.class);

    @BeforeEach
    public void setUp(){
        c = new Calculator(calculatorService);
    }
    @Test
    public void testPerform(){
        when(calculatorService.add(2,3)).thenReturn(5);
        assertEquals(10,c.perform(2,3));
        //verify(calculatorService).add(2,3); //see if Mock service is being used or not
    }
}

/*
A stub is a fake object (object is an instance of a class)

If Mock service isn't used, it will throw a 'Wanted but not invoked'
 */