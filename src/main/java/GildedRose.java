import java.util.ArrayList;
import java.util.List;

public class GildedRose {

    private static List<NormalItem> items = null;

    public static void main(String[] args) {

        System.out.println("OMGHAI!");

        items = new ArrayList<NormalItem>();
        items.add(new NormalItem("+5 Dexterity Vest", 10, 20));
        items.add(new NormalItem("Aged Brie", 2, 0));
        items.add(new NormalItem("Elixir of the Mongoose", 5, 7));
        items.add(new NormalItem("Sulfuras, Hand of Ragnaros", 0, 80));
        items.add(new NormalItem("Backstage passes to a TAFKAL80ETC concert", 15, 20));
        items.add(new NormalItem("Conjured Mana Cake", 3, 6));

        updateQuality();
    }

    public static void updateQuality() {
        for (NormalItem item : items) {
            item.updateQuality();
        }
    }
}
