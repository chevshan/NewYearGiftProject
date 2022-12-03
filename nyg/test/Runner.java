package by.bsu.nyg.test;

import by.bsu.nyg.entity.*;
import by.bsu.nyg.gift.Gift;
import by.bsu.nyg.typeofcandy.TypeOfCaramelCandy;
import by.bsu.nyg.typeofcandy.TypeOfChocolateCandy;
import by.bsu.nyg.typeofcandy.TypeOfLollipop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Candy> listCandy = new ArrayList<>();
        Collections.addAll(listCandy,
                new CaramelCandy("Блюз", 4, 5, TypeOfCaramelCandy.HONEY),
                new CaramelCandy("Долька Счастья", 7, 12, TypeOfCaramelCandy.LIQUEUR),
                new ChocolateCandy("Крокет", 8, 14, TypeOfChocolateCandy.BITTER),
                new ChocolateCandy("Премьер", 5, 10, TypeOfChocolateCandy.MILK),
                new Lollipop("Фантазия", 23, 25, TypeOfLollipop.WITH_STICK),
                new Lollipop("Иллюзия", 45, 50, TypeOfLollipop.WITHOUT_STICK));

        System.out.println("Sorted list of candies by their weight (descending):");
        listCandy.sort((c1, c2) -> c2.getWeight() - c1.getWeight());
        listCandy.forEach(System.out::println);

        Gift gift = new Gift(listCandy);
        int weightGift = gift.getGiftWeight();
        System.out.println("The gift is packed. Its weight was " + weightGift + "g. Happy New Year! :)\n");

        System.out.println("Enter the range to find the candy with the appropriate sugar content:");
        try {
            int firstRangeOfSugar = scanner.nextInt();
            int secondRangeOfSugar = scanner.nextInt();
            List<Candy> listCandyInRange = gift.findCandy(firstRangeOfSugar, secondRangeOfSugar);
            if (listCandyInRange.isEmpty())
                System.out.println("There are no sweets with a sugar content in the specified range");
            else {
                for (Candy candy : listCandyInRange)
                    System.out.println("Yes, there is such a candy. It's a \""
                            + candy.getName() + "\" with sugar content "
                            + candy.getCountSugar() + "g");
            }
        }
        catch (Exception e) {
            System.out.println("The sugar content in a candy can't be a symbol!");
        }
    }
}