package tund7;
import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class ManguTuum1Test {
    ManguTuum tuum;

    @Before public void setUp(){tuum=new ManguTuum1();}

    @Test public void testGetSuunad(){
        assertNotNull(Arrays.toString(tuum.getSuunad()), "suunad on olemas");
        assertArrayEquals(tuum.getSuunad(), new char[]{'w','a','s','d'});
    }

    @Test public void testUssiKohad(){
        int[][] koht = tuum.ussiKohad();
        assertEquals(0,koht[0][1]);
        assertEquals(0,koht[0][0]);
    }

    @Test public void testLiikumine(){
        tuum.paremale();
        tuum.samm();
        int[][] koht = tuum.ussiKohad();
        assertEquals(0,koht[0][1]);
        assertEquals(1,koht[0][0]);
        tuum.yles();
        tuum.samm();
        koht = tuum.ussiKohad();
        assertEquals(1,koht[0][1]);
        assertEquals(1,koht[0][0]);
        tuum.vasakule();
        tuum.samm();
        koht = tuum.ussiKohad();
        assertEquals(1,koht[0][1]);
        assertEquals(0,koht[0][0]);
        tuum.alla();
        tuum.samm();
        koht = tuum.ussiKohad();
        assertEquals(0,koht[0][1]);
        assertEquals(0,koht[0][0]);
    }

    @Test public void testShowScore(){
        assertEquals(0,tuum.showScore());
        assertNotNull(Integer.toString(tuum.showScore()), "score on olemas");

    }

    @Test public void testOunaleJuhuslikKoht(){
        assertNotNull(Arrays.toString(tuum.ounaleJuhuslikKoht()), "oun on olemas");
        assertNotNull(Arrays.toString(tuum.ounaleJuhuslikKoht(2, 1)), "oun on olemas");
        assertArrayEquals(tuum.ounaleJuhuslikKoht(0, 1), new int[]{0, 1});
    }
}