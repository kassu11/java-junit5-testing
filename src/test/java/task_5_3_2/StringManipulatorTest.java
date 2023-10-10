package task_5_3_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {

    @Test
    void concatenate() {
        StringManipulator m = new StringManipulator();
        assertEquals("HelloWorld", m.concatenate("Hello", "World"));
        assertEquals("Hello  World", m.concatenate("Hello ", " World"));
        assertEquals("a", m.concatenate("", "a"));
    }

    @Test
    void findLength() {
        StringManipulator m = new StringManipulator();
        assertEquals(6, m.findLength("teksti"));
        assertEquals(0, m.findLength(""));
        assertEquals(17, m.findLength("1 2 3 4 5 6 7 8 9"));
    }

    @Test
    void convertToUpperCase() {
        StringManipulator m = new StringManipulator();
        assertEquals("TEKSTI", m.convertToUpperCase("teksti"));
        assertEquals("", m.convertToUpperCase(""));
        assertEquals("NUMEROITA 123", m.convertToUpperCase("NUMEroita 123"));
    }

    @Test
    void convertToLowerCase() {
        StringManipulator m = new StringManipulator();
        assertEquals("teksti", m.convertToLowerCase("TEKSTI"));
        assertEquals("", m.convertToLowerCase(""));
        assertEquals("numeroita 123", m.convertToLowerCase("NUMEroita 123"));
    }

    @Test
    void containsSubstring() {
        StringManipulator m = new StringManipulator();
        assertEquals(false, m.containsSubstring("löydä tästä testistä jotain", "Löydä"));
        assertEquals(true, m.containsSubstring("löydä tästä testistä jotain", "löydä"));
        assertEquals(true, m.containsSubstring("löydä tästä testistä jotain", "tästä"));
        assertEquals(true, m.containsSubstring("löydä tästä testistä jotain", "löydä tästä testistä jotain"));
        assertEquals(false, m.containsSubstring("löydä tästä testistä jotain", "jotaiN"));
        assertEquals(true, m.containsSubstring("teksti", ""));
    }
}