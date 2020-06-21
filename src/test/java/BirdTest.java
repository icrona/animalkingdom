import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class BirdTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream systemOut = System.out;

    @BeforeEach
    void setUpStream(){
        System.setOut(new PrintStream((outContent)));
    }

    @AfterEach
    void restoreStream() {
        System.setOut(systemOut);
    }

    @Test
    void fly() {

        Bird bird = new Bird();
        bird.fly();
        assertEquals("I am flying\n", outContent.toString());
    }

    @Test
    void sing() {

        Bird bird = new Bird();
        bird.sing();
        assertEquals("I am singing\n", outContent.toString());
    }
}
