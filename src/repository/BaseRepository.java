package repository;

import model.BaseModel;
import model.House;
import model.SummerHouse;
import model.VillaHouse;

import java.util.List;
import java.util.stream.Collectors;

public class BaseRepository  {
    List<BaseModel> houses;
    public  BaseRepository(List<BaseModel> houses){
        this.houses=houses;
    }

    public List<House> getHouseList() {
        return houses.stream()
                .filter(house -> house instanceof House)
                .map(house -> (House) house)
                .collect(Collectors.toList());

    }


    public List<VillaHouse> getVillaList() {
        return houses.stream()
                .filter(house -> house instanceof VillaHouse)
                .map(house -> (VillaHouse) house)
                .collect(Collectors.toList());
    }


    public List<SummerHouse> getSummerHouseList() {
        return houses.stream()
                .filter(house -> house instanceof SummerHouse)
                .map(house -> (SummerHouse) house)
                .collect(Collectors.toList());
    }


    public double getHouseTotalPrice() {
        return houses.stream()
                .filter(house -> house instanceof House)
                .map(house -> (House) house).mapToDouble(BaseModel::getPrice).sum();
    }


    public double getVillaTotalPrice() {
        return houses.stream()
                .filter(house -> house instanceof VillaHouse)
                .map(house -> (VillaHouse) house).mapToDouble(BaseModel::getPrice).sum();
    }


    public double getSummerHouseTotalPrice() {
        return houses.stream()
                .filter(house -> house instanceof SummerHouse)
                .map(house -> (SummerHouse) house).mapToDouble(BaseModel::getPrice).sum();
    }


    public double getTotalPrice() {
        return houses.stream().mapToDouble(BaseModel::getPrice).sum();
    }


    public double getHouseAvgSquareMeters() {
        return houses.stream()
                .filter(property -> property instanceof House)
                .map(house -> (House) house).mapToDouble(BaseModel::getArea).average().orElse(0);
    }


    public double getVillaAvgSquareMeters() {
        return houses.stream()
                .filter(house -> house instanceof VillaHouse)
                .map(house -> (VillaHouse)house).mapToDouble(BaseModel::getArea).average().orElse(0);
    }


    public double getSummerHouseAvgSquareMeters() {
        return houses.stream()
                .filter(house -> house instanceof SummerHouse)
                .map(house -> (SummerHouse)house).mapToDouble(BaseModel::getArea).average().orElse(0);
    }


    public double getTotalAvgSquareMeters() {
        return houses.stream().mapToDouble(BaseModel::getArea).average().orElse(0);
    }





    public List<BaseModel> filterByRoomAndLivingRoom(int room, int livingRoom) {
        return houses.stream().filter(x -> (int)x.getNumberOfRooms()==room && (int)x.getNumberOfLivingRooms() ==  livingRoom).toList();
    }


}
