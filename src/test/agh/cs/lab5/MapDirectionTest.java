package agh.cs.lab5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MapDirectionTest {
    @Test
    public void toStringTest() {
        assertEquals("West=Zachód", MapDirection.West.toString(), "Zachód");
        assertEquals("East=Wschód", MapDirection.East.toString(), "Wschód");
        assertEquals("North=Północ", MapDirection.North.toString(), "Północ");
        assertEquals("South=Południe",MapDirection.South.toString(), "Ołudnie");
    }

    @Test
    public void nextTest() {
        assertEquals("Zachód na Północ", MapDirection.West.next(),MapDirection.North);
        assertEquals("Wschód na Południe", MapDirection.East.next(),MapDirection.South);
    }

    @Test
    public void previousTest() {
        assertEquals("Północ na Zachód", MapDirection.North.prev(), MapDirection.West);
        assertEquals("Południe na Wschód", MapDirection.South.prev(), MapDirection.East);
    }
}