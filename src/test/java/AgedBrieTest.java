import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AgedBrieTest {

    @Test
    public void shouldImproveOverTime() throws Exception {
        NormalItem item = new AgedBrie(10, 20);
        item.updateQuality();
        assertEquals(9, item.getSellIn());
        assertEquals(21, item.getQuality());
    }

    @Test
    public void shouldImproveTwiceAsFastAfterSellingDate() throws Exception {
        NormalItem item = new AgedBrie(0, 20);
        item.updateQuality();
        assertEquals(-1, item.getSellIn());
        assertEquals(22, item.getQuality());
    }

    @Test
    public void shouldNotImproveOver50() throws Exception {
        NormalItem item = new AgedBrie(1, 50);
        item.updateQuality();
        assertEquals(50, item.getQuality());
        item.updateQuality();
        assertEquals(50, item.getQuality());
    }
}
