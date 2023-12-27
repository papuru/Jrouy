package com.example.platinumhan.data;

import java.util.ArrayList;

public class Cloth {
    private String clothName;

    private String clothPrice;


    public Cloth(String clothName, String clothPrice) {
        this.clothName = clothName;
        this.clothPrice = clothPrice;
    }

    public String getClothName() {
        return clothName;
    }

    public String getClothPrice() {
        return clothPrice;
    }

    public static int lastId = 1;

    public static ArrayList<Cloth> genClothList(int counts) {
        ArrayList<Cloth> cloths = new ArrayList<>();
        for (int i = 0; i < counts; i++) {
            cloths.add(new Cloth("羽绒服" + lastId++, "36.5$"));
        }
        return cloths;
    }
}
