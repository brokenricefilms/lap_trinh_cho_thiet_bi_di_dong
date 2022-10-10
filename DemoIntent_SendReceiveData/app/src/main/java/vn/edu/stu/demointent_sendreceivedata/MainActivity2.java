package vn.edu.stu.demointent_sendreceivedata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView txtData = findViewById(R.id.txtData);
        Intent intent = getIntent();
        if (intent.hasExtra("DATA")){
            int data = intent.getIntExtra("DATA", -1);
            txtData.setText(data + "");
        }
    }
}