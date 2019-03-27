package vehicle;

public abstract class Component {
    private String model;
    private String type;

    public Component(String model, String type){
        this.model = model;
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

}
