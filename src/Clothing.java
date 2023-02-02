import java.util.List;
import java.util.ArrayList;

public class Clothing {

    private String brand;
    private String description;
    private Double price;
    private String colour;

    public Clothing (String brand, String description, Double price, String colour)
    {
        this.brand = brand;
        this.description = description;
        this.price = price;
        this.colour = colour;
    }

    public String getBrand() {
        return brand;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public void setPrice(Double price) {
    this.price = price;}

    public void setColour(String colour) {
        this.colour = colour;
    }
}


