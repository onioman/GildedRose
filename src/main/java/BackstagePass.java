public class BackstagePass extends NormalItem {
    public BackstagePass(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert",  sellIn, quality);
    }

    @Override
    public void updateQuality() {
        increaseQuality();
        if (getSellIn() < 11) {
            increaseQuality();
        }
        if (getSellIn() < 6) {
            increaseQuality();
        }
        decreaseSellIn();
        if (getSellIn() < 0) {
            setQuality(0);
        }
    }
}
