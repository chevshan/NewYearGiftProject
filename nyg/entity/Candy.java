package by.bsu.nyg.entity;
public class Candy {
    private String name;
    private int countSugar;
    private int weight;

    public Candy(String name, int countSugar, int weight) {
        this.name = name;
        this.countSugar = countSugar;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountSugar() {
        return this.countSugar;
    }

    public void setCountSugar(int countSugar) {
        this.countSugar = countSugar;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}