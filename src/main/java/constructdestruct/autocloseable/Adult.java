package constructdestruct.autocloseable;

public class Adult {
    public static void main(String[] args) throws Exception {
        try (Room myRoom = new Room(7)) {
            System.out.println("Hi");
        }
    }
}
