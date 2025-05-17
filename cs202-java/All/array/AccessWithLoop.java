// Accessing Array indexes with a LOOP

public class AccessWithLoop {

    String[] myArray;

    public AccessWithLoop() {
        myArray = new String[]{
            "Aloha", "World"
        };

    }

    public void displayIndexes() {
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Index " + i + " " + "stores " + myArray[i]);
        }
    }

    public static void main(String[] args) {
        AccessWithLoop obj = new AccessWithLoop();
        obj.displayIndexes();
    }
}
