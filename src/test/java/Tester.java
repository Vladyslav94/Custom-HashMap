import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

public class Tester {

    @Test
    public void testAssertMap() {

        HashMapImplementation<Integer, Long> hashMapRealization = new HashMapImplementation<>();

        hashMapRealization.put(3, 15L);
        hashMapRealization.put(-6, 105L);
        hashMapRealization.put(32312, -70L);
        hashMapRealization.put(-455, 1050L);
        hashMapRealization.put(11, 88L);
        hashMapRealization.put(-42352352, 213123123211321312L);
        hashMapRealization.put(-6, 105L);
        hashMapRealization.put(5, 0);
        hashMapRealization.put(0, 0);


        //Test size
        assertThat(hashMapRealization.size(), is(7));

        //Test get (values)
        assertEquals(hashMapRealization.get(3), 15L);
        assertEquals(hashMapRealization.get(32312), -70L);
        assertEquals(hashMapRealization.get(-455), 1050L);
        assertEquals(hashMapRealization.get(11), 88L);
        assertEquals(hashMapRealization.get(-42352352), 213123123211321312L);
        assertEquals(hashMapRealization.get(-6), 105L);
        assertEquals(hashMapRealization.get(5), 0);
        assertEquals(hashMapRealization.get(54234), 0);

        //Test put (keys)
        assertTrue(hashMapRealization.contains(3));
        assertTrue(hashMapRealization.contains(32312));
        assertTrue(hashMapRealization.contains(-455));
        assertTrue(hashMapRealization.contains(11));
        assertTrue(hashMapRealization.contains(-42352352));
        assertTrue(hashMapRealization.contains(-6));

    }

}
