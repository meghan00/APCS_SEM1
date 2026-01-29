package pkg;
import java.util.*;

public class ShoppingCartItem {
// Global Variables //
private String itemName;
private double itemCost;
private int quantity;

// Constructors //
public ShoppingCartItem(){
    itemName = "Nothing";
    itemCost = 0.0;
    quantity = 0;
}
public ShoppingCartItem(String n, double c, int q){
    itemName = n;
    itemCost = c;
    quantity = q;
}

// Methods //
public void cartToString(){
    System.out.println("You have "+quantity+" of "+itemName+" for $"+itemCost+" each.");
}
public String getItemName(){
    return itemName;
}
public int getQuantity(){
    return quantity;
    
}
public double getTotalCost(){
    return quantity*itemCost;
}
public double getTotalWithTax(){
    return getTotalCost()*1.12;
}
public double quantityToCostCalculator(int q){
    return q*itemCost;
}
public boolean compareItemCost(ShoppingCartItem a){
    if(a.getTotalCost()>getTotalCost()){
        return true;
    }
    else{
        return false;
    }
}
}
