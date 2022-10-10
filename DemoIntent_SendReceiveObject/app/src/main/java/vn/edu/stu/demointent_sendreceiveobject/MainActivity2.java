package vn.edu.stu.demointent_sendreceiveobject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import vn.edu.stu.demointent_sendreceiveobject.model.Sinhvien;

public class MainActivity2 extends AppCompatActivity {
    TextView tvSv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        addCotrols();
        getDataFromIntent();
    }

    private void addCotrols() {
        tvSv = findViewById(R.id.tvSv);
    }

    private void getDataFromIntent() {
        Intent intent = getIntent();
        if (intent.hasExtra("SINH_VIEN")){
            Sinhvien sv = (Sinhvien) intent.getSerializableExtra("SINH_VIEN");
            tvSv.setText(sv.toString());
        }
    }
}