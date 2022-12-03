package by.bsu.nyg.entity;

import by.bsu.nyg.typeofcandy.TypeOfLollipop;

public class Lollipop extends Candy {
    TypeOfLollipop typeOfLollipop;

    public Lollipop(String name, int countSugar, int weight, TypeOfLollipop typeOfLollipop) {
        super(name, countSugar, weight);
        this.typeOfLollipop = typeOfLollipop;
    }

    public TypeOfLollipop getTypeOfLollipop() {
        return this.typeOfLollipop;
    }

    public void setTypeOfLollipop(TypeOfLollipop typeOfLollipop) {
        this.typeOfLollipop = typeOfLollipop;
    }

    @Override
    public String toString() {
        return "Lollipop " + getTypeOfLollipop() + " called \""
                + getName() + "\" has a sugar content " +
                getCountSugar() + "g at weight " + getWeight() + "g";
    }
}
