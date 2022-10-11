package vn.edu.stu.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.google.android.material.progressindicator.LinearProgressIndicator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
    }

    public void goToKbg(View view) {
        Intent intent = new Intent(this, Kbg.class);
        startActivity(intent);
    }

    public void goToDayFibonacci(View view) {
        Intent intent = new Intent(this, DayFibonacci.class);
        startActivity(intent);
    }

    public void goToThongTinSinhVien(View view) {
        Intent intent = new Intent(this, ThongTinSinhVien.class);
        startActivity(intent);
    }
}