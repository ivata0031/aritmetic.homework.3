package Animals;

public class Mammal {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Mammal(String name) {
        this.name = name;
    }

    protected void eats(String food){
        System.out.printf("%s eats %s  \n", name, food);
    }
}
