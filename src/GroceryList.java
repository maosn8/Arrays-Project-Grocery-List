public class GroceryList {
    private String[] groceryNames;
    private int[] groceryQty;
    private double [] groceryPrice;
    int listNum = 0;
    public GroceryList(){
        groceryNames = new String[10];
        groceryQty = new int[10];
        groceryPrice = new double[10];
    }
    public void add(GrocerItemOrder item){
        if (listNum == 10) {
            System.out.println("List Full");
        } else {
            groceryNames[listNum] = item.getItemName();
            groceryQty[listNum] = item.getQty();
            groceryPrice[listNum] = item.getCost(item.getQty(), item.getPrice());
            listNum ++;
        }

    }
    public double sum(){
        double sum = 0;
        for (double i : groceryPrice){
            sum += i;
        }
        return sum;
    }
    public String toString(){
        String items = "";
        double sum = 0;
        for(int i = 0; i < listNum; i++){
            if(groceryNames[i] != null){
                items += "\n"+ groceryQty[i] + " " + groceryNames[i] ;
            }
        }
        sum = this.sum();
        return "Your Grocery list consists of these items:" + items + "\nat a total cost of $" + sum + ".";

    }
}
