public class Node {
    private String item = null;
    private Node next = null;
    private int count = -1;


    public void insert(String newItem) {
        if (item == null) {
            item = newItem;
            count = count + 1;
        } else if (next == null) {
            next = new Node();
            next.item = newItem;
            next.count = count + 1;
        } else
            next.insert(newItem);
    }


    public void display() {
        if (item != null) {
            System.out.print("|" + count + ": " + item + "|  ");
        }
        if (next != null) {
            next.display();
        } else System.out.print("\n");
    }

    public String get(int number) {
        if (count == number) {
            if (item != null) {
                return item;
            } else return "Error: Node number: " + number + " not Exist";
        } else if (next == null) {
            return "Error: Node number: " + number + " not Exist";
        } else return next.get(number);
    }

    public void remove(int number) {
        if (count == number) {
            if (item != null) {
                if (next != null) {
                    item = next.item;
                    next.remove(number + 1);
                } else item = null;
            }
        } else if (next != null) {
            next.remove(number);
        }


    }
}