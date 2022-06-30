package tund7;
import org.junit.*;
import static org.junit.Assert.*;

public class AppTest {
    App app;
    @Before public void setUp(){app=new App();}

    @Test
    public void verifyNoExceptionThrown(){
        App.main(new String[]{});
    }

    @Test
    public void testKorruta(){
        assertEquals(6, app.korruta(2,3));
    }

    @Test
    public void testKorrutaNulliga(){
        assertEquals(0, app.korruta(0,3));
        assertEquals(0, app.korruta(2,0));
    }

    @Test
    public void testText(){
        assertNotNull(app.text(), "tekst peab olema");
    }
}