import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        GroceryList one = new GroceryList();
        System.out.println("How many items would you like on your grocery list?");
        int numOfItems = input.nextInt();
        String name;
        int qty;
        double cost;
        for (int i = 0; i < numOfItems; i++){
            System.out.println("What is the name of item " + (i+1) + "?");
            name = input.next();
            System.out.println("How many " + name + "s would you like?");
            qty = input.nextInt();
            System.out.println("What is the cost of each " + name + "?");
            cost = input.nextDouble();
            GrocerItemOrder items = new GrocerItemOrder(name, qty, cost);
            one.add(items);
        }
        System.out.println(one.toString());
    }
}
