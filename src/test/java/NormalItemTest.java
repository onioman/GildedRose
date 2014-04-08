import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NormalItemTest {

    @Test
    public void shouldDegradeOnEveryUpdate() throws Exception {
        NormalItem item = new NormalItem("item", 10, 20);
        item.updateQuality();
        assertEquals(9, item.getSellIn());
        assertEquals(19, item.getQuality());
    }

    @Test
    public void shouldDegradeTwiceAsFastAfterSellingDate() throws Exception {
        NormalItem item = new NormalItem("item", 0, 20);
        item.updateQuality();
        assertEquals(-1, item.getSellIn());
        assertEquals(18, item.getQuality());
    }

    @Test
    public void shouldNotDegradeQualityBelowZero() throws Exception {
        NormalItem item = new NormalItem("item", 1, 0);
        item.updateQuality();
        assertEquals(0, item.getQuality());
        item.updateQuality();
        assertEquals(0, item.getQuality());
    }
}
