package ie.foodie.messages;

import java.util.List;

public class RestaurantsResponse {
    private final List<RestaurantData> restaurants;

    public RestaurantsResponse(List<RestaurantData> restaurants) {
        this.restaurants = restaurants;
    }

    public List<RestaurantData> getRestaurants() {
        return restaurants;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("RestaurantsResponse{");
        for (RestaurantData restaurant : restaurants) {
            sb.append("\n\t").append(restaurant.toString());
        }
        sb.append("\n}");
        return sb.toString();
    }

    public static class RestaurantData {
        private int id;
        private String name;
        private String address;
        private String description;
        private String website;

        public RestaurantData(int id, String name, String address, String description, String website) {
            this.id = id;
            this.name = name;
            this.address = address;
            this.description = description;
            this.website = website;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getAddress() {
            return address;
        }

        public String getDescription() {
            return description;
        }

        public String getWebsite() {
            return website;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void setWebsite(String website) {
            this.website = website;
        }

        @Override
        public String toString() {
            return "RestaurantData{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", address='" + address + '\'' +
                    ", description='" + description + '\'' +
                    ", website='" + website + '\'' +
                    '}';
        }
    }
}

