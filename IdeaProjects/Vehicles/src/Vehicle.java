public abstract class Vehicle {
    protected String Brand;
    protected int Year;

    public Vehicle(String Brand, int Year) {
        this.Brand = Brand;
        this.Year = Year;
    }

    public abstract void accelarate();
    public abstract void stop();
    public abstract void gas();

    public void printDetails(){
        System.out.println("Year: "+ Year + "Brand: "+ Brand);
    }
}
