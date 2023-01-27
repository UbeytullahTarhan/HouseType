package model;

public interface BaseModel {
    public String getHouseName();
    public void setHouseName(String houseName);
    public double getPrice();

    public void setPrice(double price);

    public int getNumberOfRooms();

    public void setNumberOfRooms(int numberOfRooms);

    public int getNumberOfLivingRooms();

    public void setNumberOfLivingRooms(int numberOfLivingRooms);

    public int getArea();

    public void setArea(int area);
    public String printHouse();

    }

