/** StudentTest.java
 * This tests object equality, object identity, timeouts, disabling test and failing test
 * Andrea Jacobs 218024266
 * 16 March 2023 */

package za.ac.cput.domain;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @Test
    public void testEquality() {
        List<Student> list = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            Student s = new Student("Andrea" + 1);
            list.add(s);
        }
        assertEquals(10, list.size());
    }



}