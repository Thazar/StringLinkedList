public class Node {
    private String item = null;
    private Node next = null;
    private int count = -1;


    public void insert(String newItem) {
        if (item == null) {
            item = newItem + " ";
            count = count + 1;
        } else if (next == null) {
            next = new Node();
            next.item = newItem + " ";
            next.count = count + 1;
        } else if (next != null) {
            next.insert(newItem);
        }
    }

    public void display() {
        if (item != null) {
            System.out.print(item);
        }
        if (next != null) {
            next.display();
        } else System.out.print("\n");
    }

    public String get(int number) {
        if (count == number) {
            return item;
        } else if (next == null) {
            return "This Node is Empty";
        } else return next.get(number);
    }


}