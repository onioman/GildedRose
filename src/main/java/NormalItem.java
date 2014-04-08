public class NormalItem extends Item {

    public NormalItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void updateQuality() {
        if ("Backstage passes to a TAFKAL80ETC concert".equals(getName())) {
            increaseQuality();
            if (getSellIn() < 11) {
                increaseQuality();
            }
            if (getSellIn() < 6) {
                increaseQuality();
            }
        } else {
            decreaseQuality();
        }

        decreaseSellIn();

        if (getSellIn() < 0) {
            if ("Backstage passes to a TAFKAL80ETC concert".equals(getName())) {
                setQuality(0);
            }
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
