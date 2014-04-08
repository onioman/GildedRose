public class NormalItem extends Item {

    public NormalItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void updateQuality() {
        if ("Aged Brie".equals(getName()) ||
                "Backstage passes to a TAFKAL80ETC concert".equals(getName())) {
            increaseQuality();
            if ("Backstage passes to a TAFKAL80ETC concert".equals(getName())) {
                if (getSellIn() < 11) {
                    increaseQuality();
                }

                if (getSellIn() < 6) {
                    increaseQuality();
                }
            }
        } else {
            if (!"Sulfuras, Hand of Ragnaros".equals(getName())) {
                decreaseQuality();
            }
        }

        if (!"Sulfuras, Hand of Ragnaros".equals(getName())) {
            setSellIn(getSellIn() - 1);
        }

        if (getSellIn() < 0) {
            if (!"Aged Brie".equals(getName())) {
                if (!"Backstage passes to a TAFKAL80ETC concert".equals(getName())) {
                    if (!"Sulfuras, Hand of Ragnaros".equals(getName())) {
                        decreaseQuality();
                    }
                } else {
                    setQuality(0);
                }
            } else {
                increaseQuality();
            }
        }
    }

    private void decreaseQuality() {
        if (getQuality() > 0) {
            setQuality(getQuality() - 1);
        }
    }

    private void increaseQuality() {
        if (getQuality() < 50) {
            setQuality(getQuality() + 1);
        }
    }
}
