package com.sample.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sk1067 on 4/10/2018.
 */
public class DrinkSelector {

    public List getAvailableBrands(DrinkType type){

        List brands = new ArrayList();

        if(type.equals(DrinkType.SOFTDRINKS)){
            brands.add("Coca Cola");
            brands.add(("Brovento"));

        }else if(type.equals(DrinkType.HOTBEVERAGES)){
            brands.add("Green Tea");
            brands.add("Ginger Tea");

        }else if(type.equals(DrinkType.FRUITJUICES)){
            brands.add("Apple");

        }else {
            brands.add("No Brand Available");
        }
        return brands;
    }
}
