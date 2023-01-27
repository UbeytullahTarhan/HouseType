package services;

import model.BaseModel;
import model.House;
import model.SummerHouse;
import model.VillaHouse;
import repository.BaseRepository;

import java.util.List;

public  class BaseService{

    private BaseRepository repository;

    public BaseService(List<BaseModel> houses) {
        this.repository = new BaseRepository(houses);
    }


    public List<House> getHouseList(){
        return repository.getHouseList();
    }
    public List<VillaHouse> getVillaList(){
        return repository.getVillaList();
    }
    public List<SummerHouse> getSummerHouseList(){
        return repository.getSummerHouseList();
    }
    public double getHouseTotalPrice(){
        return repository.getHouseTotalPrice();
    }
    public double getVillaTotalPrice(){
        return repository.getVillaTotalPrice();
    }
    public double getSummerHouseTotalPrice(){
        return repository.getSummerHouseTotalPrice();
    }
    public double getTotalPrice(){
        return repository.getTotalPrice();
    }

    public double getHouseAvgSquareMeters(){
        return repository.getHouseAvgSquareMeters();
    }
    public double getVillaAvgSquareMeters(){
        return repository.getVillaAvgSquareMeters();
    }
    public double getSummerHouseAvgSquareMeters(){
        return repository.getSummerHouseAvgSquareMeters();
    }
    public double getTotalAvgSquareMeters(){
        return repository.getTotalAvgSquareMeters();
    }
    public List<BaseModel> filterByRoomAndLivingRoom(int room, int livingRoom) {
        return  repository.filterByRoomAndLivingRoom(room,livingRoom);
    }

}
