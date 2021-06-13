
import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ru.ibs.intership.ForTest;


import java.io.*;

public class TestClass {

    protected StringBuilder sb;
    protected static ByteArrayOutputStream output;
    private static PrintStream oldOut;

    @BeforeAll
    public static void setUpStreams() {
        oldOut = System.out;
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    /*@After
    public void cleanUpStreams() {
        System.setOut(oldOut);
    }*/

    @Test
    public void testMeth() throws IOException {

        ForTest fortest = new ForTest();

        BufferedReader bufferedReader = Mockito.mock(BufferedReader.class);
        Mockito.when(bufferedReader.ready()).thenReturn(true, true, true, false);
        Mockito.when(bufferedReader.readLine()).thenReturn("2", "5", "12");
        //Mockito.when(bufferedReader.readLine()).thenReturn(true, true, true, false)

        ForTest.fizzBuzz(bufferedReader);

        String expected = "2\nBuzz\nFizz\n";
        sb = new StringBuilder().append(output.toString());

        String testResult = sb.toString();
        System.setOut(oldOut);
        System.out.println("testResult: \n" + testResult);
        Assert.assertEquals(expected, testResult);


    }
}
