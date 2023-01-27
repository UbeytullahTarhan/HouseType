package model;

public abstract class BaseModelHouse implements BaseModel {

    private String houseName;
    private int numberOfLivingRooms;
    private int numberOfRooms;
    private int area;
    private double price;
    public BaseModelHouse(String houseName, int numberOfLivingRooms, int numberOfRooms, int area, double price ) {

        this.houseName = houseName;
        this.numberOfLivingRooms = numberOfLivingRooms;
        this.numberOfRooms = numberOfRooms;

        this.area = area;
        this.price = price;

    }
    public String getHouseName(){
        return houseName;
    }
    public void setHouseName(String houseName){
        this.houseName=houseName;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getNumberOfLivingRooms() {
        return numberOfLivingRooms;
    }

    public void setNumberOfLivingRooms(int numberOfLivingRooms) {
        this.numberOfLivingRooms = numberOfLivingRooms;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
    public String printHouse(){
        //TO DO
        return "";
    }

}
