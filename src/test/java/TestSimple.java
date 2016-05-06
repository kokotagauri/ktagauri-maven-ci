/**
 * Created by Koko on 06.05.2016.
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import static org.mockito.Mockito.when;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class TestSimple {

    @Mock private Executer ex;
    private Caller caller;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
        caller = new Caller(ex);
    }

    @Test
    public void testUsingMock(){
        when(ex.execute("Hello ", "World")).thenReturn("Hello World");
        assertEquals(caller.callExecute("Hello ", "World"),"Hello World");
    }

    @Test
    public void simpleTest(){
        Executer ex = new Executer();
        Caller caller = new Caller(ex);
        assertEquals(caller.callExecute("Hello"," World"),"Hello World");
    }

}
