public class GroceryList {
    private String[] groceryNames;
    private double [] groceryPrice;
    int listNum = 0;
    public GroceryList(){
        groceryNames = new String[10];
        groceryPrice = new double[10];
    }
    public void add(GrocerItemOrder item){
        if (listNum == 10) {
            System.out.println("List Full");
        } else {
            groceryNames[listNum] = item.getItemName();
            groceryPrice[listNum] = item.getCost(item.getQty(), item.getPrice());
            listNum ++;
        }

    }
    public String toString()
}
