public class Testing {
    public static void main(String[] args) {
        Node list = new Node();
        list.insert("Hello");
        list.insert("my");
        list.insert("little");
        list.insert("world");
        list.insert("today");
        list.display();
        System.out.print("Getted: " + list.get(5));
    }
}
