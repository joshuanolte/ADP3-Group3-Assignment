/*ClassRoomTest.java
 * This tests object equality, object identity, timeouts, disabling test and failing test
 * Joshua Edward Nolte 219342717
 * 17 March 2023

 */
package za.ac.cput.domain;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class ClassRoomTest {
    @Test
    public void objectEqualityTest() {
        List<ClassRoom> roomList= new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ClassRoom b = new ClassRoom("B32.5","Admin Building");
            roomList.add(b);
        }
        assertEquals(10, roomList.size());
    }
    @Test
    public void objectIdentityTest() {
        ClassRoom room = new ClassRoom("B32.5", "Admin Building");
        ClassRoom room1 = room;
        ClassRoom room2 = new ClassRoom("B4.2","Engineering Building");
        assertSame(room, room1);
        assertNotSame(room, room2);
    }
    @Test
    public void failTest() {
        ClassRoom room1 = new ClassRoom("B32.5", "Admin Building");
        ClassRoom room2 = new ClassRoom("B4.2","Engineering Building");
        assertEquals(room1, room2);
    }

    @Test
    public void timeoutTest() throws InterruptedException{
        TimeUnit.SECONDS.sleep(2);    }
    @Test
    public void disablingTest() {
        ClassRoom room1 = new ClassRoom();
        assertNotNull(room1);
    }
}