import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BackstagePassTest {
    @Test
    public void shouldImproveBeforeTheSellingDate() throws Exception {
        NormalItem item = new BackstagePass(20, 20);
        item.updateQuality();
        assertEquals(19, item.getSellIn());
        assertEquals(21, item.getQuality());
    }

    @Test
    public void shouldImproveTwice10DaysBeforeTheSellingDate() throws Exception {
        NormalItem item = new BackstagePass(10, 20);
        item.updateQuality();
        assertEquals(9, item.getSellIn());
        assertEquals(22, item.getQuality());
    }

    @Test
    public void shouldImproveThreefold5DaysBeforeTheSellingDate() throws Exception {
        NormalItem item = new BackstagePass(5, 20);
        item.updateQuality();
        assertEquals(4, item.getSellIn());
        assertEquals(23, item.getQuality());
    }

    @Test
    public void shouldCompletelyDegradeAfterSellingDate() throws Exception {
        NormalItem item = new BackstagePass(0, 20);
        item.updateQuality();
        assertEquals(-1, item.getSellIn());
        assertEquals(0, item.getQuality());
    }
}
