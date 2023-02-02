import java.util.Arrays;
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

    public static List<String> getValidBrands()
    {
        return Arrays.asList("Roots","Lululemon","Club Monaco","Nike", "Puma");
    }
    public static List<String> getValidDescriptions()
    {
        return Arrays.asList("sweater","t-shirt","jeans","socks");
    }
    public static List<String> getValidColours()
    {
        return Arrays.asList("blue","white","grey","pink","black");
    }

    public void setBrand(String brand) {
        if(getValidBrands().contains(brand))
            this.brand = brand;
        else
            throw new IllegalArgumentException(brand + "must be in the list of" +
                    getValidBrands());
    }

    public void setDescription(String description) {
        if(getValidDescriptions().contains(description))
            this.description = description;
        else
            throw new IllegalArgumentException(description + "must be in the list of" +
                    getValidDescriptions());
    }
    public void setPrice(Double price) {
        if(price>0 && price<301)
            this.price = price;
        else
            throw new IllegalArgumentException(price + "must be above 0 and below 301")
    }

    public void setColour(String colour) {
        if(getValidColours().contains(colour))
            this.colour = colour;
        else
            throw new IllegalArgumentException(colour + "must be in the list of" +
                    getValidColours());
    }


}


