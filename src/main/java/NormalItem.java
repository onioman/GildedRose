public class NormalItem extends Item {

    public NormalItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void updateQuality() {
        decreaseQuality();
        decreaseSellIn();
        if (getSellIn() < 0) {
            decreaseQuality();
        }
    }

    protected void decreaseSellIn() {
        setSellIn(getSellIn() - 1);
    }

    protected void decreaseQuality() {
        if (getQuality() > 0) {
            setQuality(getQuality() - 1);
        }
    }

    protected void increaseQuality() {
        if (getQuality() < 50) {
            setQuality(getQuality() + 1);
        }
    }
}
