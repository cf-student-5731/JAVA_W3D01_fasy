package fasy.intermediate;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class A5 {

    public static void main(String[] args) {

        A5_Item[] petShopItems = new A5_Item[]{
                new A5_Item("Cat", 1100, 22.90f, 87),
                new A5_Item("Dog", 1101, 99.90f, 12),
                new A5_Item("Hamster", 1102, 54.90f, 45),
                new A5_Item("Fish", 1103, 12.90f, 157),
                new A5_Item("Bird", 1104, 66.90f, 21),
        };

        A5_Item[] toolShopItems = new A5_Item[]{
                new A5_Item("Hammer", 2200, 5.90f, 154),
                new A5_Item("Knife", 2201, 14.90f, 987),
                new A5_Item("Ladder", 2202, 55.90f, 22),
                new A5_Item("Gloves", 2203, 11.90f, 65),
        };

        A5_Item[] gunShopItems = new A5_Item[]{
                new A5_Item("Pistol", 3300, 89.90f, 215),
                new A5_Item("RailGun", 3301, 689.90f, 17),
                new A5_Item("FlameThrower", 3302, 433.90f, 9),
                new A5_Item("Bazooka", 3303, 1487.90f, 3),
                new A5_Item("Machete", 3304, 56.90f, 2414),
        };


        ArrayList<A5_WareHouse> wareHouses = new ArrayList<>();

        wareHouses.add(new A5_WareHouse("PetShop"));
        wareHouses.add(new A5_WareHouse("ToolShop"));
        wareHouses.add(new A5_WareHouse("GunShop"));

        fillWarehouse(wareHouses, petShopItems, "PetShop");
        fillWarehouse(wareHouses, toolShopItems, "ToolShop");
        fillWarehouse(wareHouses, gunShopItems, "GunShop");


        printWarehouses(wareHouses);
        String stolenItem = "";
        String warehouse;
        Scanner in = new Scanner(System.in);
            while (!stolenItem.equals("x")){
                System.out.println();
                System.out.println("STEALING MODE!!!!");
                System.out.println("x to exit!");
                System.out.print("Enter which item to STEAL? ");
                try{
                    stolenItem = in.nextLine();
                    warehouse = (stealItem(wareHouses, stolenItem));
                    printWarehouses(wareHouses);
                    System.out.println(stolenItem + " was stolen from " + warehouse);
                }
                catch(IndexOutOfBoundsException e){
                    System.out.println("Invalid input!");
                }
        }
    }

    public static void fillWarehouse(ArrayList<A5_WareHouse> wareHouses, A5_Item[] items, String name){
        int id = 0;
        for(A5_WareHouse w : wareHouses){
            if (w.getName().equals(name)){
                id = wareHouses.indexOf(w);
            }
        }
        for(A5_Item i : items){
            wareHouses.get(id).fillInventory(i.getName(), i.getCode(), i.getPrice(), i.getStock());
        }
    }

    public static void printInventory(A5_WareHouse w){
        ArrayList<A5_Item> inventory = w.getInventory();
        System.out.printf("|================================================|%n|%-20s%-28s|%n|------------------------------------------------|%n", " ", w.getName());
        System.out.printf("|%-15s   %-10s %-10s %-8s|%n|------------------------------------------------|%n", "   Product", "Code", "Price", "Stock");
        for(A5_Item i : inventory){
            System.out.printf("|   %-12s   %-7d %8.2f   %8d   |%n", i.getName() , i.getCode(), i.getPrice(), i.getStock());
        }
        System.out.printf("|================================================|%n");
    }

    public static String stealItem(ArrayList<A5_WareHouse> wareHouses, String item){
        String name = "";
        ArrayList<A5_Item> inventory;
        ArrayList<A5_Item> stolenInventory = new ArrayList<>();
        int id = 0;
        for(A5_WareHouse w : wareHouses) {
            inventory = w.getInventory();
            for(A5_Item i : inventory){
                if(i.getName().equals(item)){
                    id = inventory.indexOf(i);
                    stolenInventory = inventory;
                    name = w.getName();
                }
            }
        }
        stolenInventory.remove(id);
        return name;
    }

    public static void printWarehouses (ArrayList<A5_WareHouse> wareHouses){
        for (A5_WareHouse w : wareHouses) {
            System.out.println();
            printInventory(w);
            System.out.println();
        }
    }
}

