public class hungryCat extends Cat {
    public hungryCat (int weight, String name, int age, Boolean runs) {
        super(weight, name, age, runs);

        this.weight = weight;
        this.name = name;
        this.age = age;
        this.runs = runs;
    }
    @Override
    public int getweight() {
        return 30;
    }
}
