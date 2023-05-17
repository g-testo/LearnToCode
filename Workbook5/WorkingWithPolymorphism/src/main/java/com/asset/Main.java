package com.asset;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();

        House myHouse = new House(
                "My pretty house",
                "May 16, 23",
                200_000,"123 Forth ave",
                2,
                10_000,
                5_000
        );
        Vehicle myVehicle = new Vehicle(
                "My pretty vehicle",
                "May 15, 23",
                20_000,
                "Honda Civic",
                2020,
                50_000
        );
        assets.add(myHouse);
        assets.add(myVehicle);

        for(int i=0;i<assets.size();i++){
            // iterator/index: i
            // value: assets.get(i)
            System.out.println(assets.get(i).getValue());
        }

        for(Asset asset: assets){
            // value: asset
            System.out.println(asset.getValue());
        }

    }
}
