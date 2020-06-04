package restaurant;

import org.w3c.dom.ls.LSOutput;

public class MenuItem {

    private String menuItemName;
    private double price;
    private String description;
    private String category;

    public String getMenuItemName() {
        return menuItemName;
    }

    public void setMenuItemName(String menuItemName) {
        this.menuItemName = menuItemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public MenuItem(String menuItemName, double price, String description, String category) {
            this.menuItemName = menuItemName;
            this.price = price;
            this.description = description;
            this.category = category;
        }
}
