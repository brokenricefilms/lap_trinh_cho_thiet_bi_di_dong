package vn.edu.stu.demomultilingual;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnClick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        addEvents();
    }

    private void addControls() {
        btnClick = findViewById(R.id.btnClick);
    }

    private void addEvents() {
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xuLyClick();
            }
        });
    }

    private void xuLyClick() {
        Toast.makeText(
                MainActivity.this,
                R.string.str_take_break,
                Toast.LENGTH_LONG
        ).show();
    }
}