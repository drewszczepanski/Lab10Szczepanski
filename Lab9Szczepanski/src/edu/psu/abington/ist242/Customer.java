/*
Lab 9
Pizza Shop
IST 242
Section 611
Andrew Szczepanski
 */

package edu.psu.abington.ist242;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer {

    private int customerId;
    private String customerName;
    private String customerPhoneNumber;

    public Customer(int _customerId) {
        this. customerId = _customerId;  //Increments the ID count
    }

    public int getCustomerId() { return customerId; }
    public void setCustomerId(int _customerId) {this.customerId = _customerId;}

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String _customerName) {this.customerName = _customerName;}

    public String getCustomerPhoneNumber() { return customerPhoneNumber; }
    public void setCustomerPhoneNumber(String _customerPhoneNumber) {this.customerPhoneNumber = _customerPhoneNumber;}

    public static void printCustomer(ArrayList<Customer> cList){
        for (Customer cust: cList){
            System.out.println("Customer Id:" + cust.getCustomerId());
            System.out.println("Customer Name:" + cust.getCustomerName());
            System.out.println("Customer Phone:" + cust.getCustomerPhoneNumber());
        }
    }

}
