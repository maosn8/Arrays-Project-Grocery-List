public class GrocerItemOrder {
    private String itemName;
    private int qty;
    private double price;
    public GrocerItemOrder(String itemName, int qty, double price){
        this.itemName = itemName;
        this.qty = qty;
        this.price = price;
    }
    public double getCost(int qty, double price){
        return qty*price;
    }
    public void setQty(int qty){
        this.qty = qty;
    }

    public String getItemName() {
        return itemName;
    }

    public int getQty() {
        return qty;
    }

    public double getPrice() {
        return price;
    }
}
