public class AgedBrie extends NormalItem {
    public AgedBrie(int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }

    @Override
    public void updateQuality() {
        increaseQuality();
        decreaseSellIn();
        if (getSellIn() < 0) {
            increaseQuality();
        }
    }
}
