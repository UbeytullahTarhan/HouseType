package utilitys.create;

import model.BaseModel;
import model.House;
import model.SummerHouse;
import model.VillaHouse;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreateAllModelsList {
    public List<BaseModel> listOfAllHouse;
    public CreateAllModelsList(){
        listOfAllHouse=Stream.of(new House("HouseNumberOne", 2, 5, 156, 567),
                new House("HouseNumberTwo", 1, 4, 123, 234),
                new House("HouseNumberThree", 3, 4, 100, 125),
                new House("HouseNumberFour", 2, 5, 123, 567),
                new House("HouseNumberFive", 2, 5, 123, 567),
                new House("HouseNumberSix", 2, 5, 123, 567),
                new VillaHouse("VillaHouseNumberOne", 2, 5, 123, 567),
                new VillaHouse("VillaHouseNumberTwo", 2, 5, 123, 567),
                new VillaHouse("VillaHouseNumberThree", 2, 5, 123, 567),
                new VillaHouse("VillaHouseNumberFour", 2, 5, 123, 567),
                new VillaHouse("VillaHouseNumberFive", 2, 5, 123, 567),
                new VillaHouse("VillaHouseNumberSix", 2, 5, 123, 567),
                new SummerHouse("SummerHouseOne", 2, 5, 123, 567),
                new SummerHouse("SummerHouseTwo", 2, 5, 123, 567),
                new SummerHouse("SummerHouseThree", 1, 5, 123, 567),
                new SummerHouse("SummerHouseFour", 4, 8, 250, 799),
                new SummerHouse("SummerHouseFive", 1, 4, 98, 165),
                new SummerHouse("SummerHouseSix", 1, 1, 76, 90)
                ).collect(Collectors.toList());
    }

}
