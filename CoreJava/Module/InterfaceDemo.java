// Define the interface Playable
interface Playable {
    void play();  // method signature, no body
}

// Guitar class implements Playable interface
class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("Strumming the guitar 🎸");
    }
}

// Piano class implements Playable interface
class Piano implements Playable {
    @Override
    public void play() {
        System.out.println("Playing the piano 🎹");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        // Create instances of Guitar and Piano
        Playable guitar = new Guitar();
        Playable piano = new Piano();

        // Call their play methods
        guitar.play();
        piano.play();
    }
}
