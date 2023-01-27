import model.BaseModel;
import model.BaseModelHouse;
import model.House;
import services.*;
import utilitys.create.CreateAllModelsList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        CreateAllModelsList create=new CreateAllModelsList();
        List<BaseModel> houses=create.listOfAllHouse;
        BaseService service=new BaseService(create.listOfAllHouse) ;






        System.out.println("*********************Total Price****************************");
        System.out.println("Total Price Of All Houses: "+ service.getHouseTotalPrice());
        System.out.println("Total Price Of All VillasHouses:  "+service.getVillaTotalPrice());
        System.out.println("Total Price Of All SummerHouse: "+ service.getSummerHouseTotalPrice());
        System.out.println("Total Price Of All   : "+service.getTotalPrice());
        System.out.println("*********************Total Price End****************************");

        System.out.println("*********************Average Square Meter****************************");
        System.out.println("Total Average Square Meter Of All Houses: "+ service.getSummerHouseAvgSquareMeters());
        System.out.println("Total Average Square Meter Of All VillasHouses:  "+service.getSummerHouseAvgSquareMeters());
        System.out.println("Total Average Square Meter Of All SummerHouses: "+ service.getVillaAvgSquareMeters());
        System.out.println("Total Average Square Meter Of All : "+ service.getTotalAvgSquareMeters());
        System.out.println("*********************Average Square Meter End****************************");
        System.out.println("*********************Filtered Houses****************************");
        printFilteredHouses(1,1,service);

        System.out.println("*********************Filtered Houses End****************************");









    }
   static void printFilteredHouses(int room,int livingRoom,BaseService service){

        for(BaseModel house:service.filterByRoomAndLivingRoom(room,livingRoom)){
            System.out.println(house.getHouseName()+" Price: "+house.getPrice()+" Square Meters: "+house.getArea());

        }




    }

}