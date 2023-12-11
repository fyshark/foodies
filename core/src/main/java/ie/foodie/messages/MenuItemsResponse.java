package ie.foodie.messages;

import java.util.List;

public class MenuItemsResponse {
    private final List<MenuItemData> menuItems;

    public MenuItemsResponse(List<MenuItemData> menuItems) {
        this.menuItems = menuItems;
    }

    public List<MenuItemData> getMenuItems() {
        return menuItems;
    }

    @Override
    public String toString() {
        StringBuilder menuItemsString = new StringBuilder("MenuItemsResponse{\n");
        for (MenuItemData item : menuItems) {
            menuItemsString.append(item.toString()).append("\n");
        }
        menuItemsString.append("}");
        return menuItemsString.toString();
    }

    public static class MenuItemData {
        private int itemId;
        private String itemName;
        private double price;

        private String description;

        public MenuItemData(int itemId, String itemName, double price, String description) {
            this.itemId = itemId;
            this.itemName = itemName;
            this.price = price;
            this.description = description;
        }

        public int getItemId(){
            return itemId;
        }

        public String getItemName(){
            return itemName;
        }

        public double getPrice(){
            return price;
        }

        public String getDescription(){
            return description;
        }
        public void setItemId(int id){
            this.itemId = id;
        }

        public void setItemName(String name){
            this.itemName = name;
        }

        public void setPrice(double price){
            this.price = price;
        }

        public void setDescription(String description){
            this.description = description;
        }

        @Override
        public String toString() {
            return "MenuItemData{" +
                    "Id=" + itemId +
                    ", name='" + itemName + '\'' +
                    ", description='" + description + '\'' +
                    ", price='" + price + '\'' +
                    '}';
        }
    }
}
