package by.bsu.nyg.gift;

import by.bsu.nyg.entity.Candy;

import java.util.ArrayList;
import java.util.List;

public class Gift {
    private final List<Candy> candyList;

    public Gift(List<Candy> candyList) {
        this.candyList = candyList;
    }
    public int getGiftWeight() {
        System.out.println("\nPacking a gift: ");
        int weightGift = 0;
        for (Candy candy : candyList) {
            System.out.println("packing the candy " + candy.getName());
            weightGift += candy.getWeight();
        }
        return weightGift;
    }

    public List<Candy> findCandy(int firstRangeOfSugar, int secondRangeOfSugar) {
        List<Candy> candyListOfSugar = new ArrayList<>();
        for (Candy candy : candyList) {
            if (candy.getCountSugar() >= firstRangeOfSugar && candy.getCountSugar() <= secondRangeOfSugar)
                candyListOfSugar.add(candy);
        }
        return candyListOfSugar;
    }
}
