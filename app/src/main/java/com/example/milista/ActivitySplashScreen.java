package com.example.milista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class ActivitySplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //Para que se muestre la pantalla un cierto tiempo
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //Se mostrara despues de la pantalla principal
                Intent intent = new Intent(ActivitySplashScreen.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 5000); //Tiempo en el cual se va a mostrar
    }
}