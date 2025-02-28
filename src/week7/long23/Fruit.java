package week7.long23;

public class Fruit {
    private String fruitID;
    private String fruitName;
    private float price;
    private int quantity;
    private String origin;

    public Fruit(String fruitID, String fruitName, float price, int quantity, String origin) {
        this.fruitID = fruitID;
        this.fruitName = fruitName;
        this.price = price;
        this.quantity = quantity;
        this.origin = origin;
    }

    public String getFruitID() {
        return fruitID;
    }

    public String getFruitName() {
        return fruitName;
    }

    public float getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getOrigin() {
        return origin;
    }

    public void setFruitID(String fruitID) {
        this.fruitID = fruitID;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String toString(){
        return String.format("%-10s | %-17s | %-17s | %-10s$ ", this.fruitID, this.fruitName, this.origin, this.price);
    }
}
