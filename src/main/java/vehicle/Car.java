package vehicle;

public abstract class  Car{

    private Component component;
    private String model;
    private String brand;
    private int price;
    private String color;

    public Car(String model, String brand, int price, String color, Component component){
        this.model = model;
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public Component getComponent() {
        return component;
    }

    public String addComponent(String data){
        return data + " has been added";
    }


}
