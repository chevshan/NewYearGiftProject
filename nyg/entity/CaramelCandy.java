package by.bsu.nyg.entity;

import by.bsu.nyg.typeofcandy.TypeOfCaramelCandy;

public class CaramelCandy extends Candy{
    TypeOfCaramelCandy typeOfCaramelCandy;
    public CaramelCandy(String name, int countSugar, int weight, TypeOfCaramelCandy typeOfCaramelCandy) {
        super(name, countSugar, weight);
        this.typeOfCaramelCandy = typeOfCaramelCandy;
    }

    public TypeOfCaramelCandy getTypeOfCaramelCandy() {
        return this.typeOfCaramelCandy;
    }

    public void setTypeOfCaramelCandy(TypeOfCaramelCandy typeOfCaramelCandy) {
        this.typeOfCaramelCandy = typeOfCaramelCandy;
    }

    @Override
    public String toString() {
        return  getTypeOfCaramelCandy() +" caramel candy called \""
                + getName() + "\" has a sugar content " +
                getCountSugar() + "g at weight " + getWeight() + "g";
    }
}