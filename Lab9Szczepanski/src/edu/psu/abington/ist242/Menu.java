/*
Lab 9
Pizza Shop
IST 242
Section 611
Andrew Szczepanski
 */

package edu.psu.abington.ist242;

import java.util.ArrayList;

public class Menu {


    private int menuId;
    private String menuItem;


    public Menu(int _menuId, String _menuItem){
        this.menuId = _menuId;
        this.menuItem = _menuItem;
    }

    public int getmenuId() { return menuId; }
    public void setmenuId(int _menuId) {this.menuId = _menuId;}

    public String getmenuItem() { return menuItem; }
    public void setmenuItem(String _menuItem) {this.menuItem = _menuItem;}

    public static void listMenu(ArrayList<Menu> mList){
        for (Menu menu: mList){
            System.out.println(menu.getmenuItem());
        }
    }
}
