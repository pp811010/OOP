package Clothers;


import Clothers.Clothers;

public class Shirt extends Clothers{
    private String name;
    private int price;
    private String path;
    public Shirt(String name, String detail, String color, int price, String path){
        super(detail, color);
        this.name = name;
        this.price = price;
        this.path = path;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

}
