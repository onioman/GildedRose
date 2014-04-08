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
            if (!"Sulfuras, Hand of Ragnaros".equals(getName())) {
                decreaseQuality();
            }
        }

        if (!"Sulfuras, Hand of Ragnaros".equals(getName())) {
            decreaseSellIn();
        }

        if (getSellIn() < 0) {
            if ("Backstage passes to a TAFKAL80ETC concert".equals(getName())) {
                setQuality(0);
            } else {
                if (!"Sulfuras, Hand of Ragnaros".equals(getName())) {
                    decreaseQuality();
                }
            }
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
