// property of FRC team 1317
// do not reproduce
public class App {
    public static final String TYPE = "Jacket";

    public static void main(String[] args) throws Exception {
        Item[] items = {
                new Item("Jacket", "Blue"),
                new Item("Jacket", "Red"),
                new Item("Shirt", "Blue"),
                new Item("Shirt", "Green"),
                new Item("Jacket", "Purple")
        };

        for (int i = 0; i < items.length; i++) {
            if (items[i].name == TYPE) {
                items[i].printInfo();
            }
        }
    }
}
