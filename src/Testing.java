public class Testing {
    public static void main(String[] args) {
        Node list = new Node();
        list.insert("Hello");
        list.insert("my");
        list.insert("little");
        list.insert("world");
        list.insert("today");
        list.insert("in");
        list.insert("this");
        list.insert("incredible");
        list.insert("universe");
        list.remove(4);
        list.display();
        System.out.print(list.get(5));
        System.out.print("\n" + list.get(3));
    }
}
