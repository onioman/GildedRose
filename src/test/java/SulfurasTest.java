import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SulfurasTest {

    private Sulfuras item;

    @Before
    public void setUp() throws Exception {
        item = new Sulfuras();
    }

    @Test
    public void shouldNotDegrade() throws Exception {
        item.updateQuality();
        assertEquals(80, item.getQuality());
    }

    @Test
    public void shouldNeedToBeSold() throws Exception {
        item.updateQuality();
        assertEquals(0, item.getSellIn());
    }
}
