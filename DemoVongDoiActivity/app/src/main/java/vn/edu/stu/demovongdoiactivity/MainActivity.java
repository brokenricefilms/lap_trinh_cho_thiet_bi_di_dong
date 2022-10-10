package vn.edu.stu.demovongdoiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void xuLyCheMotPhan(View view) {
        Intent intent = new Intent(MainActivity.this, CheMotPhanActivity.class);
        startActivity(intent);
    }

    public void xuLyCheToanBo(View view) {
        Intent intent = new Intent(MainActivity.this, CheToanBoActivity.class);
        startActivity(intent);
    }

    public void xuLyThoat(View view) {
        finish();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart được gọi", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart được gọi", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy được gọi", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause được gọi", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop được gọi", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume được gọi", Toast.LENGTH_SHORT).show();
    }
}