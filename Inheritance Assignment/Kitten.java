public class Kitten extends Cat {
    public Kitten (int weight, String name, int age, Boolean runs) {
        super(weight, name, age, runs);

        this.weight = weight;
        this.name = name;
        this.age = age;
        this.runs = runs;
    }
    @Override
    public int getage() {
    return 1;
    }
    
    public static void main(String[] args) {
        Kitten kitty1 = new Kitten(23, "Johnny", 3, true);
        System.out.println(kitty1);
    }
}
