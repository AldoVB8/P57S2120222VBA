package mx.edu.tesoem.isc.p57s2120222vba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    Handler manejador = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manejador.postDelayed(autocambiar,3000);
    }
    Runnable autocambiar = new Runnable() {
        @Override
        public void run() {
            Intent intent = new Intent(MainActivity.this,Principal.class);
            startActivity(intent);
            finish();
        }
    };
}