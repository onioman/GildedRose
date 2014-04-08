public class NormalItem extends Item {

    public NormalItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void updateQuality() {
        if ((!"Aged Brie".equals(getName())) &&
                !"Backstage passes to a TAFKAL80ETC concert".equals(getName())) {
            if (getQuality() > 0) {
                if (!"Sulfuras, Hand of Ragnaros".equals(getName())) {
                    setQuality(getQuality() - 1);
                }
            }
        } else {
            if (getQuality() < 50) {
                setQuality(getQuality() + 1);

                if ("Backstage passes to a TAFKAL80ETC concert".equals(getName())) {
                    if (getSellIn() < 11) {
                        if (getQuality() < 50) {
                            setQuality(getQuality() + 1);
                        }
                    }

                    if (getSellIn() < 6) {
                        if (getQuality() < 50) {
                            setQuality(getQuality() + 1);
                        }
                    }
                }
            }
        }

        if (!"Sulfuras, Hand of Ragnaros".equals(getName())) {
            setSellIn(getSellIn() - 1);
        }

        if (getSellIn() < 0) {
            if (!"Aged Brie".equals(getName())) {
                if (!"Backstage passes to a TAFKAL80ETC concert".equals(getName())) {
                    if (getQuality() > 0) {
                        if (!"Sulfuras, Hand of Ragnaros".equals(getName())) {
                            setQuality(getQuality() - 1);
                        }
                    }
                } else {
                    setQuality(0);
                }
            } else {
                if (getQuality() < 50) {
                    setQuality(getQuality() + 1);
                }
            }
        }
    }
}
