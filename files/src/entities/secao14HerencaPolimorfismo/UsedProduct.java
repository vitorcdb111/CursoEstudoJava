package entities.secao14HerencaPolimorfismo;

public class UsedProduct extends Product{
    private String manufactureDate;

    public UsedProduct() {
        super();
    }

    public UsedProduct(String name, Double price, String manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public String getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(String manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public final String priceTag()
    {
        return this.getName() + " $ " + this.getPrice() + " (Manufacture date: " + this.getManufactureDate() + ")";
    }
}
