package DAY5.brands;

public class Brands {
    private int id;
    private String brand;

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Brands{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                '}';
    }
}
