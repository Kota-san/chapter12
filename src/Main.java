public class Main {
    public static void main(String[] args) {
        Hero h = new Hero();
        h.name = "勇者";
        h.attack(new Matango());
        h.attack(new Goblin());
        h.attack(new Slime());
    }
}