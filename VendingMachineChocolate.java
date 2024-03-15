import java.util.List;

public class VendingMachineChocolate {
    
    private List<Product> products;

    public VendingMachineChocolate(List<Product> products){
        this.products = products;
    }
    public Chocolate getChocolate(String name, double calories){
        for (Product product : products){
            if (product instanceof Chocolate){
                Chocolate chocolate = (Chocolate)product;
                if (chocolate.getName().equals(name) && chocolate.getCalories() == calories)
                    return chocolate;
            }
        }
        return null;
    }
    
}
