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



    @Test
    public void simpleTest(){
        Executer ex = new Executer();
        Caller caller = new Caller(ex);
        assertEquals(caller.callExecute("Hello"," World"),"Hello World");
    }

}
