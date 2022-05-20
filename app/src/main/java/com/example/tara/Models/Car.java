package com.example.tara.Models;

public class Car  {
    public String exterior1Url, bmy, location, priceRate, userId, carId;

    Car(){ }

    public Car(String exterior1Url, String bmy, String location, String priceRate){
        this.exterior1Url = exterior1Url;
        this.bmy = bmy;
        this.location = location;
        this.priceRate = priceRate;
        this.carId =carId;
    }


    public String getCarUrl() {
        return exterior1Url;
    }

    public String getBmy() {
        return bmy;
    }

    public String getLocation() {
        return location;
    }

    public String getPriceRate() {
        return priceRate;
    }

}
