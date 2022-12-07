public class Item {
    public String name;
    public String color;

    public Item(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void printInfo() {
        System.out.println(this.name + " " + this.color);
    }

}
