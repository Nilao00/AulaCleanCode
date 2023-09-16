import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class AppTest {

    @Test
    public void testGetString() {
        App app = new App();
        assertEquals(1, app.converteCartaParaInt("a"));
    }
}
