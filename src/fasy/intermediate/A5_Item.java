package fasy.intermediate;

public class A5_Item{
    private String name;
    private int code;
    private float price;
    private int stock;

    public A5_Item(String name, int code, float price, int stock) {
        setName(name);
        setCode(code);
        setPrice(price);
        setStock(stock);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}