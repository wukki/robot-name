import java.util.Random;

public class Robot {

    private String name;

    public Robot() { this.name = setName(); }

    public String getName() {
        return this.name;
    }

    public void reset() {
        this.name = setName();
    }

    private String setName() {
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 2; i++) sb.append(Character.toChars('A' + rnd.nextInt('Z' - 'A')));
        for (int i = 0; i < 3; i++) sb.append(rnd.nextInt(9));
        return sb.toString();
    }
}
