package fasy.intermediate;

import java.util.ArrayList;

public class A5_WareHouse {
    private String name;

    public A5_WareHouse(String name){
        setName(name);
    }

    private ArrayList<A5_Item> inventory = new ArrayList<>();

    public void setInventory(ArrayList<A5_Item> inventory) {
        this.inventory = inventory;
    }

    public ArrayList<A5_Item> getInventory() {
       return inventory;
//       return new ArrayList<>(inventory);
    }

    public void fillInventory(String name, int code, float price, int stock){
        inventory.add(new A5_Item(name, code, price, stock));
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

