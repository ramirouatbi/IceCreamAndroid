package com.example.icecream.Model;

public class Station implements IStation{

    private int stationId;
    private String date;

    public Station (int stationId, String date){
        this.stationId = stationId;
        this.date = date;
    }

    @Override
    public int getStationId(){
        return stationId;
    }

    @Override
    public String getDate(){
        return date;
    }




}
