package model;

public class House  extends BaseModelHouse implements BaseModel {
    public House(String houseName, int numberOfLivingRooms, int numberOfRooms, int area, int price) {
        super(houseName, numberOfLivingRooms, numberOfRooms, area, price);
    }
}
