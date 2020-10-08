package problem2.models;

public class Person {

    private float budget;
    private String name;

    public Person(float budget, String name) {
        this.budget = budget;
        this.name = name;
    }

    public float getBudget() {
        return budget;
    }

    public void setBudget(float budget) {
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
