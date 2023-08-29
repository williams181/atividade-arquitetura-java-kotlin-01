package com.example.test;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.content.ComponentName;
import android.content.pm.PackageManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnDisableActivities = findViewById(R.id.btnDisableActivities);
        btnDisableActivities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityUtils.disableActivities(MainActivity.this);
            }
        });

        Button btnEnableActivities = findViewById(R.id.btnEnableActivities);
        btnEnableActivities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityUtils.enableActivities(MainActivity.this);
            }
        });

        // Na Activity1
        Button btnNext = findViewById(R.id.buttonGoToActivity2);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                intent.putExtra("activityNumber", 1);
                intent.putExtra("contactName", "primeiroContato"); // Passa o nome do primeiro contato
                startService(intent);
                startActivity(intent);
            }
        });

        Button btnStopService = findViewById(R.id.btnStopService);
        btnStopService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent serviceIntent = new Intent(MainActivity.this, MyService.class);
                stopService(serviceIntent);
            }
        });

    }
}