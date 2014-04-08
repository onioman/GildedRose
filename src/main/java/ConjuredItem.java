public class ConjuredItem extends NormalItem {
    public ConjuredItem(String name, int sellIn, int quality) {
        super("Conjured " + name, sellIn, quality);
    }

    @Override
    protected void decreaseQuality() {
        super.decreaseQuality();
        super.decreaseQuality();
    }
}
