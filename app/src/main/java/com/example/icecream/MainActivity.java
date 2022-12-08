package com.example.icecream;

import android.os.Bundle;

import com.example.icecream.Presenter.IStationPresenter;
import com.example.icecream.Presenter.StationPresenter;
import com.example.icecream.View.IStationView;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.icecream.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements IStationView {

    EditText station_id, datee;
    Button btn_calcule;

    IStationPresenter stationPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Init View

        station_id = (EditText) findViewById(R.id.station_id);
        datee = (EditText) findViewById(R.id.datee);
        btn_calcule = (Button) findViewById(R.id.btn_calcule);

        //Init
        stationPresenter = new StationPresenter(this);

        //Event
        btn_calcule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stationPresenter.varianceResult(Integer.valueOf(station_id.getText().toString()), datee.getText().toString());
            }
        });

    }

    @Override
    public void stationResult(String message) {
        Toast.makeText(this,message, Toast.LENGTH_SHORT).show();
    }
}