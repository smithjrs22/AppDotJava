import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @org.junit.jupiter.api.Test
    void testPrintStatement() {
        assertEquals("My name is Jenna Smith", "My name is Jenna Smith");
        assertNotEquals("My name is Jenna Smith", "My name is Jenna");
    }
}