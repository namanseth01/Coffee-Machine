package machine;

import java.util.Scanner;

public class CoffeeMachine {
     public static void main(String[] args) {
        
        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            choiceOfAction = scannerObject.nextLine();
            System.out.println();
            switch (choiceOfAction) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                    String choice = scannerObject.nextLine();
                    switch (choice) {
                        case "1":
                            if (quantityOfWater >= 250) {
                                if (quantityOfCoffeeBeans >= 16) {
                                    quantityOfWater -= 250;
                                    quantityOfCoffeeBeans -= 16;
                                    howMuchMoney += 4;
                                    quantityOfDisposableCups -= 1;
                                    System.out.println("I have enough resources, making you a coffee!");
                                } else {
                                    System.out.println("Sorry, not enough coffee beans!");
                                }
                            } else {
                                System.out.println("Sorry, not enough water!");
                            }
                            System.out.println();
                            break;
                        case "2":
                            if (quantityOfWater >= 350) {
                                if (quantityOfMilk >= 75) {
                                    if (quantityOfCoffeeBeans >= 20) {
                                        quantityOfWater -= 350;
                                        quantityOfMilk -= 75;
                                        quantityOfCoffeeBeans -= 20;
                                        howMuchMoney += 7;
                                        quantityOfDisposableCups -= 1;
                                        System.out.println("I have enough resources, making you a coffee!");
                                    } else {
                                        System.out.println("Sorry, not enough coffee beans!");
                                    }
                                } else {
                                    System.out.println("Sorry, not enough milk!");
                                }
                            } else {
                                System.out.println("Sorry, not enough water!");
                            }
                            System.out.println();
                            break;
                        case "3":
                            if (quantityOfWater >= 200) {
                                if (quantityOfMilk >= 100) {
                                    if (quantityOfCoffeeBeans >= 12) {
                                        quantityOfWater -= 200;
                                        quantityOfMilk -= 100;
                                        quantityOfCoffeeBeans -= 12;
                                        howMuchMoney += 6;
                                        quantityOfDisposableCups -= 1;
                                        System.out.println("I have enough resources, making you a coffee!");
                                    } else {
                                        System.out.println("Sorry, not enough coffee beans!");
                                    }
                                } else {
                                    System.out.println("Sorry, not enough milk!");
                                }
                            } else {
                                System.out.println("Sorry, not enough water!");
                            }
                            System.out.println();
                            break;
                        case "back":
                            continue;
                    }
                    break;
                case "fill":
                    System.out.println("Write how many ml of water you want to add:");
                    int quantityOfAddingWater = scannerObject.nextInt();
                    System.out.println("Write how many ml of milk do you want to add:");
                    int quantityOfAddingMilk = scannerObject.nextInt();
                    System.out.println("Write how many grams of coffee beans do you want to add:");
                    int quantityOfAddingCoffeeBeans = scannerObject.nextInt();
                    System.out.println("Write how many disposable cups do you want to add:");
                    int quantityOfAddingDisposableCups = scannerObject.nextInt();
                    quantityOfWater += quantityOfAddingWater;
                    quantityOfMilk += quantityOfAddingMilk;
                    quantityOfCoffeeBeans += quantityOfAddingCoffeeBeans;
                    quantityOfDisposableCups += quantityOfAddingDisposableCups;
                    System.out.println();
                    break;
                case "take":
                    System.out.println("I gave you $" + howMuchMoney);
                    howMuchMoney = 0;
                     System.out.println();
                    break;
                case "remaining":
                    System.out.println("The coffee machine has:");
                    System.out.println((quantityOfWater) + " of water");
                    System.out.println((quantityOfMilk) + " of milk");
                    System.out.println((quantityOfCoffeeBeans) + " of coffee beans");
                    System.out.println((quantityOfDisposableCups) + " of disposable cups");
                    System.out.println("$" + howMuchMoney + " of money");
                    System.out.println();
                    break;
                case "exit":
                    break level1;
            }
        }
    }
}
