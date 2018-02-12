public class TestingWithLoop {
    public static void main(String[] args) {
        Node loopedList = new Node();
        for (int i = 0; i < 150; i++) {
            loopedList.insert("Empty");
        }
        loopedList.remove(50);
        for (int j = 0; j <= 150; j++) {
            System.out.println(j+ ": " +loopedList.get(j));
        }
        //loopedList.display();
    }
}
