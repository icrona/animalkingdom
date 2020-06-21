import com.icrona.animalkingdom.bird.Bird;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
