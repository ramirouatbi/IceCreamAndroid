package com.example.icecream.Presenter;

import com.example.icecream.View.IStationView;
import com.example.icecream.Model.Station;

public class StationPresenter implements IStationPresenter{

    IStationView stationView;

    public StationPresenter (IStationView stationView){
        this.stationView = stationView;
    }

    @Override
    public void varianceResult(int stationId, String date){

        Station station = new Station(stationId,date);

        if (station.getStationId()>=10)
            stationView.stationResult("VARIANCE RED");
        else
            stationView.stationResult("VARIANCE GREEN");


    }


}
