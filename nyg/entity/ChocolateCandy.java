package by.bsu.nyg.entity;

import by.bsu.nyg.typeofcandy.TypeOfChocolateCandy;

public class ChocolateCandy extends Candy{
    TypeOfChocolateCandy typeOfChocolateCandy;

    public ChocolateCandy(String name, int countSugar, int weight, TypeOfChocolateCandy typeOfChocolateCandy) {
        super(name, countSugar, weight);
        this.typeOfChocolateCandy = typeOfChocolateCandy;
    }

    public TypeOfChocolateCandy getTypeOfChocolateCandy() {
        return this.typeOfChocolateCandy;
    }

    public void setTypeOfChocolateCandy(TypeOfChocolateCandy typeOfChocolateCandy) {
        this.typeOfChocolateCandy = typeOfChocolateCandy;
    }

    @Override
    public String toString() {
        return  getTypeOfChocolateCandy() + " chocolate candy called \""
                + getName() + "\" has a sugar content " +
                getCountSugar() + "g at weight " + getWeight() + "g";
    }
}
