public class ExampleContinue {
    public static void main(String[] args) {
        String[] myStrings = {
            "//Aloha", "World", "Welcome", "//Home"
        };

        int y = 5;
        for (int i=0; i<myStrings.length; i++) {
            if (myStrings[i].startsWith("//")) {
                continue;
            }
            System.out.println(myStrings[i]);
        }
    }
}