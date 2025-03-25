// Example usage
public class Ass20 {
    public static void main(String[] args) {
        Playable football = new Football();
        Playable volleyball = new Volleyball();
        Playable basketball = new Basketball();

        football.play();
        volleyball.play();
        basketball.play();
    }
}
// Define the interface
interface Playable {
    void play();
}

// Implement the interface in the Football class
class Football implements Playable {
    public void play() {
        System.out.println("Playing Football");
    }
}

// Implement the interface in the Volleyball class
class Volleyball implements Playable {
    public void play() {
        System.out.println("Playing Volleyball");
    }
}

// Implement the interface in the Basketball class
class Basketball implements Playable {
    public void play() {
        System.out.println("Playing Basketball");
    }
}
