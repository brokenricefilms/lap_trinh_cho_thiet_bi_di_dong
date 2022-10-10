package vn.edu.stu.demointent_sendreceivereturn;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    TextView tvX;
    Button btnTra;

    int x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        addControls();
        addEvents();
        getDataFromIntent();
    }

    private void addControls() {
        tvX = findViewById(R.id.tvX);
        btnTra = findViewById(R.id.btnTra);
    }

    private void addEvents() {
        btnTra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = getIntent();
                intent.putExtra("BINH_PHUONG", x * x);
                setResult(Activity.RESULT_OK, intent);
                finish();
            }
        });
    }

    private void getDataFromIntent() {
        Intent intent = getIntent();
        if (intent.hasExtra("X")) {
            x = intent.getIntExtra("X", 0);
            tvX.setText(x + "");
        }
    }
}