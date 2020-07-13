import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

public class Tester {

    @Test
    public void testAssertMap() {

        HashMapImplementation<Integer, Long> hashMapImplementation = new HashMapImplementation<>();

        hashMapImplementation.put(3, 15L);
        hashMapImplementation.put(-6, 105L);
        hashMapImplementation.put(32312, -70L);
        hashMapImplementation.put(-455, 1050L);
        hashMapImplementation.put(11, 88L);
        hashMapImplementation.put(-42352352, 213123123211321312L);
        hashMapImplementation.put(-6, 105L);
        hashMapImplementation.put(5, 0);
        hashMapImplementation.put(0, 0);


        //Test size
        assertThat(hashMapImplementation.size(), is(7));

        //Test get (values)
        assertEquals(hashMapImplementation.get(3), 15L);
        assertEquals(hashMapImplementation.get(32312), -70L);
        assertEquals(hashMapImplementation.get(-455), 1050L);
        assertEquals(hashMapImplementation.get(11), 88L);
        assertEquals(hashMapImplementation.get(-42352352), 213123123211321312L);
        assertEquals(hashMapImplementation.get(-6), 105L);
        assertEquals(hashMapImplementation.get(5), 0);
        assertEquals(hashMapImplementation.get(54234), 0);

        //Test put (keys)
        assertTrue(hashMapImplementation.contains(3));
        assertTrue(hashMapImplementation.contains(32312));
        assertTrue(hashMapImplementation.contains(-455));
        assertTrue(hashMapImplementation.contains(11));
        assertTrue(hashMapImplementation.contains(-42352352));
        assertTrue(hashMapImplementation.contains(-6));

    }

}
