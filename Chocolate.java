public class Chocolate extends Product {

    private  double calories; // калорийность
    

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    
    
    public Chocolate(String brand, String name, double price, double calories){
        super(brand, name, price);
        this.calories = calories;
    }

    @Override
    public String displayInfo() {
        return String.format("Шоколад\n\t[Производитель: %s\n\tНаименование: %s\n\tСтоимость: %.2f\n\tКалорийность: %s]",
                brand, name, price, calories);
    }
    
}
