import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class Closet {
    private ArrayList<Clothing> clothes;

    public Closet()
    {
        clothes = new ArrayList<>();
        List<String> brands = Clothing.getValidBrands();
        List<String> descriptions = Clothing.getValidDescriptions();
        List<String> colours = Clothing.getValidColours();
    }




}
