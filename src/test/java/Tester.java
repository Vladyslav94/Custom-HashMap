import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

public class Tester {

    @Test
    public void testAssertMap() {

        HashMapRealization<Integer, Long> hashMapRealization = new HashMapRealization<>();

        hashMapRealization.put(3, 15L);
        hashMapRealization.put(-6, 105L);
        hashMapRealization.put(32312, -70L);
        hashMapRealization.put(-455, 1050L);
        hashMapRealization.put(11, 88L);
        hashMapRealization.put(-42352352, 213123123211321312L);
        hashMapRealization.put(-6, 105L);
        hashMapRealization.put(5, null);
        try{
            hashMapRealization.put(null, null);
        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }

        //Test size
        assertThat(hashMapRealization.size(), is(7));

        //Test get (values)
        assertEquals((long)hashMapRealization.get(3), 15L);
        assertEquals((long)hashMapRealization.get(32312), -70L);
        assertEquals((long)hashMapRealization.get(-455), 1050L);
        assertEquals((long)hashMapRealization.get(11), 88L);
        assertEquals((long)hashMapRealization.get(-42352352), 213123123211321312L);
        assertEquals((long)hashMapRealization.get(-6), 105L);
        assertNull(hashMapRealization.get(5));
        assertNull(hashMapRealization.get(54234));

        //Test put (keys)
        assertTrue(hashMapRealization.contains(3));
        assertTrue(hashMapRealization.contains(32312));
        assertTrue(hashMapRealization.contains(-455));
        assertTrue(hashMapRealization.contains(11));
        assertTrue(hashMapRealization.contains(-42352352));
        assertTrue(hashMapRealization.contains(-6));

    }

}
