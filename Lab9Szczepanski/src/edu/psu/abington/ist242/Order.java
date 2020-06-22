/*
Lab 9
Pizza Shop
IST 242
Section 611
Andrew Szczepanski
 */

package edu.psu.abington.ist242;

import java.util.ArrayList;

public class Order {

    private int orderId;
    private Customer cust;
    private ArrayList<Menu> menuItem;

    public Order(int _orderId){
        this.orderId = _orderId;
    }

    public int getorderId() { return orderId; }
    public void setorderId(int _orderId) {this.orderId = _orderId;}

}
