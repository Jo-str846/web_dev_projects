class Motorcycle extends Vehicle{

    public Motorcycle(String Brand, int Year){
        super(Brand, Year);
    }

    @Override
    public void accelarate(){
        System.out.println("Motorcycle twists the throttle to accelarate.");
    }
    @Override
    public void stop(){
        System.out.println("Motorcycle uses hand and foot brakes.");
    }
    @Override
    public void gas(){
        System.out.println("Motorcycle ");
    }
}
