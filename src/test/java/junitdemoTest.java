import org.junit.Test;

import static org.junit.Assert.*;

public class junitdemoTest {

    @Test
    public void removeA() {
        String actual = new junitdemo().removeA("ABCDA");
        assertEquals("BCDA",actual);
    }

}